package notMyException.task4;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try{int i = Integer.parseInt(intString);
            System.out.println(2 / i);}
        catch (NumberFormatException exception){
            System.out.println("Введено не натуральное число");
        }
        catch (ArithmeticException exception){
            System.out.println("Введён 0. На ноль делить плохо");
        }
        finally {
            System.out.println("Done");
        }
    }
}
