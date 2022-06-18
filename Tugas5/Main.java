// Jasmine Cecilia Putri Effendy 215150701111041

package Tugas5Pemlan;

public class Main {
    public static void main(String[] args) {
        
        CarRider Law = new CarRider("Trafalgar Law", 26, "08123454321");
        CarRider Luffy = new CarRider("Monkey D Luffy", 19, "086789109876");
        CarRider Zoro = new CarRider("Roronoa Zoro", 21, "08543212345");
        CarRider Sanji = new CarRider("Vinsmoke Sanji", 21, "08109876789");
        
        CarData data = new CarData();
        data.addCar("SUV", "N 1111 AF", "Hummer");
        data.addCar("SPORT", "N 2222 AF", "Bugatti");
        data.addCar("TRUCK", "N 3333 AF", "Ford");
        data.addCar("VAN", "N 4444 AF", "Chevrolet");

        data.listOfCar();
        System.out.println();

        RentArchive arsip = new RentArchive();
        arsip.Rent(Law, data.getCarList().get(1), 9);
        arsip.Rent(Luffy, data.getCarList().get(2), 3);
        arsip.Rent(Zoro, data.getCarList().get(3), 1);
        arsip.Rent(Sanji, data.getCarList().get(3), 5);

        System.out.println();
        arsip.info();
    }   
}
