package cass1;
import java.util.*;
import java.util.stream.*;

public class Demo {
    static Random rand = new Random();

    static Student createStudent(String name, int indexNo, int age) {
        return new Student(name, indexNo, age);
    }

    static void printValues(Student s) {
        System.out.println("Name: " + s.name + ", Index Number: " + s.indexNo + ", Age: " + s.age);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Andrej", "Charlie", "PPPPPPP", "pppetar");

        List<Student> students = names.stream()
            .map(name -> createStudent(name, rand.nextInt(10000) + 1, rand.nextInt(13) + 18))
            .collect(Collectors.toList());

        List<Student> studentsWithP = students.stream()
            .filter(s -> s.name.startsWith("P"))
            .collect(Collectors.toList());

        System.out.println("Students whose names start with P:");
        studentsWithP.forEach(Demo::printValues);

        boolean allYoungerThan25 = students.stream().allMatch(s -> s.age < 25);
        System.out.println("All students are younger than 25: " + allYoungerThan25);

        boolean allOlderThan25 = students.stream().allMatch(s -> s.age > 25);
        System.out.println("All students are older than 25: " + allOlderThan25);

        boolean atLeastOneYoungerThan25 = students.stream().anyMatch(s -> s.age < 25);
        System.out.println("At least one student is younger than 25: " + atLeastOneYoungerThan25);
    }
}
