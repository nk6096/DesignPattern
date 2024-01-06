enum City {
    PAT, BGP, KGG
}

class KhagariaTour extends Factory {
  private String name = "Khagaria";

  public String getCityName () {
    return name;
  }
}

class BhagalpurTour extends Factory {
  private String name = "Bhagalpur";

  public String getCityName () {
    return name;
  }
}

class PatnaTour extends Factory {
  private String name = "Patna";

  public String getCityName () {
    return name;
  }
}

public class Factory {

    public String getCityName () {
      return "Name not found";
    }

    public static Factory getTourObject(final City code) {

        switch(code) {
            case KGG:
                return new KhagariaTour();
            case BGP:
                return new BhagalpurTour();
            case PAT:
                return new PatnaTour();
            default:
            throw new RuntimeException("Incorrect Place Name");
        }
    }
}

class ApplicationFactory {

    public static void main(String[] args) {
        System.out.println();

        System.out.println("====== Factory Design Pattern ======");
        
        System.out.println();

        Factory kFactory = Factory.getTourObject(City.KGG);
        System.out.println(kFactory.getCityName());

        System.out.println();
    }
}
