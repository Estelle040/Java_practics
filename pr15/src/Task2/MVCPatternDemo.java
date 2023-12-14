package Task2;

import java.util.Scanner;

public class MVCPatternDemo {
    public static void main(String[] args) {
        EmployeeController con = new EmployeeController(getEmployee(), new EmployeeView());
        con.updateView();
        System.out.println();

        con.setEmployeeWorkExp(12);
        con.setEmployeeSpecEd(true);
        System.out.println(con.getEmployeeWorkExp());
        System.out.println(con.getEmployeeSpecEd());
        con.updateView();
    }

    public static Employee getEmployee() {
        Scanner sc = new Scanner(System.in);
        Employee out = new Employee();
        out.setWorkExp(sc.nextInt());
        out.setHasSpecEd(sc.nextBoolean());
        return out;
    }
}
