//Jasmine Cecilia Putri Effendy 215150701111041

package Tugas_7;

public class PegawaiTetap extends Pegawai{
    private double upah;
    
    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }
    
    public double getUpah() {
        return upah;
    }
    
    public void setUpah(double upah) {
        this.upah = upah;
    }
    
    public double gaji(){
        return upah;
    }
    
    public String toString(){
        System.out.println("Pegawai Tetap   : " + this.getNama());
        System.out.println("No. Ktp         : " + this.getNoKTP());
        System.out.println("Upah            : Rp." + this.getUpah());
        System.out.println("Pendapatan      : Rp." + (int) gaji());
        
        return"";
    } 
}