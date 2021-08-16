package chapterThree;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KataTest{

    @Test
    public void kata_canAddTwoNumbersTest(){
        Kata kata = new Kata();
        assertEquals(4, kata.add(2,2));


    }

    @Test

    public void GradeATest(){
     Kata kata= new Kata();
     assertEquals("A", kata.numberGrade(99));


    }

    @Test

    public void GradeBTest(){
     Kata kata= new Kata();
     assertEquals("B", kata.numberGrade(86));

    } 
    @Test

    public void GradeCTest(){
     Kata kata= new Kata();
     assertEquals("C", kata.numberGrade(75));

    } 

    @Test

    public void GradeDTest(){
     Kata kata= new Kata();
     assertEquals("D", kata.numberGrade(61));

    } 
    @Test

    public void FailTest(){
     Kata kata= new Kata();
     assertEquals("F", kata.numberGrade(50));

    } 

    
}
