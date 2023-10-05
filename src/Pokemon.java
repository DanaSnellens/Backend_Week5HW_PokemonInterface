import java.util.List;

public abstract class Pokemon implements PokemonGym {
    private final String Name;
    private final int hp;

    protected Pokemon(String name, int hp) {
        this.Name = name;
        this.hp = hp;
    }



    abstract void printPokemon(List<Pokemon> pokemons);

    abstract void enteredTheGym(PokemonTrainer);

}

