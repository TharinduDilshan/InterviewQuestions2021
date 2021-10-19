package Polymorphism;

public class Test {
    public void main(String[] args){
        Teacher teacher1 = new Teacher("John", "Tarbet", "Sri Lanka", "Science");
        System.out.println(teacher1.print());

        Teacher teacher2 = new Teacher("Ann", "Tarbet", "Australia", "Maths");
        System.out.println(teacher2.print());

        Student student1 = new Student("Nimal", "Jackson", "Sri Lanka", "Mason", true, 75.5, 65);
        System.out.println(student1.print());

        Student student2 = new Student("Kamal", "Jackson", "Australia", "Avery", false, 85.5, 90.5);
        System.out.println(student2.print());

        multiply(5,5);
        multiply(5.5,5.5);

    }

    public static int multiply(int a, int b)
    {
        return a * b;
    }

    // Method with the same name but 2 double parameter
    public static double multiply(double a, double b)
    {
        return a * b;
    }
}
