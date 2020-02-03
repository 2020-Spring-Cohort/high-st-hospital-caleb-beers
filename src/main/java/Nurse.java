public class Nurse extends Employee {
    private int numberOfPatients;

    public Nurse(String name, int number) {
    super(name,number);
    }


    @Override
    public void paySalary(){
        if(beenPaid = false){
            super.beenPaid = true;
            System.out.println(this.name + " has been paid $50,000");
        }
        System.out.println(this.name + " has been paid.");
    }



    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public void setNumberOfPatients(int numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    @Override
    public void drawBlood (Patient patient){
        patient.setBLOOD_LEVEL( patient.getBLOOD_LEVEL() - 1 ); //decrease blood level by 1
        patient.setHEALTH_LEVEL( patient.getHEALTH_LEVEL() + 1 ); //increase health level by 2
    }


}
