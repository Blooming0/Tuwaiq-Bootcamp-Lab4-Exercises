public class Main {
    public static void main(String[] args) {

        //Circle Test
        // Create a Circle object
        Circle c1 = new Circle(5, 5, 3.1415);

        // Accessor
        System.out.println("Initial Radius: " + c1.getRadius());

        // Mutator
        c1.setRadius(4.567);
        System.out.println("Updated Radius: " + c1.getRadius());

        // Area and Circumference
        double circleArea = c1.calculateArea();
        double circleCircumference = c1.calculateCircumference();

        // Print with 2 decimal places
        System.out.printf("Area: %.2f\n", circleArea);
        System.out.printf("Circumference: %.2f\n", circleCircumference);

        // toString
        System.out.println(c1.toString());
        System.out.println();

        /////////////////////////////////////////////////////////////////////////////////
        //Rectangle Test
        // Create a Rectangle object
        Rectangle r1 = new Rectangle(0, 0, 5.456, 3.789);

        // Accessors (getters)
        System.out.println("Initial Height: " + r1.getHeight());
        System.out.println("Initial Width: " + r1.getWidth());

        // Mutators (setters)
        r1.setHeight(7.123);
        r1.setWidth(4.555);
        System.out.println("Updated Height: " + r1.getHeight());
        System.out.println("Updated Width: " + r1.getWidth());

        // Area and Circumference
        double rectangleArea = r1.calculateArea();
        double rectangleCircumference = r1.calculateCircumference();

        // Format to 2 decimal places
        System.out.printf("Area: %.2f\n", rectangleArea);
        System.out.printf("Circumference: %.2f\n", rectangleCircumference);

        // toString output
        System.out.println(r1.toString());




        ////////////////////////////////////////////////////////////////////////////////////




        //Triangle Test
        // Create Triangle object
        Triangle t1 = new Triangle(2, 3, 4.0, 5.0);

        // Test accessors
        System.out.println("Initial Height: " + t1.getHeight());
        System.out.println("Initial Base: " + t1.getBase());

        // Test mutators
        t1.setHeight(6.0);
        t1.setBase(7.0);
        System.out.println("Updated Height: " + t1.getHeight());
        System.out.println("Updated Base: " + t1.getBase());

        // Area and Perimeter
        System.out.printf("Area: %.2f\n", t1.calculateArea());
        System.out.printf("Circumference: %.2f\n", t1.calculateCircumference());

        // toString
        System.out.println(t1.toString());


    }
}