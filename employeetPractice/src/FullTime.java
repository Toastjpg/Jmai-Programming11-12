public class FullTime extends HourlyEmployee{
    boolean hasBenefits;
    FullTime(String name, int hireYear, double hoursPerWeek, double hourlyWage){
        super(name, hireYear, hoursPerWeek, hourlyWage);
    }

    @Override
    public boolean hasBenefits() {
        return hasBenefits;
    }

    @Override
    public double annualSalary() {
        return hourlyWage*hoursPerWeek*52;
    }

    @Override
    public double monthlySalary() {
        return annualSalary()/12;
    }
}
