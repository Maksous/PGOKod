public abstract class Person {
    protected String firstName, lastName;
    protected int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }

    public int getAge(){

        return 1;
    }

}
