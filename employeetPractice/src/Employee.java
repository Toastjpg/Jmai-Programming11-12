public abstract class Employee {
    String name;
    int hireYear;

    Employee(String name, int hireYear){
        this.name = name;
        this.hireYear = hireYear;
    }
    Employee(){
        name = null;
        hireYear = 0;
    }
    public String getName(){
        return name;
    }
    public int getHireYear(){
        return hireYear;
    }

    @Override
    public  String toString(){
        return "Name: " + name + " Hire Year: " + hireYear + " Annual S@lad: " + annualSalary() + " M0nthLy Salad: " + monthlySalary();
    }


    public abstract double annualSalary();
    public abstract double monthlySalary();
}
