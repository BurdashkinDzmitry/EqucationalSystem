package by.itoverone.entity;

public class Teacher extends Human {
    private String subject;
    private byte experience;

    public Teacher (int id, String name, String gender, byte age) {
        super(id, name, gender, age);
    }

    public Teacher(int id, String Name, String Gender, byte age, String subject, byte experience) {
        super(id, Name, Gender, age);
        subject = subject;
        this.experience = experience;
    }

    public void setSubject(String subject) {
        subject = subject;
    }

    public byte getExperience() {
        return experience;
    }

    public void setExperience(byte experience) {
        this.experience = experience;
    }
}

