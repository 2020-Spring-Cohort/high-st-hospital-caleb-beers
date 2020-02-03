public class Janitor extends Employee{
    private boolean isSweeping; //I set these booleans to private in case I want to implement the tick method for the stretch task later, which would involve a setter/getter

    public Janitor(String name, int employeeID){
        super(name, employeeID);
    }

    @Override
    public void paySalary(){
        if(beenPaid = false){
            super.beenPaid = true;
            System.out.println(this.name + " has been paid $40,000");
        }
        System.out.println(this.name + " has been paid.");
    }

}
