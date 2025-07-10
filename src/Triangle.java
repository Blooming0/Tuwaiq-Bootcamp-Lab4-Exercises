public class Triangle extends Shape{
    private double height;
    private double base;

    public Triangle(int x , int y ,double height, double base) {
        super(x,y);
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
    //TODO
    @Override
    public double calculateCircumference() {
        //In an equilateral triangle:All 3 sides are equal.

        return base * 3 ;
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "Position = (" + getX() + ", " + getY() + "), " +
                "Height = " + height + ", " +
                "Base = " + base + ", " +
                "Area = " + calculateArea() + ", " +
                "Circumference = " + calculateCircumference() +
                '}';
    }
}
