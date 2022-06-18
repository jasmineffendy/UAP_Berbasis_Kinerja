//Jasmine Cecilia Putri Effendy 215150701111041

package Tugas_8;

public class Titan extends Character {
    Titan(){
        setHP(200);
        setAttack(45);
        setDefense(0);
    }

    public boolean attack() {
        double counter = Math.random() * 10;
        if (counter > 0 && counter <= 4.0)
            return true;
        else
            return false;
    }
}
