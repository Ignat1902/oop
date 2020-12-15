import java.util.HashMap;
import java.util.HashSet;
/**
 * Этот класс содержит реализацию алгоритма поиска пути A*. Алгоритм
 * реализован как статический метод, так как алгоритм поиска пути
 * действительно не нужно поддерживать какое-либо состояние между вызовами алгоритма
 */
public class AStarPathfinder {
    /**
     * Эта константа содержит максимальный предел отсечения для стоимости путей. Если
     *  если конкретная путевая точка превышает этот предел затрат, то путевая точка
     *  отбрасывается.
     **/
    public static final float COST_LIMIT = 1e6f;


    /**
     Пытается вычислить путь, который перемещается между начальным и конечным местоположениями
     * указанной карты. Если путь может быть найден, возвращается путевая точка последнего
     шага пути ;эта путевая точка может быть использована для обратного перехода к начальной точке.
     Если путь не найден, возвращается
     * <code>null</code>.
     **/
    public static Waypoint computePath(Map2D map)
    {
        // Variables necessary for the A* search.
        AStarState state = new AStarState(map);
        Location finishLoc = map.getFinish();

        // Set up a starting waypoint to kick off the A* search.
        Waypoint start = new Waypoint(map.getStart(), null);
        start.setCosts(0, estimateTravelCost(start.getLocation(), finishLoc));
        state.addOpenWaypoint(start);

        Waypoint finalWaypoint = null;
        boolean foundPath = false;

        while (!foundPath && state.numOpenWaypoints() > 0)
        {
            // Find the "best" (i.e. lowest-cost) waypoint so far.
            Waypoint best = state.getMinOpenWaypoint();

            // If the best location is the finish location then we're done!
            if (best.getLocation().equals(finishLoc))
            {
                finalWaypoint = best;
                foundPath = true;
            }

            // Add/update all neighbors of the current best location.  This is
            // equivalent to trying all "next steps" from this location.
            takeNextStep(best, state);

            // Finally, move this location from the "open" list to the "closed"
            // list.
            state.closeWaypoint(best.getLocation());
        }

        return finalWaypoint;
    }

    /**
     * Этот статический вспомогательный метод берет путевую точку и генерирует все допустимые "далее
     * шаги " от этой путевой точки. Новые путевые точки добавляются в раздел " открыть
     коллекция passed-in A* state object.
     **/
    private static void takeNextStep(Waypoint currWP, AStarState state)
    {
        Location loc = currWP.getLocation();
        Map2D map = state.getMap();

        for (int y = loc.yCoord - 1; y <= loc.yCoord + 1; y++)
        {
            for (int x = loc.xCoord - 1; x <= loc.xCoord + 1; x++)
            {
                Location nextLoc = new Location(x, y);

                // Если "следующее местоположение" находится за пределами карты, пропустите его.
                if (!map.contains(nextLoc))
                    continue;

                // Если "следующее место" - это это место, пропустите его.
                if (nextLoc == loc)
                    continue;

                // Если это место уже находится в" закрытом " наборе
                // затем перейдите к следующему местоположению.
                if (state.isLocationClosed(nextLoc))
                    continue;

                // Сделайте путевую точку для этого " следующего местоположения."

                Waypoint nextWP = new Waypoint(nextLoc, currWP);

                // Хорошо, мы обманываем и используем стоимость затрат для вычисления фактической стоимости.
                // стоимость из предыдущей ячейки. Затем мы добавляем стоимость от
                // ячейка карты, в которую мы входим, чтобы включить барьеры и т. д.
                float prevCost = currWP.getPreviousCost() +
                        estimateTravelCost(currWP.getLocation(),
                                nextWP.getLocation());

                prevCost += map.getCellValue(nextLoc);

                // // Пропустите это "следующее местоположение", если оно слишком дорогое.
                if (prevCost >= COST_LIMIT)
                    continue;

                nextWP.setCosts(prevCost,
                        estimateTravelCost(nextLoc, map.getFinish()));

                // Добавьте путевую точку в набор открытых путевых точек. Если есть
                // оказывается, что для этого местоположения уже есть путевая точка, новая
                // путевая точка заменяет старую только в том случае, если она менее затратна
                // чем старый.
                state.addOpenWaypoint(nextWP);
            }
        }
    }

    /**
     * Оценивает стоимость поездки между двумя указанными точками.
     * Вычисленная фактическая стоимость - это просто расстояние по прямой между двумя
     точками.
     **/
    private static float estimateTravelCost(Location currLoc, Location destLoc)
    {
        int dx = destLoc.xCoord - currLoc.xCoord;
        int dy = destLoc.yCoord - currLoc.yCoord;

        return (float) Math.sqrt(dx * dx + dy * dy);
    }
}
