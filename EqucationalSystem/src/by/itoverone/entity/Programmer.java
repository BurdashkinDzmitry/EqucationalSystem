package by.itoverone.entity;

public class Programmer extends Human{
    private String ProgrammingLanguage;
    private byte experience;

    public Programmer (int id, String name, String gender, byte age) {
        super(id, name, gender, age);
    }



    public Programmer(int id, String Name, String Gender, byte age, String programmingLanguage, byte experience) {
        super(id, Name, Gender, age);
        ProgrammingLanguage = programmingLanguage;
        this.experience = experience;
    }

    public Programmer(String name, String programmingLanguage) {
        super(name);
        ProgrammingLanguage = programmingLanguage;
    }


    public String getProgrammingLanguage() {
        return ProgrammingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        ProgrammingLanguage = programmingLanguage;
    }

    public byte getExperience() {
        return experience;
    }

    public void setExperience(byte experience) {
        this.experience = experience;
    }
}
