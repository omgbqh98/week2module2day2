
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(1,4);
        shapes[2] = new Square(2);

        System.out.println("truoc luc tang: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println("sau khi tang: ");
        for (Shape shape : shapes) {
            shape.resize(30);
            System.out.println(shape);
        }
    }


}
