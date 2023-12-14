package Task2;

import java.util.Comparator;
import java.util.Objects;

public record LabClass(Student[] students) {

    private void quickSort(int low, int high, Comparator<Student> comp) {
        if (students.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student base = students[middle];

        int i = low, j = high;
        while (i <= j) {
            while (comp.compare(base, students[i]) > 0) {
                i++;
            }

            while (comp.compare(base, students[j]) < 0) {
                j--;
            }

            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(low, j, comp);

        if (high > i)
            quickSort(i, high, comp);
    }

    public void sort(boolean asc) {
        if (!asc) {
            quickSort(0, students.length - 1, Student.DE_COMP);
        } else {
            quickSort(0, students.length - 1, Student.AS_COMP);
        }
    }

    public String findStudent(String nameToFind) throws EmptyStringException, StudentNotFoundException {
        if (Objects.equals(nameToFind, "")) {
            throw new EmptyStringException();
        }
        for (Student student : students) {
            if (student.name().equals(nameToFind)) {
                return "Найден студент: " + student;
            }
        }
        throw new StudentNotFoundException(nameToFind);
    }
}
