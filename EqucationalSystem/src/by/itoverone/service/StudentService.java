package by.itoverone.service;

import by.itoverone.entity.Student;

import java.util.Scanner;

public class StudentService {

    public static Student[] getStudents() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int size = sc.nextInt();
        Student[] students = new Student[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the student's name: ");
            String name = sc.next();
            System.out.println("Enter the student's age " + name + ":");
            int age = sc.nextInt();
            System.out.println("Enter the gender of the student (M/W)" + name + ":");
            String gender = sc.next();
            System.out.println("Enter the Student ID" + name + ":");
            int id = sc.nextInt();
            System.out.println("Enter the student's group" + name + ":");
            int group = sc.nextInt();
            System.out.println("Enter student grade point average" + name + ":");
            double avg = sc.nextDouble();
            students[i] = new Student(name, age, gender, id, group, avg);
        }
        sc.close();
        return students;
    }

    public static Student[] FilterStudentsByAvgMoreSeven(Student[] students) {
        Student[] newStudents = new Student[students.length];
        int str = 0;
        for (int i = 0; i < getStudents().length; i++) {
            if (students[i].getAvg() > 7) {
                newStudents[str] = students[i];
                str++;
            }
        }
        return newStudents;
    }

    public static void printStudent(Student[] students) {
        System.out.println("Students with average score of more than 7:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName() + " " + students[i].getAvg());
        }
    }
}

