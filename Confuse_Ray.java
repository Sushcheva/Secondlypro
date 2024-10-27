package test;


import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public final class Confuse_Ray extends StatusMove {
    public Confuse_Ray(){
        super(Type.GHOST,0.0,100.0);
    }
    @Override
    protected void applyOppEffects(Pokemon var1) {
        Effect confusion = new Effect();
        confusion.confuse(var1);
        System.out.println("Confuse Ray just used");

    }

}
