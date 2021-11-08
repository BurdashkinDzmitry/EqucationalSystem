package by.itoverone.service;

import by.itoverone.entity.Human;
import by.itoverone.entity.Programmer;

import java.util.Scanner;

public class ProgrammerService {
    public static Programmer[] getProgrammers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of programmers:");
        int size = sc.nextInt();
        Programmer[] programmers = new Programmer[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the programmer's name:");
            String name = sc.next();
            System.out.println("Enter the programmer language " + name + ":");
            String programmingLanguage = sc.next();
            programmers[i] = new Programmer(name, programmingLanguage);
        }
        sc.close();
        return programmers;
    }

    public static Programmer[] ProgrammerJavaLang(Programmer[] programmers) {
        Programmer[] newProgrammers = new Programmer[programmers.length];
        int count = 0;
        for (Programmer programmer : programmers) {
            if (programmer.getProgrammingLanguage().startsWith("Java")) {
                newProgrammers[count] = programmer;
                count++;
            }
        }
        return newProgrammers;
    }

    public static void printProgrammers(Programmer[] programmers) {
        System.out.println("Programmers language Java:");
        for (int i = 0; i < programmers.length; i++) {
            if (programmers[i] != null) {
                System.out.println(programmers[i].getName());

            }
        }
    }
}