package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mowzumi extends drai.dev.data.pokemon.Pokemon {
    public Mowzumi() {
        super("Mowzumi",
                Type.NORMAL,
                new Stats(90,
                        65,
                        90,
                        55,
                        60,
                        45),
                List.of(Ability.THICK_FAT,Ability.TECHNICIAN), Ability.CHEEK_POUCH,
                14, 80,
                new Stats(2,0,0,0,0,0), 127,
                0.5,
                182, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Mowzumi have tough hairs on their tails, and hang out in groups to protect their young."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Mowzumi");

    }


}
