package efrei.m1.devops.concepts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void addShouldReturnTheSum() {
        App classUnderTest = new App();
        assertEquals(5, classUnderTest.add(2, 3), "add should return the sum of its arguments");
    }

    @Test void getGreetingShouldReturnHelloWorld() {
        App classUnderTest = new App();
        assertEquals("Hello Wold!", classUnderTest.getGreeting(), "getGreeting should return 'Hello World!'");
    }

}
