import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Magic magic = new Magic(100,20,"Magic damage");
        Medic medic = new Medic(120,50,"Healing",50);
        Worrior worrior = new Worrior(123,23,"Worior damage");

        Hero[] allHerous = {magic, medic, worrior};

        for (Hero heroes : allHerous) {
            System.out.println( heroes.apllysuperAbility());
        }


    }
}