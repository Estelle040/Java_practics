package Task1;

public class InnNotValidException extends Exception{
    public InnNotValidException(String inn) {
        super("ИНН: " + inn + " не действителен");
    }
}
