package abstractSubject;

abstract class Subject {
    private final String Teacher;
    private final String nameSubject;


    public Subject(String Teacher, String nameSubject) {
        this.Teacher = Teacher;
        this.nameSubject = nameSubject;

    }

    abstract void study();



    public String getSubjectName() {
        return "Name Subject: " + nameSubject;

    }

    public String getTeacher() {
        return "Teacher: " + Teacher;

    }

}
