import carfactory.CarFatory;
import carfactory.car.CarType;
import carfactory.car.ICar;

public class App {
    public static void main(String[] args) throws Exception {
        CarFatory carFatory = new CarFatory();

        ICar suv = carFatory.createCar(CarType.SUV);
        suv.getSpecifications();

        ICar hatchBack = carFatory.createCar(CarType.HatchBack);
        hatchBack.getSpecifications();

        ICar sedan = carFatory.createCar(CarType.Sedan);
        sedan.getSpecifications();

        ICar f1 = carFatory.createCar(CarType.F1);
        f1.getSpecifications();
    }
}
