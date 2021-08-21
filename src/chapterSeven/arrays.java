package chapterSeven;

public class arrays {
    private static int[] numbers = {1,2,3,4,5,6,7,8,9,7};

    public static void main(String[] args) {

        int total = 0;
        int multiply = 1;
        int average = 0;
        int largestNumber = 0;
        System.out.print(sum());

        for(int counter=0; counter < numbers.length;counter++){
            
               total += sum(numbers[counter]);
        }
        System.out.printf("sum is %d%n",total);
        
        for(int counter = 0;counter < numbers.length;counter++){
            multiply *= multiplication(numbers[counter]);

        }
        System.out.printf("multiplication is %d%n",multiply);

        
        for(int counter=0; counter < numbers.length;counter++){
            
            average += sum(numbers[counter]);
        }
            int division = average / numbers.length;
            System.out.printf("average is %d",division);

        for(int counter =0;counter<numbers.length;counter++){


        }
            // int total = 0;
            // int multiplication = 1;
            // int average = 0;

        // for(int counter = 0;counter < numbers.length;counter ++){
        //     sum += numbers[total];
        //     total += 1;    

        // }    

        //     System.out.printf("sum is %d%n",sum);

        // for(int counter = 0;counter < numbers.length;counter ++){
        //     multiplication *= numbers[counter];
        // }
        //     System.out.printf("multiplication is %d%n",multiplication);

        
        // for(int counter = 0;counter < numbers.length;counter++){
        //     average += numbers[counter];
        // }
        //     int division = average / numbers.length ;
        //     System.out.printf("average is %d%n",division);

        //     int minimum = 0;
        // for(int counter = 0; counter < numbers.length;counter ++){
        //     minimum = Math.min(numbers[0], numbers[counter]);
        //         // if(numbers[counter]  > minimum)
        //         //     numbers[counter] = minimum;
                
        // }
        
        // System.out.printf("minimum number is %d%n",minimum);
        
        //     int maximum = 0;
        // for(int counter = 1; counter < numbers.length; counter ++){
        //     maximum = Math.max(Math.max(maximum, numbers[0] ), numbers[counter]);
                
        // }
        // System.out.printf("maximum number is %d%n",maximum);

    }

    public static int sum(){
        int total = 0;
        for(int counter = 0;counter < numbers.length;counter ++){
            total += numbers[counter];
        }   
        return total; 
    }
    
    public static int multiplication(int number){
        int total = 1;
        total = total * number;
        return total;
    }
    public static int max(int number1,int number2){
        int largest = Math.max(number1, number2);
        return largest;
    }

    

    
}
