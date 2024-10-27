package test;


import ru.ifmo.se.pokemon.*;

public final class Rock_Tomb extends PhysicalMove {
    public Rock_Tomb(){
        super(Type.ROCK,60.0,95.0);
    }
    @Override
    protected void applyOppEffects(Pokemon var0) {
        Effect eff = new Effect();
        eff.stat(Stat.SPEED, -1);
        var0.addEffect(eff);
    }

}