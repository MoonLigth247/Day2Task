public class Main2 {
    public static void main() {
        Car prius = new Car("Toyota", "Prius", 2022, "Hybrid", 25.5, 45);
        Truck volvo = new Truck("Volvo", "FH16", 2021, "Dizel", 12.8, 300);
        
        System.out.println(prius);
        System.out.println(volvo);
     
        prius.displayInfo();
        volvo.displayInfo();
        
        System.out.printf("Prius-ийн дээд хурд: %.0f км/ц\n", prius.getMaxSpeed());
        System.out.printf("Volvo-ийн түлшний үр ашиг: %.1f км/л\n", volvo.calculateFuelEfficiency());
    }
}