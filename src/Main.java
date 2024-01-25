public class Main {
    public static void main(String[] args)
    {
        F1 mercedes= new F1("Mercedes",false);
        mercedes.move(45,30);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
        mercedes.stop();

        boat steamer= new boat("steamer",5000);
        System.out.println("Boat capacity: "+steamer.getVehicleCapacity());
        System.out.println("Boat name: "+steamer.getVehicleName());

    }
}