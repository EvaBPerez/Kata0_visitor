package kata0_visitor;

public class Archer extends Soldier{

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public Weapon toEquip() {
        return new Bow();
    }

    @Override
    public void toApplyMechanics(Mechanics mechanics) {
        mechanics.toApplyMovement(this);
    }
    
}
