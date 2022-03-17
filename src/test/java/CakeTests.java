import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CakeTests {
    Cake sut;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        sut = new Cake("bon ami", 2, "клубника");

    }

    @BeforeAll
    public static void started() {
        System.out.println("tests started");
    }

    @AfterEach
    public void finished() {
        System.out.println("test completed");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("tests completed");
    }

    @Test
    public void testSetWeight() {
        sut.setWeight(3);
        assertEquals(3, sut.getWeight());
    }

    @Test
    public void testIsChocolate() {
        assertFalse(sut.isChocolate());
    }

    @ParameterizedTest
    @ValueSource(strings = {"На любителя", "Сезонный", "Популярный"})
    void testSetRating(String rating) {
        sut.setRating(rating);
        assertEquals(rating, sut.getRating());
    }
}
