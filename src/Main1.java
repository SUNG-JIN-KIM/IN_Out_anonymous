class Outer1{
    private class HiddenInner{
        void secret(){
            System.out.println("private");
        }
    }

    public void reveal(){
        HiddenInner hi = new HiddenInner();
        hi.secret();
    }
}
public class Main1 {
    public static void main(String[] args) {

    }
}
