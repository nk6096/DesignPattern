enum Car {
    TATA, VW
}

class TataCar extends CarAbstractFactory {
    public TataCar(final Horn horn) {
        System.out.println("Tata Car Create");
        HornFactory.getHornObject(horn);
    }
}

class VWCar extends CarAbstractFactory {
    public VWCar(final Horn horn) {
        System.out.println("VW Car Create");
        HornFactory.getHornObject(horn);
    }
}

enum Horn {
    SAMSUNG, RABBIT
}

class SamsungHorn extends HornFactory {
    public SamsungHorn() {
        System.out.println("Samsung Horn Create");
    }  
}

class RabbitHorn extends HornFactory {
     public RabbitHorn() {
        System.out.println("Rabbit Horn Create");
    }
}

class HornFactory extends CarAbstractFactory {
    public static HornFactory getHornObject(final Horn horn) {
        switch(horn) {
            case SAMSUNG: 
                return new SamsungHorn();
            case RABBIT:
                return new RabbitHorn();
            default:
                throw new RuntimeException("Horn type not found"); 
        }
    }
}

public class CarAbstractFactory {
   public static CarAbstractFactory getCarObject(final Car car, final Horn horn) {
        switch(car) {
            case TATA: 
                return new TataCar(horn);
            case VW:
                return new VWCar(horn);
            default:
                throw new RuntimeException("Egine type not found"); 
        }
    }
}

class ApplicationCarAbstractFactory {
    public static void main(String[] args) {
        var testVar = "124";
        System.out.println("testVar: "+testVar);

        System.out.println("====== CarAbstractFactory Design Pattern ======");
        CarAbstractFactory.getCarObject(Car.VW, Horn.SAMSUNG);

        System.out.println();
    }
}
