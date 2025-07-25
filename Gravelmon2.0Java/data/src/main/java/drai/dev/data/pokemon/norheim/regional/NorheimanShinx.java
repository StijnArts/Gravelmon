package drai.dev.data.pokemon.norheim.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class NorheimanShinx extends drai.dev.data.pokemon.Pokemon {
    public NorheimanShinx() {
        super("Shinx",
                Type.ICE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SNOW_CLOAK,Ability.INTIMIDATE,Ability.GUTS), Ability.GUTS,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The cold Norheiman weather has made Shinx more sturdy in its structure. Its large paws prevents it from sinking into the deep snow found throughout the region. The whiskers located on Shinx’s chin helps it navigate through heavy snowfall."),
                List.of(),
                List.of(),
                List.of(Label.NORHEIM),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Shinx");

    }


}
