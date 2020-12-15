
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Этот класс представляет собой простую двумерную карту, состоящую из квадратных ячеек.
 * Каждая ячейка определяет стоимость обхода этой ячейки.
 **/
public class Map2D {
    /** Ширина карты. **/
    private int width;

    /** Высота карты. **/
    private int height;

    /**
     * Фактические данные, необходимые алгоритму pathfinding для работы.
     **/
    private int[][] cells;

    /** Начальное место для выполнения поиска пути A* pathfinding. **/
    private Location start;

    /** Конечное место для выполнения поиска пути A* pathfinding. **/
    private Location finish;


    /** Создает новую 2D-карту с заданными шириной и высотой. **/
    public Map2D(int width, int height)
    {
        if (width <= 0 || height <= 0)
        {
            throw new IllegalArgumentException(
                    "width and height must be positive values; got " + width +
                            "x" + height);
        }

        this.width = width;
        this.height = height;

        cells = new int[width][height];

        // Make up some coordinates for start and finish.
        start = new Location(0, height / 2);
        finish = new Location(width - 1, height / 2);
    }


    /**
     * Этот вспомогательный метод проверяет указанные координаты, чтобы увидеть, находятся ли они:
     * в пределах границ карты. Если координаты не находятся в пределах карты
     * затем метод выдает исключение <code>IllegalArgumentException</code>.
     **/
    private void checkCoords(int x, int y)
    {
        if (x < 0 || x > width)
        {
            throw new IllegalArgumentException("x must be in range [0, " +
                    width + "), got " + x);
        }

        if (y < 0 || y > height)
        {
            throw new IllegalArgumentException("y must be in range [0, " +
                    height + "), got " + y);
        }
    }

    /** Возвращает ширину карты. **/
    public int getWidth()
    {
        return width;
    }

    /** Возвращает высоту карты. **/
    public int getHeight()
    {
        return height;
    }

    /**
     * Возвращает true, если указанные координаты содержатся на карте
     * area.
     **/
    public boolean contains(int x, int y)
    {
        return (x >= 0 && x < width && y >= 0 && y < height);
    }


    /** Возвращает true, если местоположение содержится в области карты. **/
    public boolean contains(Location loc)
    {
        return contains(loc.xCoord, loc.yCoord);
    }

    /** Возвращает сохраненное значение для указанной ячейки. **/
    public int getCellValue(int x, int y)
    {
        checkCoords(x, y);
        return cells[x][y];
    }

    /** Возвращает сохраненное значение для указанной ячейки. **/
    public int getCellValue(Location loc)
    {
        return getCellValue(loc.xCoord, loc.yCoord);
    }

    /** Устанавливает значение для указанной ячейки. **/
    public void setCellValue(int x, int y, int value)
    {
        checkCoords(x, y);
        cells[x][y] = value;
    }

    /**
     * Возвращает начальное местоположение карты. Именно здесь генерируется
     * путь начнется с.
     **/
    public Location getStart()
    {
        return start;
    }

    /**
     * Задает начальное местоположение карты. Вот где сгенерированный путь
     * начнем с.
     **/
    public void setStart(Location loc)
    {
        if (loc == null)
            throw new NullPointerException("loc cannot be null");

        start = loc;
    }

    /**
     * Возвращает конечное местоположение карты. Именно здесь генерируется
     * путь закончится.
     **/
    public Location getFinish()
    {
        return finish;
    }

    /**
     * Задает конечное местоположение карты. Вот где сгенерированный путь
     * Закончится
     **/
    public void setFinish(Location loc)
    {
        if (loc == null)
            throw new NullPointerException("loc cannot be null");

        finish = loc;
    }
}
