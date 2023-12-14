import java.util.ArrayList;
import java.util.List;

class Student3 {
    private String name;
    private double GPA;

    public Student3(String name, double GPA) {
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
        return "Student3{" +
                "name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}

public class MergeSortStudents {
    public static void main(String[] args) {
        List<Student3> list1 = new ArrayList<>();
        list1.add(new Student3("Alice", 3.8));
        list1.add(new Student3("Bob", 3.5));
        list1.add(new Student3("Charlie", 4.0));

        List<Student3> list2 = new ArrayList<>();
        list2.add(new Student3("David", 3.7));
        list2.add(new Student3("Eve", 4.0));

        List<Student3> mergedAndSorted = mergeSort(list1, list2);

        for (Student3 student : mergedAndSorted) {
            System.out.println(student.getName() + " - GPA: " + student.getGPA());
        }
    }

    public static List<Student3> mergeSort(List<Student3> list1, List<Student3> list2) {
        List<Student3> result = new ArrayList<>();

        int index1 = 0;
        int index2 = 0;

        while (index1 < list1.size() && index2 < list2.size()) {
            Student3 student1 = list1.get(index1);
            Student3 student2 = list2.get(index2);

            if (student1.getGPA() >= student2.getGPA()) {
                result.add(student1);
                index1++;
            } else {
                result.add(student2);
                index2++;
            }
        }

        while (index1 < list1.size()) {
            result.add(list1.get(index1));
            index1++;
        }

        while (index2 < list2.size()) {
            result.add(list2.get(index2));
            index2++;
        }

        return result;
    }
}
