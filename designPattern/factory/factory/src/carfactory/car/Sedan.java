package carfactory.car;

public class Sedan implements ICar {

    @Override
    public String getSpecifications() {
        StringBuilder sb = new StringBuilder("This is a Sedan car");
        System.out.println(sb.toString());
        return sb.toString();
    }
    
}
