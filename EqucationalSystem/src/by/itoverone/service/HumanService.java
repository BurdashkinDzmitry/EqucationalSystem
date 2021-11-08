package by.itoverone.service;

import by.itoverone.entity.Human;
import by.itoverone.entity.Student;

import java.util.Scanner;

public class HumanService {
    public static Human[] getHumans() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of humans: ");
        int numberHumans = sc.nextInt();
        Human[] humans = new Human[numberHumans];

        for (int i = 0; i < numberHumans; i++) {
            System.out.println("Enter name of human: ");
            String name = sc.next();
            humans[i] = new Human(name);
        }
        sc.close();
        return humans;
    }

    public static Human[] FirstSymbol(Human[] humans) {
        Human[] newHumans = new Human[humans.length];
        int count = 0;
        for (Human human : humans) {
            if (human.getName().startsWith("B")) {
                newHumans[count] = human;
                count++;
            }
        }
        return newHumans;
    }

    public static void printHumans(Human[] humans) {
        System.out.println("Humans first symbol B:");
        for (int i = 0; i < humans.length; i++) {
            if (humans[i] != null) {
                System.out.println(humans[i].getName());
            }
        }
    }

    public static Human[] SortInAscendingOrder(Human[] humans) {
        Human[] newHumans = new Human[humans.length];
        for (int i = 0; i < humans.length; i++) {
            for (int j = 0; j < humans.length - 1; j++) {
                if (humans[j].getName().compareTo(humans[j + 1].getName()) > 0) {
                    Human temp = humans[j];
                    humans[j] = humans[j + 1];
                    humans[j + 1] = temp;
                }
            }
        }
        return humans;
    }

    public static void printSortHuman(Human[] humans) {
        System.out.println("Sort humans in ascending order: ");
        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].getName());
        }

    }
}

