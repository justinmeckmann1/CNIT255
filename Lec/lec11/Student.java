
public class Student extends Person {
    private String major;
    public Student() { }

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String getDescription() {
        return " Student: " + getName() + ", Major: " + getMajor();
    }
}
