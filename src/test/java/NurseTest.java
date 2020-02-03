import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class NurseTest {

    private Nurse underTest = new Nurse("underTest", 0);
    private Patient patient = new Patient();

    @BeforeEach
    void setUp() {
        Nurse underTest = new Nurse("underTest",0);
    }

    @Test
    public void paySalaryShouldChangePaidStatus(){
        underTest.paySalary();
        assert(underTest.beenPaid = true);
    }

    @Test
    public void getNumberOfPatientsShouldReturnInt(){
        underTest.setNumberOfPatients(2);
        assert(underTest.getNumberOfPatients() == 2);
    }



}