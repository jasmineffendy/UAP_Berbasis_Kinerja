//Jasmine Cecilia Putri Effendy 215150701111041

package Tugas_8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println(">>>> Welcome to Defend Filkom Game ! <<<<");
        System.out.print("Please enter your name : ");
        String name = inp.nextLine();
        
        System.out.println("Choose your character : ");
        System.out.println("1. Magician\n2. Healer\n3. Warrior");
        System.out.print("Input your choice : ");
        
        int choose = 0;
        try {
            choose = inp.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Please input the right choices.");
            inp.nextLine();
            System.out.println("Choose your character : ");
            System.out.println("1. Magician\n2. Healer\n3. Warrior");
            System.out.print("Input your choice : ");
            choose = inp.nextInt();
        }
        inp.nextLine();

        if (choose != 1 && choose != 2 && choose != 3){
            System.out.println("Please input the right choices.");
            try {
                System.out.println("Choose your character : ");
                System.out.println("1. Magician\n2. Healer\n3. Warrior");
                System.out.print("Input your choice : ");
                choose = inp.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Please input the right choices.");
                inp.nextLine();
                System.out.println("Choose your character : ");
                System.out.println("1. Magician\n2. Healer\n3. Warrior");
                System.out.print("Input your choice : ");
                choose = inp.nextInt();
            }
            inp.nextLine();
        }

        ArrayList<Character> hero = new ArrayList<>();

        if (choose == 1){
            hero.add(new Magician());
        }
        else if (choose == 2){
            hero.add(new Healer());
        }
        else if (choose == 3){
            hero.add(new Warrior());
        }

        hero.add(new Titan());

        System.out.println("Welcome " + name +" !");
        Class role = hero.get(0).getClass();
        System.out.println("You're gonna play as a " + role.getSimpleName());

        System.out.println("================= PLAYER ================");
        System.out.println("----------------- STATUS ----------------");
        info(hero.get(0));
        
        System.out.println("================= ENEMY =================");
        System.out.println("----------------- STATUS ----------------");
        info(hero.get(1));

        System.out.println();

        int i = 1;
        do {
            
            System.out.println("================ TURN " + i + " ================");
            if (hero.get(0).attack()) {
                hero.get(1).receiveDamage(hero.get(0).getAttack());
            }
            i++;
            System.out.printf("%-20s: %d%n", name + "'s HP", hero.get(0).getHP());
            System.out.printf("%-20s: %d%n", "Enemy's HP", hero.get(1).getHP());
            if (hero.get(1).getHP() == 0)
                break;

            System.out.println("================ TURN " + i + " ================");
            if (hero.get(0) instanceof Healer) {
                System.out.println("Hero got heal!");
                ((Healer) hero.get(0)).heal();
            }

            if (hero.get(1).attack()) {
                hero.get(0).receiveDamage(hero.get(1).getAttack());
            }
            System.out.printf("%-20s: %d%n", name + "'s HP", hero.get(0).getHP());
            System.out.printf("%-20s: %d%n", "Enemy's HP", hero.get(1).getHP());
            i++;
        }
        while(hero.get(0).getHP() != 0 && hero.get(1).getHP() != 0);
        System.out.println("=========================================");
        if (hero.get(0).getHP() == 0)
            System.out.println(name + "'s Defeated.");
        else
            System.out.println(name + "'s Victory!");

        System.out.println();
        
        System.out.println("================= PLAYER ================");
        System.out.println("----------------- STATUS ----------------");
        info(hero.get(0));
        
        System.out.println("================= ENEMY =================");
        System.out.println("----------------- STATUS ----------------");
        info(hero.get(1));
        System.out.println("=========================================");
    }

    static void info(Character hero){
        Class role = hero.getClass();
        System.out.printf("%-20s: %s%n", "Role", role.getSimpleName() );
        hero.info();
    }
}
