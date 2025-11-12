package model;

public class Car {
    private String company;
    private String model;
    private String colour;
    private int numOfSeats;
    private int yearOfManufacture;

    private Car(CarBuilder carBuilder) {
        this.company = carBuilder.company;
        this.model = carBuilder.model;
        this.colour = carBuilder.colour;
        this.numOfSeats = carBuilder.numOfSeats;
        this.yearOfManufacture = carBuilder.yearOfManufacture;
    }

    public String getCompany() { return this.company;}
    public String getModel() { return this.model;}
    public String getColour() { return this.colour;}
    public int getSeatCount() { return this.numOfSeats;}
    public int getYearOfManufacture() { return this.yearOfManufacture;}

    public class CarBuilder {
        private String company;
        private String model;
        private String colour;
        private int numOfSeats;
        private int yearOfManufacture;
        
        // mandatory fields for Car  
        public CarBuilder(String company, String model) {
            this.company = company;
            this.model = model;
        }

        // builder methods
        public CarBuilder colour(String colour) {
            this.colour = colour;
            return this;
        }

        public CarBuilder numOfSeats(int numOfSeats) {
            this.numOfSeats = numOfSeats;
            return this;
        }

        public CarBuilder yearOfManufacture(int yearOfManufacture) {
            this.yearOfManufacture = yearOfManufacture;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

}
