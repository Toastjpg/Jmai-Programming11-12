public abstract class HourlyEmployee extends Employee {
    double hoursPerWeek;
    double hourlyWage;
    boolean hasBenefits;

    HourlyEmployee(String name, int hireYear, double hoursPerWeek, double hourlyWage){
        super (name, hireYear);
        this.hoursPerWeek = hoursPerWeek;
        this.hourlyWage = hourlyWage;
    }

    public abstract boolean hasBenefits();

}
