public class ComplexNum {
    public double rl;
    public double im;

    public ComplexNum(double rl, double im){
        this.rl = rl;
        this.im = im;
    }

    public double getSquaredModule() {
        return (this.rl * this.rl + this.im * this.im);
    }

    public void makeSquaredInPoint(double x, double y) {
        double real = (rl * rl) - (im * im) + x;
        double imagine = 2 * rl * im + y;

        rl = real;
        im = imagine;
    }
}