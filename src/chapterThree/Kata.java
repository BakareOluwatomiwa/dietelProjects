package chapterThree;

public class Kata {

    public int add(int i, int j) {
        return i + j;
    }

    public String numberGrade(int number){
        if(number>=90 && number <=100){
            
                return "A";
             
        }
        if(number>=80 &&  number <=89){
            return "B";
        }
        if(number>=70 && number <=79){
            return "C";
        }
        if(number>=60 && number <= 69){
            return "D";
        }
        if(number<=59 && number >=0){
            return "F";
        }

            return "Mediocre";
    
      
        

     
    }


}
