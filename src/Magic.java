public class Magic extends Hero{

    public Magic(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public String apllysuperAbility() {
        super.apllysuperAbility();//super в Java используется для обращения к членам (методам, полям, конструкторам) родительского класса из его подкласса.
        String message="Magic apply his super ability";
        return message ;

    }
}
