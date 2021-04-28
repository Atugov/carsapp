package com.myproject.cars.model;

public class Car {

    protected String id;
    protected String make;
    protected String model;
    protected int year;
    protected String gearbox;
    protected String fuelType;
    protected String engineSize;
    protected int price;

    public Car() {
    }

    public Car(String id, String make, String model, int year, String gearbox, String fuelType, String engineSize, int price) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.gearbox = gearbox;
        this.fuelType = fuelType;
        this.engineSize = engineSize;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
