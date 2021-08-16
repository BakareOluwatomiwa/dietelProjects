package chapterThree;

public class HollowSquare2 {

    public static void main(String[]args){

        HollowSquare2.printStraightLine();
        System.out.printf("%n");
        for(int counter = 1;counter<=3;counter++){
            HollowSquare2.printHollowStraightLine();
            System.out.printf("%n");
        }
        HollowSquare2.printStraightLine();

    }
    public static void printStraightLine(){
    
        for(int counter = 1; counter <= 5; counter++){

            System.out.printf("* ",counter);
        }
  
}

    public static void printHollowStraightLine(){

        for(int number = 1; number <= 5;number++){
            if(number == 1 || number == 5){
                System.out.printf("* ",number);
            }
            else{
                System.out.printf("  ",number);
            }
        }
    }
}
