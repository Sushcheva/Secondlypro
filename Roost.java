package test;


import ru.ifmo.se.pokemon.*;

public final class Roost extends StatusMove {
    public Roost(){
        super(Type.FLYING,0.0,0.0);
    }
    @Override
    protected void applySelfEffects(Pokemon var0) {
//        Effect eff = new Effect();
//        eff.stat(Stat.HP, (int) var0.getStat(Stat.HP)/2);
//        var0.addEffect(eff);
        var0.setMod(Stat.HP, (int) var0.getStat(Stat.HP)/2);
    }

}