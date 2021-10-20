package CompositionStudentExample;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<Subject> subjects; //Student has a list of Subjects

    public Student(String name, int age, List<Subject> subjects) {
        this.setName(name);
        this.setAge(age);
        this.setSubjects(subjects);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printStudentDetails() {
        System.out.println("Student " + this.name + " has taken the sujects ");
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println(subjects.get(i).getName());
        }
    }

}
