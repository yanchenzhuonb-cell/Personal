import java.util.Scanner;

// Define the base class Shape
class Shape {
    public String name;
    // TODO: Add a constructor that takes the shape's name as a parameter
    public Shape(String name){
        this.name = name;
    }
    public String getName() {
    return name;
    }
    // TODO: Add a getter method to retrieve the shape's name

}

// Define the derived class Rectangle
class Rectangle extends Shape {
    // TODO: Add a constructor that takes the shape's name, width, and height as parameters
    int width;
    int height;
    public Rectangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    // TODO: Call the base class constructor using the super keyword
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public String getName(){
        if(width == height){
            return "Square";

        }
        return "Rectangle";
    }

    // TODO: Add getter methods to retrieve the rectangle's width and height

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1  = scanner.nextLine();
        // TODO: Read the shape's name, width, and height from the user input
        int line2 = scanner.nextInt();
        int line3 = scanner.nextInt();
        // TODO: Create a Rectangle object using the user input
        Rectangle rectangle = new Rectangle(line1, line2, line3);
        // TODO: Print out the rectangle's name, width, and height
        System.out.println("Name: " + rectangle.getName());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());

    }
}