package builder;

import java.time.LocalDate;

import model.Car;

public class CarDirector {
    private Car.CarBuilder carBuilder;

    public CarDirector(Car.CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car buildWhiteFiveSeateCar() {
        return carBuilder
            .colour("White")
            .numOfSeats(5)
            .yearOfManufacture(LocalDate.now().getYear())
            .build();
    }

    public Car buildBlackSevenSeatCar() {
        return carBuilder
            .colour("Black")
            .numOfSeats(7)
            .yearOfManufacture(LocalDate.now().getYear())
            .build();
    }

}
