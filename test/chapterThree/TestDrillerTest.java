package chapterThree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestDrillerTest {

    @Test
    public void PriceForOneToFourCopiesTest(){
        // TestDriller testDriller = new TestDriller();
        // assertEquals(6000, testDriller.priceForCopies(4));

        assertEquals(3000, TestDriller.priceForCopies(2));

    }

    @Test
    public void PriceForFiveToNineCopiesTest(){
        TestDriller testDriller = new TestDriller();
        assertEquals(8400, testDriller.priceForCopies(6));
    }

    @Test
    public void PriceForTenToTwentyNineCopiesTest(){
        TestDriller testDriller = new TestDriller();
        assertEquals(16800, testDriller.priceForCopies(14));
    }

    @Test
    public void PriceForThirtyToFourtyNineCopiesTest(){
        TestDriller testDriller = new TestDriller();
        assertEquals(38500, testDriller.priceForCopies(35));
    }

    @Test
    public void PriceForFiftyToNinetyNineCopiesTest(){
        TestDriller testDriller = new TestDriller();
        assertEquals(61000, testDriller.priceForCopies(61));
    }

    @Test
    public void PriceForOneHundredToOneHundredAndNinetyNineCopiesTest(){
        TestDriller testDriller = new TestDriller();
        assertEquals(120600, testDriller.priceForCopies(134));
    }

    @Test
    public void PriceForTwentyAndAboveCopiesTest(){
        TestDriller testDriller = new TestDriller();
        assertEquals(320000, testDriller.priceForCopies(400));
    }

    @Test
    public void PriceForNoCopiesTest(){
        TestDriller testDriller = new TestDriller();
        assertEquals(0, testDriller.priceForCopies(-3));
    }
    public static void main(String[] args) {
        TestDriller testDriller = new TestDriller();
    
    System.out.print(testDriller);

    }
    
}
