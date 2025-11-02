package carfactory.car;

public class SUV implements ICar {

    @Override
    public String getSpecifications() {
        StringBuilder sb = new StringBuilder("This is a SUV car");
        System.out.println(sb.toString());
        return sb.toString();
    }
    
}
