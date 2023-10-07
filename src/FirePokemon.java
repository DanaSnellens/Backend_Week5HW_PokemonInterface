import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private static final String type = "Fire";
    private static final List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, type, level, hp, food, sound);
    }

    public void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with fireLash");
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + " loses 4 hp");
                enemy.setHp(enemy.getHp() -4);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 1 hp");
                enemy.setHp(enemy.getHp() -1);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 3 hp");
                enemy.setHp(enemy.getHp() -3);
            }
            case "Electric":{
                System.out.println(enemy.getName() + " loses 2 hp");
                enemy.setHp(enemy.getHp() -2);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with flameThrower");
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + " loses 8 hp");
                enemy.setHp(enemy.getHp() -8);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 2 hp");
                enemy.setHp(enemy.getHp() -2);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 6 hp");
                enemy.setHp(enemy.getHp() -6);
            }
            case "Electric":{
                System.out.println(enemy.getName() + " loses 4 hp");
                enemy.setHp(enemy.getHp() -4);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroBall");
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + " loses 12 hp");
                enemy.setHp(enemy.getHp() -12);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 3 hp");
                enemy.setHp(enemy.getHp() -3);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 9 hp");
                enemy.setHp(enemy.getHp() -9);
            }
            case "Electric":{
                System.out.println(enemy.getName() + " loses 6 hp");
                enemy.setHp(enemy.getHp() -6);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }
    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno");
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + " loses 16 hp");
                enemy.setHp(enemy.getHp() -16);
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
                System.out.println(enemy.getName() + " loses 8 hp");
                enemy.setHp(enemy.getHp() -8);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }
    public static List<String> getAttacks() {
        return attacks;
    }
}



