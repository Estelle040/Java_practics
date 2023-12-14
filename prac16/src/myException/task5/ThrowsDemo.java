package myException.task5;

public class ThrowsDemo {
    public void getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails" );
        }
        System.out.println(key+1);
    }
}