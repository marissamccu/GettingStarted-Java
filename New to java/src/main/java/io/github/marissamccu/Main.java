package io.github.marissamccu;


public class Main {
    public static void main(String[] args){
        Person marissa = new Person(19,"Marissa","McCubbin");
        System.out.println(marissa.getAge());


        Person[] peopleArray = new Person[5];
        peopleArray[0]= marissa;
        peopleArray[1] = new Person(20,"Jiwoo","Han");
        peopleArray[2] = new Person(39,"Nathan", "Russel");
        peopleArray[3]= new Person(21,"Kamil","Zayala");
        peopleArray[4] = new Person(28,"Keaston","Edwards");
        for (Person person:peopleArray){
            System.out.println("Here is a new person shown below!");
            System.out.println("\t"+person.getFirstName() + " "+ person.getLastName());
            System.out.println("\tAge:"+ person.getAge());



        }



    }


}