package chapterThree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

public class AirConditionerTest {
    
@Test
public void airConditionerCanIncreaseTemperatureTest(){

AirConditioner airConditioner = new AirConditioner();

airConditioner.increaseTemperature();

int temperature = airConditioner.getTemperature();
assertEquals(1, temperature);

}
@Test
public void acCanBeTurnedOnTest(){

    AirConditioner airConditioner = new AirConditioner();

    airConditioner.turnItOn();

     boolean on = airConditioner.isOn();
     assertEquals(true, on);



}

@Test
public void acCanBeTurnedOffTest(){
    //given
    AirConditioner airConditioner = new AirConditioner();
    airConditioner.turnItOn();
    assertEquals(true, airConditioner.isOn());

    //when
    airConditioner.turnItOff();

    //check
    assertFalse(airConditioner.isOn());

}
@Test
public void defaultTemperautureWhenAirConditionerIsOnTest(){
    AirConditioner airConditioner = new AirConditioner();
    
    //when
    airConditioner.turnItOn();

   
    
    int temperature = airConditioner.getTemperature();
    assertEquals(16, temperature);

}
@Test
public void decreaseTemperatureTest(){
    AirConditioner airConditioner = new AirConditioner();
    airConditioner.turnItOn();
    airConditioner.increaseTemperature();

    airConditioner.decreaseTemperature();
    int temperature = airConditioner.getTemperature();
    assertEquals(16, temperature);

}
@Test
public void temperatureCannotDecreaseBelowSixteenTest(){
    AirConditioner airConditioner = new AirConditioner();
    airConditioner.turnItOn();
    airConditioner.decreaseTemperature();

    int temperature = airConditioner.getTemperature();
    assertEquals(16, temperature);
    
}
@Test
public void temperatureCannotIncreaseAboveThirty(){
    AirConditioner airConditioner = new AirConditioner();
    airConditioner.turnItOn();
    airConditioner.increaseTemperature();
    airConditioner.increaseTemperature();
    airConditioner.increaseTemperature();
    airConditioner.increaseTemperature();
    airConditioner.increaseTemperature();
    airConditioner.increaseTemperature();
    airConditioner.increaseTemperature();
    airConditioner.increaseTemperature();
    airConditioner.increaseTemperature();
    airConditioner.increaseTemperature();
    airConditioner.increaseTemperature();
    airConditioner.increaseTemperature();
    airConditioner.increaseTemperature();
    airConditioner.increaseTemperature();
    int temperature = airConditioner.getTemperature();
    assertEquals(30, temperature);
    

    temperature = airConditioner.getTemperature();
    assertEquals(30, temperature);
}

}

