import java.util.HashMap;

public  class HospitalApplication {

    public void listEmployees(HashMap<Integer, Employee> employees){
        for(int i = 1 ; i <= 5 ; i++){
            System.out.println(i + " " + employees.get(i).name);
        }
    }

    public void drawBloodFromPatient(Employee employee, Patient patient){ //calls employee's draw blood method on the given patient
        employee.drawBlood(patient);
    }

        public static void main(String[] args) {
        Doctor hans = new Doctor("Hans","Radiologist",1);
        Doctor linus = new Doctor("Linus","Oncologist",2);
        Nurse jessica = new Nurse("Jessica",3);
        Receptionist sarah = new Receptionist("Sarah",4);
        Janitor harry = new Janitor("Harry",5);

        Patient patientOne = new Patient();
        Patient patientTwo = new Patient();

        HashMap<Integer,Employee> employees = new HashMap<>();

        employees.put(1,hans);
        employees.put(2,linus);
        employees.put(3,jessica);
        employees.put(4,sarah);
        employees.put(5,harry);

    }
}
