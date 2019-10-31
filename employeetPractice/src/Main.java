import java.util.ArrayList;

public class Main{
    //Method called partTimeList that takes in data type ArrayList<PartTime> and its parameter is the employee list with name called list
    public static ArrayList<PartTime> partTimeList(ArrayList<Employee> list){
        //Creates ArrayList of part time employees
        ArrayList<PartTime> partTimeEmployees = new ArrayList<>();
        //Checks each object in the Employee ArrayList
        for (Employee i : list){
            //Checks if the employee is PartTime, it adds to the created ArrayList partTimeEmployees
            if (i instanceof PartTime){
                partTimeEmployees.add((PartTime)i);
            }
        }
        return partTimeEmployees;
    }
    public static ArrayList<FullTime> fullTimeList(ArrayList<Employee> list){
        ArrayList<FullTime> fullTimeEmployees = new ArrayList<>();
        for (Employee i : list){
            if (i instanceof FullTime){
                fullTimeEmployees.add((FullTime)i);
            }
        }
        return fullTimeEmployees;
    }
    public static ArrayList<SalaryEmployee> salaryList (ArrayList<Employee> list){
        ArrayList<SalaryEmployee> salaryEmployees = new ArrayList<>();
        for (Employee i : list){
            if (i instanceof SalaryEmployee){
                salaryEmployees.add((SalaryEmployee)i);
            }
        }
        return salaryEmployees;
    }

    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new PartTime("Jason", 2018, 20, 13.85));
        employeeList.add(new FullTime("Bob", 2011, 40, 18.99));
        employeeList.add(new SalaryEmployee("Jordan Al-Assadi", 2017, 40000));
        System.out.println("Part Time: " + partTimeList(employeeList) + "\nFull Time: " + fullTimeList(employeeList) + "\nSalary Pay: " + salaryList(employeeList));
    }
}