package Builder;

class CarBuilder implements Builder {
    private String name;
    private String age;
    private String height;

    @Override
    public CarBuilder name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public CarBuilder age(final String age) {
        this.age = age;
        return this;
    }

    @Override
    public CarBuilder height(final String height) {
        this.height = height;
        return this;
    }

    public Car build() {
        return new Car(name, age, height);
    }
}
