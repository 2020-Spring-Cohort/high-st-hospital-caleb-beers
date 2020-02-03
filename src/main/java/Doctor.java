public class Doctor extends Employee {
    private String specialty;

    public Doctor(String name, String specialty, int employeeNumber) {
        super(name, employeeNumber);
        this.specialty = specialty;
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void paySalary(){
        if(beenPaid = false){
            super.beenPaid = true;
            System.out.println(this.name + " has been paid $90,000");
        }
        System.out.println(this.name + " has been paid.");
    }

    @Override
    public void drawBlood (Patient patient){
        patient.setBLOOD_LEVEL( patient.getBLOOD_LEVEL() - 2 ); //decrease blood level by 1
        patient.setHEALTH_LEVEL( patient.getHEALTH_LEVEL() + 5 ); //increase health level by 2
    }




}
