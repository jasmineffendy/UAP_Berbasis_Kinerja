//Jasmine Cecilia Putri Effendy

package Tugas_6_Inheritance;

import java.util.Arrays;

public class Main {
    
    static Manusia manusia[];
    
    static MahasiswaFilkom mahasiswa[];
    
    static Pekerja pekerja[];
    
    static Manager manager[];

    public static void main(String[] args) {

        manusia = new Manusia[3];
        
        System.out.println("=============== M A N U S I A ===============");
        manusia[0] = new Manusia("Monkey D Garp", "320302030", true, true);
        manusia[1] = new Manusia("Rosinante Corazon", "310301030", true, true);
        manusia[2] = new Manusia("Nico Robin", "340304030", false, false);
        System.out.println(manusia[0].toString());
        System.out.println(manusia[1].toString());
        System.out.println(manusia[2].toString());

        mahasiswa = new MahasiswaFilkom[3];
        
        System.out.println("============= M A H A S I S W A =============");
        mahasiswa[0] = new MahasiswaFilkom("2151503456789", 3.7, "Monkey D Luffy", "420402040", true, false);
        mahasiswa[1] = new MahasiswaFilkom("2051504567891", 3.0, "Roronoa Zoro", "410401040", true, false);
        mahasiswa[2] = new MahasiswaFilkom("1951507678912", 3.5, "Boa Hancock", "430403040", false, true);
        System.out.println(mahasiswa[0].toString());
        System.out.println(mahasiswa[1].toString());
        System.out.println(mahasiswa[2].toString());

        pekerja = new Pekerja[3];
        
        System.out.println("=============== P E K E R J A ===============");
        pekerja[0] = new Pekerja(6, 30, "102010678912", "Vinsmoke Sanji", "520502050", true, true);
        pekerja[1] = new Pekerja(7, 29, "303030789123", "Franky Shogun", "510501050", true, false);
        pekerja[2] = new Pekerja(8, 28, "504050891234", "Belle Mere", "530503050", false, false);
        System.out.println(pekerja[0].toString());
        System.out.println(pekerja[1].toString());
        System.out.println(pekerja[2].toString());

        manager = new Manager[3];
        
        System.out.println("=============== M A N A G E R ===============");
        manager[0] = new Manager(1500, 8, 27, "204020123456", "Portgas D Ace", "2001647443", true, true);
        manager[1] = new Manager(1250, 7, 26, "402040234567", "Trafalgar Law", "1987456362362", true, true);
        manager[2] = new Manager(1000, 6, 25, "603060345678", "Charlotte Pudding", "193475135113", false, false);
        System.out.println(manager[0].toString());
        System.out.println(manager[1].toString());
        System.out.println(manager[2].toString());

        System.out.println("================= T O T A L =================");
        System.out.println("Total Manusia   : " + manusia.length);
        System.out.println("Total Mahasiswa : " + mahasiswa.length);
        System.out.println("Total Pekerja   : " + pekerja.length);
        System.out.println("Total Manager   : " + manager.length);
    }
}

//JASMINE CECILIA PUTRI EFFENDY 215150701111041
