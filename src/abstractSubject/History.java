package abstractSubject;

public class History extends Subject {
    private final String openLesson;

    public History(String Teacher, String nameSubject, String openLesson) {
        super(Teacher, nameSubject);
        this.openLesson = openLesson;
    }

    @Override
    void study() {
        System.out.println(super.getSubjectName());
        System.out.println(super.getTeacher());
        System.out.println("Open Lesson: " + openLesson);
        System.out.println("Подтянуть успеваемость ");

    }
}
