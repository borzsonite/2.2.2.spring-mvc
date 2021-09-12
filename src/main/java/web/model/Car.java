package web.model;

public class Car {
    private Long id;
    private String model;
    private int year;

    public Car(Long id, String model, int year) {
        this.id = id;
        this.model = model;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
