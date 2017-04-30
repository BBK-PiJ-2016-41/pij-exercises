import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
public class HospitalTest {/*
  @Test
  public void testsHospitalEmpty() {
    HospitalManager firstHospital = new HospitalManager();
    assertEquals(0, firstHospital.getNoPatients());
  }*/

  @Test
  public void testsPatients() {
    HospitalManager myHospital = new HospitalManager();
    Patient john = new Patient("John",25,"Appendicitis");
    myHospital.addPatient(john);
    assertEquals(1, myHospital.getNoPatients());
    Patient sarah = new Patient ("Sarah",70,"Broken hip");
    myHospital.addPatient(sarah);
    assertEquals(2, myHospital.getNoPatients());
    assertFalse(myHospital.deletePatient("Steve"));
    /*
    myHospital.deletePatient("John");
    assertEquals(1, myHospital.getNoPatients());
    */
  }
}
