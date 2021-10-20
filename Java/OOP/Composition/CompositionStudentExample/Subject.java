package CompositionStudentExample;

public class Subject {
    private String code;
    private String name;

    public Subject(String code, String name) {
        this.setCode(code);
        this.setName(name);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
