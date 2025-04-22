import java.util.Scanner;
public class Mensuration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius;
        double circum;
        double area;
        double volume;

        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        circum = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("Circumference is: " + circum);
        System.out.println("Area is: " + area);
        System.out.println("Volume is: " + volume);

        scanner.close();

    }
}