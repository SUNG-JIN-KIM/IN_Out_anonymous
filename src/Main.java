class Car{
    String brand;
    Engine engine;

    public Car(String brand){
        this.brand = brand;
        this.engine = new Engine();
    }

    class Engine{
        public void start(){
            System.out.println("The engine of " + brand + " is starting.");
        }
    }

    public void startEngine(){
        engine.start();
    }
}

public class Main {
    public static void main(String[] args) {

        Car c = new Car("speed Car");

        c.startEngine();

    }
}
