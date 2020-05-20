abstract public class Person {

    String firstName;
    String lastName;
    int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear){
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthdayYear=birthdayYear;
    }

    public int getAge(){
        int age = 2020 - birthdayYear;
        return age;
    }


}
