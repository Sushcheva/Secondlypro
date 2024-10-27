package test;


public final class Venomoth extends Venonat {
    public Venomoth(String name, int level){
        super(name,level);
        setStats(70.0,65.0,60.0,90.0,75.0,90.0);
        addMove(new Roost());
    }

}