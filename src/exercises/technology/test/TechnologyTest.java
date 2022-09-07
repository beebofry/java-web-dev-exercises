package exercises.technology.test;
import exercises.technology.main.Computer;
import exercises.technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TechnologyTest {
    Computer test_computer;
    @Before
    public void createComputerObject(){
        test_computer = new Computer("Apple", 2000, 150.5);
    }

    @Test
    public void computerConstructors(){
        assertEquals("Apple", test_computer.getBrand());
        assertEquals(2000, test_computer.getYear());
        assertEquals(150.5, test_computer.getStorage(), .001);
    }

    @Test
    public void laptopConstructors(){
        Laptop test_laptop = new Laptop("Windows", 2002, 205, false);
        assertEquals("Windows", test_laptop.getBrand());
    }

}
