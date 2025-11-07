package classes_objetos_metodos.Hinheritence.domain;

public class Manager extends Employee {
    private String department;

    static {
        System.out.println("Inside manager static init block");
        // Static blocks are the first thing to initialized
    }

    {
        System.out.println("Inside manager init block 1");
    }

    {
        System.out.println("Inside manager init block 2");
    }

    public Manager(String name) {
        super(name); //super has to be the first
        System.out.println("Inside manager constructor");
    }


    @Override
    public void print(){
        super.print();
        System.out.println(this.department);
        paymentReport();
    }

    public void paymentReport(){
        System.out.println("The employee " + this.name + " from the department " + this.department +
                " received a salary of " + this.salary); //protected posso acessar sem o get, no mesmo package
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
