package test;


import ru.ifmo.se.pokemon.*;

public final class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL,0.0,85.0);
    }
    @Override
    protected void applyOppEffects(Pokemon var1) {
        Effect eff = new Effect();
//        eff.stat(Stat.ATTACK,2);
//        var1.addEffect(eff);
        var1.setMod(Stat.ATTACK, 2);
        eff.confuse(var1);
    }

}