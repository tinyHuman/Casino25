package net.ictcampus.semodul;

public class Employee extends Person {

    private int wage;

    public Employee(String name, String prename, int birthyear) {
        super(name, prename, birthyear);
    }

    public void sayWelcome() {
        System.out.println("Willkommen im ICT-Campus Casino");
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
}
