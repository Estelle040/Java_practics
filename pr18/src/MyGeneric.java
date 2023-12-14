public class MyGeneric <T, V, K> {
    private final T var1;
    private final V var2;
    private final K var3;

    public MyGeneric(T var1, V var2, K var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public T getVar1() {
        return var1;
    }

    public V getVar2() {
        return var2;
    }

    public K getVar3() {
        return var3;
    }

    public void showClass() {
        System.out.println("T: " + var1.getClass() + ", V: " + var2.getClass() + ", K: " + var3.getClass());
    }
}
