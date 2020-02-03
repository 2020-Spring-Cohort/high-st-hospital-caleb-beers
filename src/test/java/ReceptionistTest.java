import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ReceptionistTest {

    private Receptionist underTest = new Receptionist("underTest", 0);

    @BeforeEach
    void setUp() {
        Receptionist underTest = new Receptionist("underTest",0);
    }

    @Test
    public void paySalaryShouldChangePaidStatus(){
        underTest.paySalary();
        assert(underTest.beenPaid = true);
    }

}