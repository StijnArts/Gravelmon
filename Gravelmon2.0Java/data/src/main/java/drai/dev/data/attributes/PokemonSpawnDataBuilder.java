package drai.dev.data.attributes;

import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class PokemonSpawnDataBuilder {
    private final PokemonSpawnData pokemonSpawnData = PokemonSpawnData.placeholder().get(0);

    public PokemonSpawnDataBuilder(){

    }

    public List<PokemonSpawnData> build() {
        return new ArrayList<>(List.of(pokemonSpawnData));
    }

    public PokemonSpawnDataBuilder addBiomes(Biome... biomes){
        pokemonSpawnData.getBiomeSpawnCondition().getBiomes().addAll(Arrays.asList(biomes));
        return this;
    }

    public PokemonSpawnDataBuilder mustHaveSkyAccess(boolean canSeeSky){
        var opt = pokemonSpawnData.spawnConditions().stream().filter(spawnCondition -> spawnCondition.getConditionKind() == SpawnConditionType.CANSEESKY).findFirst();
        if(opt.isPresent()) {
            opt.get().setCondition(canSeeSky + "");
            return this;
        }
        return this;
    }

    public PokemonSpawnDataBuilder setMaxSpawnLevel(){

        return this;
    }



}
