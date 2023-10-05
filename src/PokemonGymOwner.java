import java.util.List;

public class PokemonGymOwner {
    String Name;
    String Town;
    List<Pokemon> pokemons;
    public PokemonGymOwner(String Name, String Town, List<Pokemon> pokemons) {
        this.Name = Name;
        this.Town = Town;
        this.pokemons = pokemons;
    }

    public String getName() {
        return Name;
    }

    public String getTown() {
        return Town;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
