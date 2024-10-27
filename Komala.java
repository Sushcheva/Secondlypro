package test;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Komala extends Pokemon {

    public Komala(String name, int level){
        super(name,level);
        setType(Type.NORMAL);
        setStats(65.0,115.0,65.0,75.0,95.0,65.0);
        setMove(new Rock_Tomb(), new Double_Team(),new Psychic(), new Confuse_Ray());
    }

}
