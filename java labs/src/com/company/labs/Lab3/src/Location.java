import java.util.Objects;
/**
 * Этот класс представляет определенное местоположение на 2D-карте. Координаты таковы
 * целочисленное значение.
 **/
public class Location {
    /** X координата этого места **/
    public int xCoord;

    /** Y координата этого места **/
    public int yCoord;


    /** Создает новое местоположение с заданными целочисленными координатами. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Создает новое местоположение с координатами  (0, 0). **/
    public Location()
    {
        this(0, 0);
    }
    public boolean equals(Object o) {
        if (this == o) return true;                                                                                                              // если текущее положение и переданное равны возвращает тру
        if (o == null || getClass() != o.getClass()) return false;                                                                               // если переданный обьект = 0 или значения не равны возвращает фолс
        Location location = (Location) o;                                                                                                        // переприсваивает значения координат с ранеее запомненых на переданные
        return xCoord == location.xCoord &&
                yCoord == location.yCoord;
    }

    public int hashCode() {
        return Objects.hash(xCoord, yCoord);                                                                                                                 //hash код нужен для того что бы понимать разные ли обьекты мы передаем или нет, у разных обьектов он разный
    }
}
