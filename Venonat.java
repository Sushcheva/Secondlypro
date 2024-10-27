package test;


import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Venonat extends Pokemon {

    public Venonat(String name, int level){
        super(name,level);
        setType(Type.BUG);
        setType(Type.POISON);
        setStats(60.0,55.0,50.0,40.0,55.0,45.0);
        setMove(new Confide(), new Rest(), new Leech_Life());
    }

}
