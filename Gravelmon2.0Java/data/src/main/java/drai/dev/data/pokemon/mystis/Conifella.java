package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Conifella extends drai.dev.data.pokemon.Pokemon {
    public Conifella() {
        super("Conifella",
                Type.GRASS, Type.FAIRY,
                new Stats(90,
                        80,
                        90,
                        90,
                        90,
                        50),
                List.of(Ability.SNOW_CLOAK,Ability.THICK_FAT), Ability.PERMAFROST,
                109, 3629,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                172, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Design Assistance: Scarffles"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,1)                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(32).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA, Biome.IS_SNOWY_FOREST).duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Conifella");

    }


}
