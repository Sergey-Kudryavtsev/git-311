package abstractSubject;

public class Main {
    public static void main(String[] args) {
        Subject math = new Math("Наталья Петровна","Математика", 5,"Экзамен по математике");
        Subject history = new History("Ирина Николаевна", "История","Открытый урок");
        Subject science = new Science("Лариса Викторовна","Естествознание", "Контрольная работа");

        math.study();
        System.out.println();
        history.study();
        System.out.println();
        science.study();
    }
}
