package Task2;

public class LabClassDriver {
    public static void main(String[] args) {
        Student[] students = new Student[7];
        students[0] = new Student("Фёдор", 95);
        students[1] = new Student("Анатолий", 43);
        students[2] = new Student("Евгений", 23);
        students[3] = new Student("Олег", 78);
        students[4] = new Student("Сергей", 100);
        students[5] = new Student("Владимир", 45);
        students[6] = new Student("Ярослав", 69);
        new LabClassUI(students);
    }
}
