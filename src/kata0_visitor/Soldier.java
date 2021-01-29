package kata0_visitor;

public abstract class Soldier {
    protected String name;
    protected int health;
    private int positionX, positionY;
    protected String status;

    public Soldier(String name, int health) {
        this.name = name;
        this.health = health;
    }
    
    public abstract Weapon toEquip();
    
    public abstract void toApplyMechanics(Mechanics mechanics);
    
    public void to_Act(Soldier soldier) {
        Weapon weapon = toEquip();
        weapon.toApply(soldier);
    }
    
    public void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        
    }
    
    public void toApplyMovement() {
        
    }

}