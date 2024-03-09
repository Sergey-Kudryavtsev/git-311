package abstractSubject;

public class Science extends Subject {
    private final String controlWork;

    public Science(String Teacher, String nameSubject, String controlWork) {
        super(Teacher, nameSubject);
        this.controlWork = controlWork;
    }

    @Override
    void study() {
        System.out.println(super.getSubjectName());
        System.out.println(super.getTeacher());
        System.out.println("Control Work: " + controlWork);
        System.out.println("Нужно стараться ");
    }
}
