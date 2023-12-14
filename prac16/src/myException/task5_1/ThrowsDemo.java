package myException.task5_1;

public class ThrowsDemo {
    public void getDetails(String key) {
        if(key == null) {
            try{throw new NullPointerException("null key in getDetails" );}
            catch(NullPointerException e){
                System.out.println("null" );
            }
        }
        else{System.out.println("Не null");}
// do something with the key
    }
}