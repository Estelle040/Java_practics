package Task1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Введите номер ИНН");
            try{
                String inn =  sc.nextLine();
                checkInn(inn);
                break;
            }catch (InnNotValidException e){
                System.out.println(e.getLocalizedMessage());
            }
        }
        System.out.println("ИНН действителен!");
    }

    public static void checkInn(String inn) throws InnNotValidException{
        if (inn.length() != 12) {
            throw new InnNotValidException(inn);
        }
        for (int i = 0; i < 12; i++) {
            if (inn.charAt(i) > '9' || inn.charAt(i) < '0') {
                throw new InnNotValidException(inn);
            }
        }
    }
}
