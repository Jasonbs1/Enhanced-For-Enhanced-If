package com.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create SessionFactory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        // Create StudentInteract instance
        StudentInteract studentInteract = new StudentInteract(factory);

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Add a new student");
            System.out.println("2. Update a student");
            System.out.println("3. Delete a student");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent(studentInteract, scanner);
                    break;
                case 2:
                    updateStudent(studentInteract, scanner);
                    break;
                case 3:
                    deleteStudent(studentInteract, scanner);
                    break;
                case 4:
                    // Close SessionFactory and exit
                    factory.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private static void addStudent(StudentInteract studentInteract, Scanner scanner) {
        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter student age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter student major:");
        String major = scanner.nextLine();

        Student newStudent = new Student();
        newStudent.setName(name);
        newStudent.setAge(age);
        newStudent.setMajor(major);

        studentInteract.addStudent(newStudent);
        System.out.println("Student added successfully.");
    }

    private static void updateStudent(StudentInteract studentInteract, Scanner scanner) {
        System.out.println("Enter student ID to update:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter updated age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student student = studentInteract.getStudentById(id);
        if (student != null) {
            student.setAge(age);
            studentInteract.updateStudent(student);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void deleteStudent(StudentInteract studentInteract, Scanner scanner) {
        System.out.println("Enter student ID to delete:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student student = studentInteract.getStudentById(id);
        if (student != null) {
            studentInteract.deleteStudent(id);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
