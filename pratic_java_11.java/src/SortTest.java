import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

class Stud {
    private String name;
    private double GPA;

    public Stud(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Stud{" +
                "name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}

class SortingStudentsByGPA implements Comparator<Stud> {
    @Override
    public int compare(Stud student1, Stud student2) {
        // Сравниваем студентов по итоговым баллам в порядке убывания
        return Double.compare(student2.getGPA(), student1.getGPA());
    }

    public static void quickSort(List<Stud> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    private static int partition(List<Stud> students, int low, int high) {
        double pivot = students.get(high).getGPA();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (students.get(j).getGPA() >= pivot) {
                i++;
                Stud temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }

        Stud temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);

        return i + 1;
    }
}


public class SortTest{
    public static void main(String[] args) {
        List<Stud> students = new ArrayList<>();
        students.add(new Stud("Alice", 3.8));
        students.add(new Stud("Bob", 3.5));
        students.add(new Stud("Charlie", 4.0));
        students.add(new Stud("David", 3.7));
        students.add(new Stud("Eve", 4.0));

        SortingStudentsByGPA.quickSort(students, 0, students.size() - 1);

        for (Stud student : students) {
            System.out.println(student.getName() + " - GPA: " + student.getGPA());
        }
    }
}
