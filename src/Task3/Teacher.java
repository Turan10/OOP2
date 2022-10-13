package Task3;

import java.util.ArrayList;

public class Teacher extends Person {
    ArrayList<String> canTeach;
    ArrayList<String> currentCourses;

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
    }


    @Override
    public boolean addCourse(String subject) {
        if (canTeach.contains(subject)) {
            System.out.println("You are available to teach in" + subject);

            return true;

        } else if (!canTeach.contains(subject)) {
            System.out.println("You do not have the expertize in " + subject);
        }
        return false;


    }

    @Override
    public String toString(){
        return name + canTeach;
    }
}


