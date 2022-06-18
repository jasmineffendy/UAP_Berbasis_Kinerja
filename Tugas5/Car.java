// Jasmine Cecilia Putri Effendy 215150701111041

package Tugas5Pemlan;

public class Car {
    
    private String carType, polNum, merk;
    private boolean status;

    Car(String carType, String polNum, String merk, Boolean status){
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = Boolean.parseBoolean(status);
    }

    public boolean isStatus(){
        return status;
    }
    
    public String getCarType(){
        return carType;
    }

    public String getPolNum(){
        return polNum;
    }

    public String getMerk(){
        return merk;
    }   
}
