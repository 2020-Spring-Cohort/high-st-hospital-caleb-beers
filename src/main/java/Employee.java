public abstract class Employee {
    protected boolean beenPaid; //this attribute is protected b/c it must be exposed to subclasses
    protected String name;
    protected int employeeNumber;

    protected Employee(String name, int employeeNumber){
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    protected void drawBlood(Patient patient){ //by default this method does nothing. Only doc/nurse have overrides that work.
        System.out.println(this.name + " is not a medical professional and cannot draw blood.");
    }

    protected abstract void paySalary(); //salary will be different w/t each subclass
}
