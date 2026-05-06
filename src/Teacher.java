import java.util.Objects;

public class Teacher {

    private long id;
    private String name;
    private String subject;
    private String className;

    public Teacher() {
    }

    public Teacher(long id, String name, String subject, String className) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.className = className;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return id == teacher.id && Objects.equals(name, teacher.name) && Objects.equals(subject, teacher.subject) && Objects.equals(className, teacher.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, subject, className);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
