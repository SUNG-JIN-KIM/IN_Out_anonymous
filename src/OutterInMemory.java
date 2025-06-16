public class OutterInMemory {
    private String data = "Outer data";

    class Inner{
        void printData(){
            System.out.println(data);
        }
    }

    public Inner createInner(){
        return new Inner();
    }
    public static void main(String[] args) {
        OutterInMemory outer = new OutterInMemory();
        OutterInMemory.Inner inner = outer.createInner();

        inner.printData();

        outer = null;
        inner.printData();

        inner = null;

        System.gc();
    }
}
