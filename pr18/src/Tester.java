import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        MyGeneric<Integer, String, Double> ex1 = new MyGeneric<>(1, "2", 3.00);
        System.out.println(ex1.getVar1() + " " + ex1.getVar2() + " " + ex1.getVar3());
        ex1.showClass();
        System.out.println();

        ArrayList<Integer> myArr = new ArrayList<>();
        myArr.add(1);
        myArr.add(2);
        myArr.add(3);
        MinMax<ArrayList<Integer>, Integer> ex2 = new MinMax<>(myArr);
        System.out.println(ex2.max() + " " + ex2.min());
        System.out.println();

        System.out.println(Calculator.add(2, 3));
        System.out.println(Calculator.sub(6.25, 4));
        System.out.println(Calculator.mul(2, 3.25));
        System.out.println(Calculator.div(2.25, 0.25));
        System.out.println();

        Integer[][] arr = {{1, 2, 3}, {4, 5, 6}};
        Matrix<Integer> ex3 = new Matrix<>(2,3, arr);
        ex3.show();
        System.out.println();
        ex3.trans();
        ex3.show();
    }
}
