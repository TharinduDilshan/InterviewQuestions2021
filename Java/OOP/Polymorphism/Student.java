package Polymorphism;

public class Student extends Person {
    private String ownerName;
    private boolean isAtHostel;
    private double mathMark;
    private double scienceMark;

    public Student(String ownerName, boolean isAtHostel, double mathMark, double scienceMark) {
        this.ownerName = ownerName;
        this.isAtHostel = isAtHostel;
        this.mathMark = mathMark;
        this.scienceMark = scienceMark;
    }

    public Student(String firstName, String lastName, String address, String ownerName, boolean isAtHostel, double mathMark, double scienceMark) {
        super(firstName, lastName, address);
        this.ownerName = ownerName;
        this.isAtHostel = isAtHostel;
        this.mathMark = mathMark;
        this.scienceMark = scienceMark;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isAtHostel() {
        return isAtHostel;
    }

    public void setAtHostel(boolean atHostel) {
        isAtHostel = atHostel;
    }

    public double getMathMark() {
        return mathMark;
    }

    public void setMathMark(double mathMark) {
        this.mathMark = mathMark;
    }

    public double getScienceMark() {
        return scienceMark;
    }

    public void setScienceMark(double scienceMark) {
        this.scienceMark = scienceMark;
    }

    @Override
    public String print() {
        return "Dear Teacher, my father is "+ ownerName+".";
    }
}
