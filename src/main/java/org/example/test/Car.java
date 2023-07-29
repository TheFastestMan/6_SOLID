package org.example.test;

import java.util.Objects;

public class Car {
    private String name;

    private CarModel carModel;

    private int engineСapacity;

    public Car(String name, CarModel carModel, int engineСapacity) {
        this.name = name;
        this.carModel = carModel;
        this.engineСapacity = engineСapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public int getEngineСapacity() {
        return engineСapacity;
    }

    public void setEngineСapacity(int engineСapacity) {
        this.engineСapacity = engineСapacity;
    }

    @Override
    public String toString() {
        return "Car{name='" + name + '\'' + ", carModel=" + carModel + ", engineCapacity=" + engineСapacity + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return getEngineСapacity() == car.getEngineСapacity() && Objects.equals(getName(),
                car.getName()) && getCarModel() == car.getCarModel();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCarModel(), getEngineСapacity());
    }
}
