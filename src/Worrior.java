public class Worrior extends Hero {

    public Worrior(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public String apllysuperAbility() {
        super.apllysuperAbility();//super в Java используется для обращения к членам (методам, полям, конструкторам) родительского класса из его подкласса.
        String mesage = "Worrior apply his super ability";
        return mesage;
    }

}
