package test;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Launcher {
    public static void main(String[] args){
        Battle b = new Battle();
        Bounsweet p1 = new Bounsweet("Личи",2);
        Tsareena p2 = new Tsareena("Девчуля",10);
        Steenee p0 = new Steenee("Цветочек",15);
        Komala p3 = new Komala("Буся",10);
        Venonat p4 = new Venonat("Монстрик",12);
        Venomoth p5 = new Venomoth("Муха",7);

        b.addAlly(p4);
        b.addAlly(p0);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addFoe(p3);
        b.addFoe(p5);
        b.go();
    }
}
