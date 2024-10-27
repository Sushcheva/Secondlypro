package test;


import ru.ifmo.se.pokemon.*;

public final class Confide extends StatusMove {
    public Confide(){
        super(Type.NORMAL,0.0,0.0);
    }
    @Override
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2) {
        return true;
    }
    @Override
    protected void applyOppEffects(Pokemon var1) {
//        Effect eff = new Effect();
//        eff.stat(Stat.SPECIAL_ATTACK,-1);
//        var1.addEffect(eff);
        var1.setMod(Stat.SPECIAL_ATTACK, -1);
        System.out.println("Confide just used");

    }



}