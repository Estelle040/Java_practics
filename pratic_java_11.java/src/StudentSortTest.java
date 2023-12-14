class Student {
    private String iDNumber;
    private String name;

    public Student(String iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public String getIDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber='" + iDNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

public class StudentSortTest {
    public static void main(String[] args) {
        // Создаем массив объектов Student
        Student[] students = {
                new Student("12345", "Alice"),
                new Student("67890", "Bob"),
                new Student("34567", "Charlie"),
                new Student("23456", "David"),
                new Student("78901", "Eve")
        };

        // Выполняем сортировку вставками по iDNumber
        insertionSort(students);

        // Выводим отсортированный массив
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void insertionSort(Student[] students) {
        int n = students.length;

        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber().compareTo(key.getIDNumber()) > 0) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }
}
