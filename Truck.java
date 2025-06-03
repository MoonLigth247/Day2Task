class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType, 
                double fuelEfficiency, double fuelCapacity) {
        super(make, model, year, fuelType, fuelEfficiency, fuelCapacity);
    }

    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency() * 0.8;  // Ачааны машин 20% илүү түлш хэрэглэнэ
    }

    @Override
    public double calculateDistanceTraveled() {
        return getFuelEfficiency() * 0.8;
    }

    @Override
    public double getMaxSpeed() {
        return 80;
    }
}