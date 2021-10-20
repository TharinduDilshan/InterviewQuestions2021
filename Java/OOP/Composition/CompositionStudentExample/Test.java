package CompositionStudentExample;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Subject english = new Subject("ENG101", "English");
        Subject mathematics = new Subject("MATH101", "Mathematics");
        Subject science = new Subject("SCI01", "Science");

        Subject economics = new Subject("ECO101", "Economics");
        Subject businessStudies = new Subject("BUS01", "Business Studies");
        Subject accounts = new Subject("ACC101", "Accounts");

        List<Subject> subjectsForScienceStudent = new ArrayList<Subject>();
        subjectsForScienceStudent.add(english);
        subjectsForScienceStudent.add(mathematics);
        subjectsForScienceStudent.add(science);

        List<Subject> subjectsForCommerceStudent = new ArrayList<Subject>();
        subjectsForCommerceStudent.add(english);
        subjectsForCommerceStudent.add(economics);
        subjectsForCommerceStudent.add(businessStudies);
        subjectsForCommerceStudent.add(accounts);

        Student commerceStudent = new Student("Ravi",18, subjectsForCommerceStudent);
        Student scienceStudent = new Student("Chavi",19, subjectsForScienceStudent);

        commerceStudent.printStudentDetails();
        scienceStudent.printStudentDetails();
    }

}
