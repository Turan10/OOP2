package Task3;

import java.util.ArrayList;

public class Student extends Person {
    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses;


    public Student(String name, ArrayList<String> currentCourses) {
        super(name);
        this.currentCourses = currentCourses;
        this.passedCourses = new ArrayList<>();

    }


    @Override
    public boolean addCourse(String course) {
        if (currentCourses.contains(course)) {
            System.out.println("You've allready taken " + course + " course");

            return false;

        } else if (!currentCourses.contains(course)) {
            currentCourses.add(course);
        }
        return true;
    }


    @Override

    public String toString(){
        return name + currentCourses;
    }

}
