package Day04_Diagrams.class_object_modeling;

import java.util.List;

// Class representing a student
class Student {
    //Attribute
    private String name;
    private List<Sub> subjects;
    //Student constructor
    public Student(String name, List<Sub> subjects) {
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

// Class representing a subject
class Subject {
    private String name;
    private int score;

    public Subject(String name, int score) {
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

// Class responsible for calculating grades
class GradeCalculator {
    public double calculateAverageScore(Stud student) {
        List<Sub> subjects = student.getSubjects();
        int totalScore = 0;
        for (Sub subject : subjects) {
            totalScore += subject.getScore();
        }
        return (double) totalScore / subjects.size();
    }
}

public class SchoolResultsApplication {
    public static void main(String[] args) {
        // Example subjects
        Sub math = new Sub("Math", 85);
        Sub science = new Sub("Science", 90);
        Sub history = new Sub("History", 80);

        // Example student
        Stud student = new Stud("Ramesh", List.of(math, science, history));

        // Calculate and display average score
        GradeCalculator gradeCalculator = new GradeCalculator();
        double averageScore = gradeCalculator.calculateAverageScore(student);
        System.out.println("Average Score for " + student.getName() + ": " + averageScore);
    }
}
