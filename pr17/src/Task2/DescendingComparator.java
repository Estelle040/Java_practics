package Task2;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.score(), o1.score());
    }
}
