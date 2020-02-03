public class Receptionist extends Employee {
    private boolean isOnPhone;

    public Receptionist(String name, int employeeNumber) {
        super(name, employeeNumber);
    }

    @Override
    public void paySalary(){
        if(beenPaid = false){
            super.beenPaid = true;
            System.out.println(this.name + " has been paid $45,000");
        }
        System.out.println(this.name + " has been paid.");
    }

}
