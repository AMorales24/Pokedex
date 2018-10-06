package angelomorales.com.pokedex;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PokeLab {
    private static PokeLab sCrimeLab;

    private List<Pokemon> mPokemons;

    public static PokeLab get(Context context) {
        if (sPokeLab == null) {
            sPokeLab = new PokeLab(context);
        }
        return sPokeLab;
    }
    private PokeLab(Context context) {
        mPokemons = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Pokemon pokemon = new Pokemon();
            pokemon.setTitle("Pokemon #" + i);
            pokemon.setSolved(i % 2 == 0); // Every other one
            mPokemons.add(pokemon);
        }

    }

    public List<Pokemon> getCrimes() {
        return mPokemons;
    }

    public Pokemon getCrime(UUID id) {
        for (Pokemon pokemon : mPokemons) {
            if (pokemon.getId().equals(id)) {
                return pokemon;
            }
        }
        return null;
    }
}
