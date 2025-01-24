package Day04_Diagrams.class_object_modeling;

import java.util.List;
import java.util.Arrays;

class Sub {
    //Attribute
    private String name;
    private int score;


    //Constructor
    public Sub(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

class Stud {
    private String name;
    private List<Sub> subjects;

    public Stud(String name, List<Sub> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public List<Sub> getSubjects() {
        return subjects;
    }
}
//main class
public class ObjectDiagramExample {
    public static void main(String[] args) {
        // Subjects
        Sub maths = new Sub("Maths", 90);
        Sub science = new Sub("Science", 85);

        // Student
        Stud john = new Stud("John", Arrays.asList(maths, science));

        // Display student and subjects
        System.out.println("Student: " + john.getName());
        for (Sub subject : john.getSubjects()) {
            System.out.println("Subject: " + subject.getName() + ", Marks: " + subject.getScore());
        }
    }
}

