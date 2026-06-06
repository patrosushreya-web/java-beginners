abstract class Shape {
    /*
     * 1. An abstract method has no body.
     * 2. An abstract method must be written inside an abstract class.
     * 3. A child class must override every abstract method.
     * 4. If the child class does not override it, the child class must also be abstract.
     * 5. We cannot create an object of an abstract class.
     * 6. An abstract class can have both abstract methods and normal methods.
     */
    abstract void area();

    void message() {
        System.out.println("This is a normal method inside an abstract class.");
    }
}

class Circle extends Shape {
    double radius = 5;

    @Override
    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of circle: " + result);
    }
}

public class java13 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.message();
        circle.area();

        System.out.println();
        System.out.println("6 Rules of abstract methods:");
        System.out.println("1. Abstract methods do not have a body.");
        System.out.println("2. Abstract methods are declared inside abstract classes.");
        System.out.println("3. Concrete child classes must override abstract methods.");
        System.out.println("4. A child class can stay abstract if it does not override them.");
        System.out.println("5. Objects of abstract classes cannot be created directly.");
        System.out.println("6. Abstract classes can contain abstract and normal methods.");
    }
}
