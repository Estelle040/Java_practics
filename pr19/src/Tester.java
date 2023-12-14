import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 4, 5};
        System.out.println(toList(intArr));

        String[] stringArr = {"i", "like", "java"};
        System.out.println(toList(stringArr));

        MyArr<String> lonArr = new MyArr<>();
        lonArr.add("1");
        lonArr.add("2");
        lonArr.add("3");
        lonArr.add("4");
        lonArr.add("5");
        lonArr.add("6");
        lonArr.add("7");
        lonArr.add("8");
        lonArr.add("9");
        lonArr.add("10");
        lonArr.add("11");
        System.out.println(lonArr.get(10));

        File dir = new File("/Users/mac/Desktop/forJava");
        showFiles(dir);
    }

    public static <E> ArrayList<E> toList(E[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void showFiles(File someDir) {
        ArrayList<String> files = new ArrayList<>(Arrays.asList(someDir.list()));
        for (int i = 0; i < 5; i++) {
            System.out.println(files.get(i));
        }
    }
}

