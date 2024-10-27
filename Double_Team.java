package test;


import ru.ifmo.se.pokemon.*;

public final class Double_Team extends StatusMove {
    public Double_Team(){
        super(Type.NORMAL,0.0,0.0);
    }
    @Override
    protected void applySelfEffects(Pokemon var1) {
//        Effect eff = new Effect();
//        eff.stat(Stat.EVASION,1);
//        var1.addEffect(eff);
        var1.setMod(Stat.EVASION, 1);
        System.out.println("Double team just used");

    }
    @Override
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2) {
        return true;
    }


}
