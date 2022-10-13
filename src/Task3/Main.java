package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> currentCourses = new ArrayList<>();
        currentCourses.add("Math");
        currentCourses.add("Bio");
        Teacher teacher1 = new Teacher("Tess",currentCourses);

        Student student1 = new Student("Turan", currentCourses);
        student1.addCourse("Data Science");
        student1.addCourse("Math");
        System.out.println(currentCourses);


        ArrayList<String> subjectsToTeach = new ArrayList<>();
        subjectsToTeach.add("English");
        subjectsToTeach.add("Danish");
        subjectsToTeach.add("Data science");
        subjectsToTeach.add("Java 1.0");

        Teacher teacher2 = new Teacher("Jorg", subjectsToTeach);

        System.out.println(teacher2.canTeach);


        ArrayList<ArrayList> person = new ArrayList<>();
        person.add(subjectsToTeach);
        person.add(currentCourses);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Cem", subjectsToTeach));
        persons.add(teacher1);
        persons.add(student1);

        for(Person p : persons){
            p.addCourse("Java 1.0");
        }
        System.out.println(persons);



    }


}

