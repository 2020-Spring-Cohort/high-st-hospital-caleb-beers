import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    private Doctor underTest = new Doctor("underTest", "LOL",0);
    private Patient patient = new Patient();

    @BeforeEach
    void setUp() {
        Doctor underTest = new Doctor("underTest","LOL",0);
    }

    @Test
    public void paySalaryShouldChangePaidStatus(){
        underTest.paySalary();
        assert(underTest.beenPaid = true);
    }

    @Test
    public void drawBloodShouldReducePatientBlood(){
        underTest.drawBlood(patient);
        assert(patient.getBLOOD_LEVEL() == 18);
    }

    @Test
    public void drawBloodShouldIncreasePatientHealth(){
        underTest.drawBlood(patient);
        assert(patient.getHEALTH_LEVEL() == 15);

    }



}