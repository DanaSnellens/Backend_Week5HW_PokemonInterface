import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private static final String type = "Water";
    private static final List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, type, level, hp, food, sound);
    }

    public void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with surf");
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + " loses 3 hp");
                enemy.setHp(enemy.getHp() -3);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 7 hp");
                enemy.setHp(enemy.getHp() -7);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 1 hp");
                enemy.setHp(enemy.getHp() -1);
            }
            case "Electric":{
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() -5);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroPump");
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() -10);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 18 hp");
                enemy.setHp(enemy.getHp() -18);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 7 hp");
                enemy.setHp(enemy.getHp() -7);
            }
            case "Electric":{
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() -15);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroCanon");
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + " loses 6 hp");
                enemy.setHp(enemy.getHp() -6);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 11 hp");
                enemy.setHp(enemy.getHp() -11);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 4 hp");
                enemy.setHp(enemy.getHp() -4);
            }
            case "Electric":{
                System.out.println(enemy.getName() + " loses 9 hp");
                enemy.setHp(enemy.getHp() -9);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }
    //rainDance levert een hp boost aan vijanden van Grass type
    //rainDance heeft geen effect op electric Pokemons, maar geeft
    // een system.out.println met de boodschap: "has no effect on (vijand)";
    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with rainDance");
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + " gets a boost of 16 hp");
                enemy.setHp(enemy.getHp() +16);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 11 hp");
                enemy.setHp(enemy.getHp() -11);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 2 hp");
                enemy.setHp(enemy.getHp() -2);
            }
            case "Electric":{
                System.out.println("Has no effect on "+ enemy.getName());
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
    }
    public static List<String> getAttacks() {
        return attacks;
    }
}


