public class Rectangle extends Shape {
    private double height ;
    private double width;

    public Rectangle(int x , int y ,double height, double width) {
        super(x,y);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculateCircumference() {
        return  2 * (height + width);
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "Position = (" + getX() + ", " + getY() + "), " +
                "Height = " + height + ", " +
                "Width = " + width + ", " +
                "Area = " + calculateArea() + ", " +
                "Circumference = " + calculateCircumference() +
                '}';
    }
}
