package chapterThree;

public class TestDriller {

    public static int priceForCopies(int numberOfCopies){
        if(numberOfCopies >0 && numberOfCopies <5){
            return numberOfCopies * 1500;
        }
        if(numberOfCopies >4 && numberOfCopies <10){
            return numberOfCopies * 1400;
        }
        if(numberOfCopies >9 && numberOfCopies <30){
            return numberOfCopies * 1200;
        }
        if(numberOfCopies >29 && numberOfCopies <50){
            return numberOfCopies * 1100;
        }
        if(numberOfCopies >49 && numberOfCopies <100){
            return numberOfCopies * 1000;
        }
        if(numberOfCopies >99 && numberOfCopies <200){
            return numberOfCopies * 900;
        }
        if(numberOfCopies >= 200){
            return numberOfCopies * 800;
        }

            return 0;
    }
    
}
