public class Medic extends Hero {

    private int healPoints;

    @Override
    public String apllysuperAbility() {
        super.apllysuperAbility();//super в Java используется для обращения к членам (методам, полям, конструкторам) родительского класса из его подкласса.
        String message = "Madic apply his super ability";
        return message;
    }

    public Medic(int health, int damage, String superAbility, int healPoints) {
        super(health, damage, superAbility);
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public void increaseExperience() {

        this.healPoints += this.healPoints * 0.1;
        System.out.println("Medic увелечил опыт лечение, теперь количество единиц лечение: " + this.healPoints);

    }

}
