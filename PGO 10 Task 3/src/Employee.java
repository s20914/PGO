public abstract class Employee extends Person {

    int hireDate;
    String companyName;
    int salary;

    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, int salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate=hireDate;
        this.companyName=companyName;
        this.salary=salary;
    }
    public int getJobSeniority( int hireDate){
        int workingYears = 2020 - hireDate;
        return workingYears;
    }

    public int getSalary() {
        return salary;
    }

}
