package test;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC,0.0,0.0);
    }
    @Override
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2) {
        return true;
    }
    @Override
    protected void applySelfEffects(Pokemon var0) {
        Effect var1 = (new Effect()).condition(Status.SLEEP).attack(0.0).turns(2);
        var0.setCondition(var1);
//        Effect eff = new Effect();
//        eff.stat(Stat.HP, (int) var0.getStat(Stat.HP));
//        var0.addEffect(eff);
        var0.setMod(Stat.HP,(int) var0.getStat(Stat.HP));
        System.out.println("Rest just used");
    }

}