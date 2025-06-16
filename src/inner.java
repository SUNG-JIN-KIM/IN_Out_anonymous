public class inner {
    String outerMessage = "hi";

    class Inner{
        void showMessage(){
            System.out.println(outerMessage);
        }
    }
    public static void main(String[] args) {

        inner m = new inner();

        inner.Inner i = m.new Inner();

        i.showMessage();

    }
}
