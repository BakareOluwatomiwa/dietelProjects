package chapterThree;
import java.util.Scanner;

public class HollowSquare {
    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);

    for(int counter = 1; counter <= 5;counter ++){
    
            for(int number =1;number <= 5;number ++){
                if(counter == 1 || counter == 5 || number == 1 || number == 5){
                    System.out.printf("*",number);
                }
                else{
                    System.out.printf(" ",number);
                }
           }

           System.out.printf("%n");

    }

    }
    
}
