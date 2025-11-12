import builder.CarDirector;
import model.Car;

public class App {
    public static void main(String[] args) throws Exception {
        // get a director
        CarDirector carDirector = null;

        // 5 seater creta
        Car.CarBuilder carBuilder = new Car.CarBuilder("Hyundai", "Creta");
        carDirector = new CarDirector(carBuilder);
        Car whiteCreta = carDirector.buildWhiteFiveSeateCar();
        System.out.println(whiteCreta);
    }
}
