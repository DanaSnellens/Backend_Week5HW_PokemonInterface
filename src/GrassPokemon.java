import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private static final String type = "Grass";
    private static final List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, type, level, hp, food, sound);
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leafStorm");
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() -5);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 11 hp");
                enemy.setHp(enemy.getHp() -11);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 8 hp");
                enemy.setHp(enemy.getHp() -8);
            }
            case "Electric":{
                System.out.println(enemy.getName() + " loses 14 hp");
                enemy.setHp(enemy.getHp() -14);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }

    void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with solarBeam");
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() -5);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() -10);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 8 hp");
                enemy.setHp(enemy.getHp() -8);
            }
            case "Electric":{
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() -15);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }
    //LeechSeed trekt hp van de vijand af en geeft deze hp aan de aanvallende Pokémon terug;
    void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leechSeed");
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + " loses 2 hp and " + name.getName() + " gets 2 hp.");
                enemy.setHp(enemy.getHp() -2);
                name.setHp(name.getHp() +2);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 6 hp and " + name.getName() + " gets 6 hp.");
                enemy.setHp(enemy.getHp() -6);
                name.setHp(name.getHp() +6);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 4 hp and " + name.getName() + " gets 4 hp.");
                enemy.setHp(enemy.getHp() -4);
                name.setHp(name.getHp() +4);
            }
            case "Electric": {
                System.out.println(enemy.getName() + " loses 8 hp and " + name.getName() + " gets 8 hp.");
                enemy.setHp(enemy.getHp() -8);
                name.setHp(name.getHp() +8);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
        System.out.println(name.getName() + " has " + name.getHp() + " hp left.");
    }
    void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leaveBlade");
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + " loses 3 hp");
                enemy.setHp(enemy.getHp() -3);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 9 hp");
                enemy.setHp(enemy.getHp() -9);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 6 hp");
                enemy.setHp(enemy.getHp() -6);
            }
            case "Electric":{
                System.out.println(enemy.getName() + " loses 12 hp");
                enemy.setHp(enemy.getHp() -12);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }
    public static List<String> getAttacks() {
        return attacks;
    }
}

