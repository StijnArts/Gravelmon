package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Canaring extends drai.dev.data.pokemon.Pokemon {
    public Canaring() {
        super("Canaring",
                Type.STEEL,Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.FOREWARN), Ability.ANTICIPATION,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Canaring spend most of their time sitting on their bells, as flying for long periods of time is difficult. Many ancient towns would have one Canaring in them that could be used as an alarm of incoming danger, such a wildfire or incoming attack."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.UPROAR,1),
                        new MoveLearnSetEntry(Move.BOOMBURST,1),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,1),
                        new MoveLearnSetEntry(Move.STEEL_WING,1),
                        new MoveLearnSetEntry(Move.HEAL_BELL,1),
                        new MoveLearnSetEntry(Move.METAL_SOUND,1)),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Canaring");

    }


}
