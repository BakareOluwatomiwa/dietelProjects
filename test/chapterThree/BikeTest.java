package chapterThree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BikeTest {
    
    @Test
    public void bikeCanBeTurnedOnTest(){
        Bike bike = new Bike();

        bike.turnItOn();

        boolean isOn = bike.isOn();
        assertEquals(true, isOn);

    }

    @Test
    public void bikeCanBeTurnedOffTest(){
        Bike bike = new Bike();
        bike.turnItOn();
        assertEquals(true, bike.isOn());

        bike.turnItOff();

        assertEquals(false, bike.isOn());

    }

    @Test

    public void bikeCanAccelerateOnGearOneTest(){
        Bike bike = new Bike();
        bike.turnItOn();

        bike.increaseSpeed();
       
        int speed = bike.getSpeed();        
        assertEquals(1, speed);
        int gear = bike.getGear();
        assertEquals(1, gear);
    
    }
    @Test

    public void bikeCanAccelerateOnGearTwoTest(){
        Bike bike = new Bike();
        bike.turnItOn();

        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();
        bike.increaseSpeed();

        int gear = bike.getGear();
        assertEquals(2, gear);
       
        int speed = bike.getSpeed();        
        assertEquals(25, speed);
        
    }
    
    @Test

    public void gearChangesToGearThreeTest(){
        Bike bike = new Bike();
        bike.turnItOn();

        int counter;

            counter = 1;
        while(counter <= 26){

        bike.increaseSpeed();
            
            counter ++;
        }
        
        
        //System.out.println(bike.getSpeed());

        int gear = bike.getGear();
        assertEquals(3, gear);

        //int speed = bike.getSpeed();        
        //assertEquals(37, speed);

    }
   
    @Test

    public void bikeCanAccelerateOnGearThreeTest(){
        Bike bike = new Bike();
        bike.turnItOn();

        int counter;

            counter = 1;
        while(counter <= 26){

        bike.increaseSpeed();
            
            counter ++;
        }
        
        

        int gear = bike.getGear();
        assertEquals(3, gear);

        int speed = bike.getSpeed();        
        assertEquals(37, speed);

    }

    @Test

    public void gearChangesToGearFourTest(){
        Bike bike = new Bike();
        bike.turnItOn();

        int counter;

            counter = 1;
        while(counter <= 32){

        bike.increaseSpeed();
            
            counter ++;
        }
        
        

        int gear = bike.getGear();
        assertEquals(4, gear);


    }

    @Test

    public void bikeCanAccelerateOnGearFourTest(){
        Bike bike = new Bike();
        bike.turnItOn();

        int counter;

            counter = 1;
        while(counter <= 32){

        bike.increaseSpeed();
            
            counter ++;
        }
        

        int gear = bike.getGear();
        assertEquals(4, gear);

        int speed = bike.getSpeed();        
        assertEquals(63, speed);

    }
   
    @Test

    public void speedAndGearAreAtZeroWhenBikeIsOnTest(){
        Bike bike = new Bike();
        bike.turnItOn();


        int gear = bike.getGear();
        assertEquals(0, gear);
        int speed = bike.getSpeed();
        assertEquals(0, speed);

    }
   
   
    



}
