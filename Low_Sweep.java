package test;


import ru.ifmo.se.pokemon.*;

public final class Low_Sweep extends PhysicalMove {
    public Low_Sweep(){
        super(Type.FIGHTING,65.0,100.0);
    }
    @Override
    protected void applyOppEffects(Pokemon var0) {
//        Effect eff = new Effect();
//        eff.stat(Stat.SPEED, -1);
//        var0.addEffect(eff);
        var0.setMod(Stat.SPEED,-1);
        System.out.println("Low sweep just used");

    }

}