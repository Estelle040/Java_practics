package Task2;

import java.util.Comparator;

public class AscendingComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.score(), o2.score());
    }
}
