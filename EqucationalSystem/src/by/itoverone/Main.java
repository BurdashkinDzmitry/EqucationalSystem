package by.itoverone;

import by.itoverone.entity.Human;
import by.itoverone.entity.Programmer;
import by.itoverone.entity.Student;
import by.itoverone.service.HumanService;
import by.itoverone.service.ProgrammerService;
import by.itoverone.service.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human[] humans = HumanService.getHumans();
        Human[] firstSymbolHuman = HumanService.FirstSymbol(humans);
        HumanService.printHumans(firstSymbolHuman);
        Human[] sortInAscendingOrder = HumanService.SortInAscendingOrder(humans);
        HumanService.printSortHuman(sortInAscendingOrder);
        Student[] students = StudentService.getStudents();
        Student[] filterStudentsByAvgMoreSeven = StudentService.FilterStudentsByAvgMoreSeven(students);
        StudentService.printStudent(students);
        Programmer[] programmers = ProgrammerService.getProgrammers();
        Programmer[] programmerJavaLang=ProgrammerService.ProgrammerJavaLang(programmers);
        ProgrammerService.printProgrammers(programmerJavaLang);

    }
}



