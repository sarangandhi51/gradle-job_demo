import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void testMessage() {
        Hello obj = new Hello();

        assertEquals(
            "Hello Jenkins Gradle!",
            obj.message()
        );
    }
}