package chapterSeven;

public class arrays {
    private static int[] numbers = {1,2,3,4,5,6,7,8,9,7};

    public static void main(String[] args) {

        
        System.out.printf("sum is %d%n",sum());
        System.out.printf("multiplicion is %d%n",multiplication());
        System.out.printf("largest number is %d%n",max());
        System.out.printf("smallest number is %d%n",min());
        System.out.printf("Average is %d",average());
    }

    public static int sum(){
        int total = 0;
        for(int counter = 0;counter < numbers.length;counter ++){
            total += numbers[counter];
        }   
        return total; 
    }
    
    public static int multiplication(){
        int total = 1;
        for(int counter = 0;counter<numbers.length;counter++){
            total *= numbers[counter];
        }
        return total;
    }
    public static int max(){
        int maximum = 0;
        for(int counter = 0;counter <numbers.length;counter ++){
            maximum = Math.max(Math.max(maximum ,numbers[0]) ,numbers[counter]);
        }
        return maximum;
    }
    public static int min(){
        int minimum = 0;
        for(int counter = 0; counter<numbers.length;counter ++){
            minimum = Math.min(numbers[0], numbers[counter]);
        }
        return minimum;
    }
    public static int average(){
        int total = 0;
        for(int counter = 0;counter < numbers.length;counter ++){
            total += numbers[counter];
        }   
        int average = total / numbers.length;
        return average;
    }

    

    
}
