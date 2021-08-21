package chapterSix;
import java.util.Scanner;

public class circleAreaApp {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        int radius;

        System.out.println("Enter radius");
        radius = inputCollector.nextInt();

            System.out.printf("Area of circle is %.2f",circleArea(radius));
    }

    public static double circleArea(int radius){
        double area = Math.PI* Math.pow(radius, 2);

            return area;
    }
    
}
