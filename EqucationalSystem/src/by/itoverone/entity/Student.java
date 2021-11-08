package by.itoverone.entity;

import java.util.Objects;

public class Student extends Human {

    private int group;
    private double avg;

    public Student(String name, int age, String gender, int id, int group, double avg) {
        super(id, name, gender, age);
        this.group = group;
        this.avg = avg;
    }

    public Student(String name, double avg) {
        super(name);
        this.avg = avg;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        avg = avg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return group == student.group && Double.compare(student.avg, avg) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash((super.hashCode()), group, avg);
    }

}
