//Jasmine Cecilia Putri Effendy 215150701111041

package Tugas_7;

public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;
    
    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }
    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }
    
    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }
    
    public int getPenjualan() {
        return penjualan;
    }
    public double getKomisi() {
        return komisi;
    }
    public double gaji(){
        return (getPenjualan() * getKomisi());
    }

    public String toString(){
        System.out.println("Sales           : " + this.getNama());
        System.out.println("No. Ktp         : " + this.getNoKTP());
        System.out.println("Total Penjualan : " + this.getPenjualan());
        System.out.println("Besaran Komisi  : Rp." + getKomisi());
        System.out.println("Pendapatan      : Rp." + (int) gaji());
        
        return "";
    }
}
