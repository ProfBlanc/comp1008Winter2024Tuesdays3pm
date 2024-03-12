package wk6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    //annotation: speak to the compiler and tells it that something
    // is special about this statement: var or method

    @Test
    public void usingAssertionExample(){
        Car c1 = new Car();

        //assert => ensure a statement is.....
        assertNull(null);
        assertNotNull(c1);
        assertTrue(1 == 1 && 2 < 3);
        assertFalse(1 == 1 && 2 < 1);
    }
    @Test
    public void testSetSpeedv1(){
        Car c1 = new Car();
        double speed = 200;
        c1.setSpeed(speed);
        assertEquals(speed, c1.getSpeed());

    }
    Car c1;
    @BeforeEach
    public  void testEach(){
        c1 = new Car();
        System.out.println("Executed!");
    }
    @AfterEach
    public void destroy(){
        System.out.println("done test case");
        c1 = null;
    }

    @BeforeClass
    public  void start(){
        System.out.println("Welcome to our test cases");
    }

    @AfterClass
    public  void end(){
        System.out.println("All done!");
    }
    @Test
    public void testDefaultConstructorDefaultColor(){
        assertEquals("black", c1.getColor());
    }

    @Test
    public void testDefaultConstructorDefaultDoors(){
        assertEquals(2, c1.getDoors());
    }
    @Test
    public void testDefaultConstructorDefaultSpeed(){
        assertEquals(0, c1.getSpeed());
    }

    @ParameterizedTest
    @ValueSource(doubles = {100, 200, 150, 125.5, 400, 321.0})
    public void testSeriesOfSpeeds(double speed){
        //ints, doubles, floats, booleans, strings
        c1.setSpeed(speed);
        assertEquals(speed, c1.getSpeed());
    }
    @ParameterizedTest
    @CsvSource( {"black,2,2","blue,200,5","white,300,4"}  )
    public void test3ArgConstructor(String color, double speed, int doors){
        Car c1 = new Car(color, doors, speed);

        assertTrue(doors == c1.getDoors()
                && speed == c1.getSpeed()
        && color.equals(c1.getColor()));

    }

}