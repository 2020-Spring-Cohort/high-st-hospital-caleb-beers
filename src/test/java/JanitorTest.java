import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JanitorTest {
    Janitor underTest = new Janitor("underTest",0);

    @BeforeEach
    void setUp(){Janitor underTest = new Janitor("underTest",0);}

    @Test
    void paySalaryShouldChangePaidStatus(){
        underTest.paySalary();
        assert(underTest.beenPaid);
    }

}