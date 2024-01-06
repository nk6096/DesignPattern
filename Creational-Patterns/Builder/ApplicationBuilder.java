package Builder;

public class ApplicationBuilder {
    public static void main(String[] args) {
        
        CarBuilder carBuilder = new CarBuilder();

        System.out.println(carBuilder.age("12").name("Nitish").build());
    }
}
