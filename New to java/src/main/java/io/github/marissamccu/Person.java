package io.github.marissamccu;

public class Person {
    private int age;
    private String firstName;
    private String lastName;

    public Person(int age, String firstName, String lastName) {
        ageValidator(age);
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    private void ageValidator(int age){
        if(age<0 || age>125){
            throw new IllegalArgumentException("Invalid Age");
        }
    }



    public void setAge(int age){
        ageValidator(age);
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }





}
