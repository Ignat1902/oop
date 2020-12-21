import java.awt.geom.Rectangle2D;

public class BurningShip extends FractalGenerator {
    public static final int LIMIT = 2000;

    public void getInitialRange(Rectangle2D.Double range) {
        range.x = -2;
        range.y = -2.5;
        range.width = 4;
        range.height = 4;
    }

    public int numIterations(double x, double y) {
        ComplexNum cmplx = new ComplexNum(0, 0);
        int iterator = 0;

        while (iterator < LIMIT && cmplx.getSquaredModule() < 4) {
            cmplx.makeSquaredWithAbsInPoint(x, y);

            iterator++;
        }

        if (iterator == LIMIT) return -1;

        return iterator;
    }

    @Override
    public String toString() { return "Burning Ship"; }
}
