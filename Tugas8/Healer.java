//Jasmine Cecilia Putri Effendy 215150701111041

package Tugas_8;

public class Healer extends Character {
    Healer(){
        setHP(70);
        setAttack(10);
        setDefense(10);
    }

    void heal(){
        setHP(getHP() + 25);
    }

    public boolean attack() {
        double counter = Math.random() * 10;
        if (counter > 0 && counter <= 8.5)
            return true;
        else
            return false;
    }
}
