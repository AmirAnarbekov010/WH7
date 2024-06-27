public abstract class Hero implements HeavingSupperAbility {

    private int Health;
    private int damage;
    private String superAbility;

    public String apllysuperAbility() {
        return null;
    }

    public Hero(int health, int damage, String superAbility) {
        Health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    public int getHealth() {
        return Health;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }
}
