package test;


import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bounsweet extends Pokemon {
    public Bounsweet(String name, int level){
        super(name,level);
        setType(Type.GRASS);
        setStats(42.0,30.0,38.0,30.0,38.0,32.0);
        setMove(new Dazzling_Gleam(), new Swagger());
    }

}

