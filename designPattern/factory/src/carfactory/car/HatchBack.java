package carfactory.car;

public class HatchBack implements ICar {

    @Override
    public String getSpecifications() {
        StringBuilder sb = new StringBuilder("This is a HatchBack car");
        System.out.println(sb.toString());
        return sb.toString();
    }
    
}
