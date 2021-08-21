package chapterFive;
import java.util.Scanner;

public class factorials {
    public static void main(String[] args) {
        Scanner inputCollector= new Scanner(System.in);

            long factorial = 1;

        System.out.println("Number factorial");
        
        for(int counter = 1;counter <= 20;counter ++){
                factorial *= counter;

        System.out.printf("%d    %d%n",counter,factorial);
        }
    }
}
