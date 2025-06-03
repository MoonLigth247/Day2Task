class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType, 
              double fuelEfficiency, double fuelCapacity) {
        super(make, model, year, fuelType, fuelEfficiency, fuelCapacity);
    }

    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency();
    }

    @Override
    public double calculateDistanceTraveled() {
        return  getFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        return 120;
    }
}

