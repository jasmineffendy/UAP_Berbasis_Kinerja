// Jasmine Cecilia Putri Effendy

package Tugas5Pemlan;

public class CarRent {

    private int rentDur;
    private CarRider rider; 
    private Car car;

    CarRent(CarRider rider, Car car, int rentDur){
        this.rider = rider;
        this.car = car;
        this.rentDur = rentDur;
    }

    public CarRider getRider(){
        return rider;
    }

    public Car getCar(){
        return car;
    }

    public int getRentDur(){
        return rentDur;
    }
}
