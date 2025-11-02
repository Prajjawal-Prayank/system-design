package carfactory;

import carfactory.car.ICar;
import carfactory.car.CarType;
import carfactory.car.HatchBack;
import carfactory.car.SUV;
import carfactory.car.Sedan;

public class CarFatory {
    
    public ICar createCar(CarType carType) {
        ICar car = null;
        
        switch (carType) {
            case SUV: 
                car = new SUV();
                break;
            case Sedan: 
                car = new Sedan();
                break;
            case HatchBack: 
                car = new HatchBack();
                break;
            default: 
                throw new IllegalStateException("Not a valid car");
        }

        return car;
    }

}
