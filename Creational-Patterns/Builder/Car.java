package Builder;

class Car {
    private final String name;
    private final String age;
    private final String height;

    Car(final String name, final String age, final String height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String toString() {
        return "Name: "+ name + " Age: " + age + " Height: " + height;
    }
}
