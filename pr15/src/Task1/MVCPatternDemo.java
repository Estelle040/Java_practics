package Task1;
import java.util.Scanner;

public class MVCPatternDemo {
    public static void main(String[] args) {
        StudentController con = new StudentController(retrieveStudentFromDataBase(), new StudentView());
        con.updateView();
        System.out.println();

        con.setStudentName("Albina");
        con.setStudentRollNo("ABC123");
        System.out.println(con.getStudentName());
        System.out.println(con.getStudentRollNo());
        System.out.println();

        con.setStudentName("Vita");
        con.setStudentRollNo("XYZ789");
        con.updateView();
    }

    public static Student retrieveStudentFromDataBase() {
        Scanner sc = new Scanner(System.in);
        Student out = new Student();
        out.setName(sc.nextLine());
        out.setRollNo(sc.nextLine());
        return out;
    }
}
