import builder.CarDirector;
import model.Car;

public class App {
    public static void main(String[] args) throws Exception {
        // get a director object holder
        CarDirector carDirector = null;

        // 5 seater creta
        Car.CarBuilder carBuilder = new Car.CarBuilder("Hyundai", "Creta");
        carDirector = new CarDirector(carBuilder);
        Car whiteCreta = carDirector.buildWhiteFiveSeateCar();
        System.out.println(whiteCreta);
        System.out.println();

        // 7 seater xuv700
        carBuilder = new Car.CarBuilder("Mahindra", "XUV 700");
        carDirector = new CarDirector(carBuilder);
        Car blackXuv700 = carDirector.buildBlackSevenSeatCar();
        System.out.println(blackXuv700);
    }
}
