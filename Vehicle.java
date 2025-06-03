abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private double fuelEfficiency;
    public void displayInfo() {
    System.out.println("Үйлдвэрлэгч: " + make);
    System.out.println("Загвар: " + model);
    System.out.println("Хугацаа: " + year);
    System.out.println("Түлшний төрөл: " + fuelType);
    System.out.printf("Түлшний үр ашиг: %.1f км/л\n", fuelEfficiency);
    }
    public Vehicle(String make, String model, int year, String fuelType, 
                  double fuelEfficiency, double fuelCapacity) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }
    public String getMake() { 
        return make; 
    }
    public String getModel() { 
        return model; 
    }
    public int getYear() { 
        return year; 
    }
    public String getFuelType() { 
        return fuelType; 
    }
    public double getFuelEfficiency() { 
        return fuelEfficiency; 
    }
    public abstract double calculateFuelEfficiency();
    public abstract double calculateDistanceTraveled();
    public abstract double getMaxSpeed();
}