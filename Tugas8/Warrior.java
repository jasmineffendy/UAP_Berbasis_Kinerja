//Jasmine Cecilia Putri Effendy 215150701111041

package Tugas_8;

public class Warrior extends Character {

    Warrior(){
        setHP(80);
        setAttack(25);
        setDefense(30);
    }
    
    public boolean attack() {
        double counter = Math.random() * 10;
        if (counter > 0 && counter <= 6.0)
            return true;
        else
            return false;
    }
}