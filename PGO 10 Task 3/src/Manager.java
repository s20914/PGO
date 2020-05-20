public class Manager extends Employee {

    int newSalary;
    int bonus;
    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, int salary, int bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.bonus=bonus;
    }

    @Override
    public int getSalary() {
        int newSalary= salary + bonus;
        return newSalary;
    }

    @Override
    public String toString(){
        return "Manager with Last Name " + lastName+ " and age " + getAge() + " has salary " + getSalary();

    }
}
