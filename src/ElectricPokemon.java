import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private static final String type = "Electric";
    private static final List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, type, level, hp, food, sound);
    }

    public void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunderPunch");
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() -10);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() -5);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() -15);
            }
            case "Electric":{
                System.out.println(enemy.getName() + " loses 3 hp");
                enemy.setHp(enemy.getHp() -3);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with electroBall");
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + " loses 8 hp");
                enemy.setHp(enemy.getHp() -8);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 4 hp");
                enemy.setHp(enemy.getHp() -4);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 12 hp");
                enemy.setHp(enemy.getHp() -12);
            }
            case "Electric":{
                System.out.println(enemy.getName() + " loses 2 hp");
                enemy.setHp(enemy.getHp() -2);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }
    //THUNDER HEEFT SPECIALITEIT
    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder");
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() -5);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 3 hp");
                enemy.setHp(enemy.getHp() -3);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 7 hp");
                enemy.setHp(enemy.getHp() -7);
            }
            case "Electric":{
                System.out.println(enemy.getName() + " gains 10 hp");
                name.setHp(name.getHp() + 10);
            }
        }
        //Thunder levert een hp boost aan electric Pokemons
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }
    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with voltTackle");
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + " loses 16 hp");
                enemy.setHp(enemy.getHp() -16);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 11 hp");
                enemy.setHp(enemy.getHp() -11);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() -20);
            }
            case "Electric":{
                System.out.println(enemy.getName() + " loses 7 hp");
                enemy.setHp(enemy.getHp() -7);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }
    public static List<String> getAttacks() {
        return attacks;
    }
}
