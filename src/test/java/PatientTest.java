import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PatientTest {
    Patient underTest = new Patient();

    @BeforeEach
    void setUp(){
        Patient underTest = new Patient();
    }

    @Test
    void getBloodShouldReturnBloodLevelAtDefault(){
        assert(underTest.getBLOOD_LEVEL() == 20);//20 is default blood level
    }

    @Test
    void getHealthLevelShouldReturnHealthLevelAtDefault(){
        assert(underTest.getHEALTH_LEVEL() == 10);
    }

    @Test
    void setBloodLevelShouldChangeBloodLevel(){
        underTest.setBLOOD_LEVEL(10);
        assert(underTest.getBLOOD_LEVEL() == 10);
    }

    @Test
    void setHealthLevelShouldChangeHealthLevel(){
        underTest.setHEALTH_LEVEL(5);
        assert(underTest.getHEALTH_LEVEL() == 5);
    }

}