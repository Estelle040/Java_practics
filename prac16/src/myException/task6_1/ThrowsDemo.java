package myException.task6_1;

public class ThrowsDemo {
    public void printMessage(String key) {
        try{String message = getDetails(key);
        System.out.println(message );}
        catch (NullPointerException exception){
            System.out.println("null");
        }
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key; }
}