//Jasmine Cecilia Putri Effendy 215150701111041

package Tugas_7;

public class Main {

    public static void main(String[] args) {
        
        Pegawai pegawai;
        pegawai = new Pegawai();
        
        System.out.println("============ PEGAWAI TETAP ============\n");
        pegawai = new PegawaiTetap("Monkey D Luffy","315150701111037", 5500000);
        System.out.println(pegawai.toString());
        pegawai = new PegawaiTetap("Roronoa Zoro","315150701111038", 4500000);
        System.out.println(pegawai.toString());
        pegawai = new PegawaiTetap("Vinsmoke Sanji","315150701111039", 4499000);
        System.out.println(pegawai.toString());

        System.out.println("============ PEGAWAI HARIAN ===========\n");
        pegawai = new PegawaiHarian("Charlotte Pudding","315150701111040", 40000, 45);
        System.out.println(pegawai.toString());
        pegawai = new PegawaiHarian("Jasmine Cecilia Putri Effendy","215150701111041", 37000, 40);
        System.out.println(pegawai.toString());
        pegawai = new PegawaiHarian("Nico Robin","315150701111042", 35000, 35);
        System.out.println(pegawai.toString());
        
        
        System.out.println("================ SALES ================\n");
        pegawai = new Sales("Portgas D Ace","315150701111043", 30, 65000);
        System.out.println(pegawai.toString());
        pegawai = new Sales("Oyabun Jinbei","315150701111044", 57, 135000);
        System.out.println(pegawai.toString());
        pegawai = new Sales("Eustass Captain Kid","315150701111045", 43, 95000);
        System.out.println(pegawai.toString());
    }
}
