package test;


import ru.ifmo.se.pokemon.*;

public final class Psychic extends SpecialMove {
    public Psychic(){
        super(Type.PSYCHIC,90.0,100.0);
    }
    @Override
    protected void applyOppEffects(Pokemon var0) {
        if (Math.random()>=0.9){
//            Effect eff = new Effect();
//            eff.stat(Stat.SPECIAL_DEFENSE, -1);
//            var0.addEffect(eff);
            var0.setMod(Stat.SPECIAL_DEFENSE,-1);
            }
        System.out.println("Psychic just used");

    }

}