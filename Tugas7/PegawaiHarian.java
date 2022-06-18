//Jasmine Cecilia Putri Effendy 215150701111041

package Tugas_7;

public class PegawaiHarian extends Pegawai{
    private double upahPerjam;
    private int totalJam;
    
    public PegawaiHarian(String nama, String noKTP,double upahPerjam, int totalJam) {
        super(nama, noKTP);
        this.upahPerjam = upahPerjam;
        this.totalJam = totalJam;
    }
    
    public double getUpahPerjam() {
        return upahPerjam;
    }
    
    public void setUpahPerjam(double upahPerjam) {
        this.upahPerjam = upahPerjam;
    }
    
    public int getTotalJam() {
        return totalJam;
    }
    
    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }
    
    public double gaji(){
        if (this.totalJam <= 40){
            return (getUpahPerjam() * getTotalJam());
        }else{
            return((getUpahPerjam() * 40) + (getTotalJam() - 40) * getUpahPerjam() * 1.5);
        }
    }
    
    public String toString(){
        System.out.println("Pegawai Harian  : " + this.getNama());
        System.out.println("No. Ktp         : " + this.getNoKTP());
        System.out.println("Upah/Jam        : Rp." + this.getUpahPerjam());
        System.out.println("Total Jam Kerja : " + getTotalJam());
        System.out.println("Pendapatan      : Rp." + (int) gaji());
        
        return "";
    }
}   
