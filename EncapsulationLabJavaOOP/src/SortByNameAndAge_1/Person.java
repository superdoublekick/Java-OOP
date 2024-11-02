package SortByNameAndAge_1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age,double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setFirstName(String firstName) {
        if(firstName.length() < 3) {
            throw new IllegalArgumentException("");
        }

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if(lastName.length() < 3) {
            throw new IllegalArgumentException("");
        }
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age<=0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if(salary<460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public void increaseSalary(double bonus) {
        if(this.age < 30) {
            this.salary = this.salary + this.salary*bonus/200;
        } else {
            this.salary = this.salary + this.salary*bonus/100;
        }

    }

    @Override
    public String toString(){
        return String.format("%s %s gets %f leva",this.firstName,this.lastName,this.salary);
    }
}
