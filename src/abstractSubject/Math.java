package abstractSubject;

public class Math extends Subject {
    private final int rating;
    private final String exam;

    public Math(String Teacher, String nameSubject, int rating, String exam) {
        super(Teacher, nameSubject);
        this.rating = rating;
        this.exam = exam;
    }

    @Override
    void study() {
        System.out.println(super.getSubjectName());
        System.out.println(super.getTeacher());
        System.out.println("Exam: " + exam + "\nRating: " + rating);
        System.out.println("Отличная успеваемость ");

    }
}
