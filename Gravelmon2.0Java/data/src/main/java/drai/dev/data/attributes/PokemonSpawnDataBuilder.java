package drai.dev.data.attributes;

import java.util.*;

public class PokemonSpawnDataBuilder {
    private final PokemonSpawnData pokemonSpawnData = PokemonSpawnData.placeholder().get(0);
    public List<PokemonSpawnData> build() {
        return new ArrayList<>(List.of(pokemonSpawnData));
    }


}
