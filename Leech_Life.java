package test;


import ru.ifmo.se.pokemon.*;

public final class Leech_Life extends PhysicalMove {
    public Leech_Life(){
        super(Type.BUG,80.0,100.0);
    }
    @Override
    protected void applySelfEffects(Pokemon var0) {
//        Effect eff = new Effect();
//        eff.stat(Stat.HP, (int) (var0.getStat(Stat.HP)-var0.getHP())/2);
//        var0.addEffect(eff);
        var0.setMod(Stat.HP, (int) (var0.getStat(Stat.HP)-var0.getHP())/2);
        System.out.println("Leech life just used");

    }


}