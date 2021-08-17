package chapterFour;
import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;
        int miles = 0;
        int gallons = 0;  

        System.out.println("Enter miles , 0 to stop");
            miles = inputCollector.nextInt();  
        while(miles > 0){
        
            System.out.println("Enter number of gallons");
            gallons = inputCollector.nextInt();

            totalMiles += miles;
            totalGallons += gallons;

            double milesPerGallon = miles/gallons;
            System.out.printf("miles per gallon is %f%n",milesPerGallon);
            System.out.println("Enter miles , 0 to stop");
            miles = inputCollector.nextInt();  


        }
            double totalMilesPerGallons = totalMiles/totalGallons;
            System.out.printf("total miles per gallon is %f",totalMilesPerGallons);
    }
}
