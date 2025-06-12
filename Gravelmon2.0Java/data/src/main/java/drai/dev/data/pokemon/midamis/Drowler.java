package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Drowler extends drai.dev.data.pokemon.Pokemon {
    public Drowler() {
        super("Drowler",
                Type.GRASS, Type.DRAGON,
                new Stats(60,
                        85,
                        65,
                        70,
                        65,
                        60),
                List.of(Ability.CHLOROPHYLL), Ability.CHLOROPHYLL,
                15, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("foratt", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"50")))),
                List.of(                 new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,3),
                        new MoveLearnSetEntry(Move.BITE,7),
                        new MoveLearnSetEntry(Move.SNAP_TRAP,10),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,11),
                        new MoveLearnSetEntry(Move.INGRAIN,15),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,17),
                        new MoveLearnSetEntry(Move.SEED_BOMB,21),
                        new MoveLearnSetEntry(Move.SLAM,25),
                        new MoveLearnSetEntry(Move.LEECH_SEED,28),
                        new MoveLearnSetEntry(Move.SYNTHESIS,30),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,31),
                        new MoveLearnSetEntry(Move.CRUNCH,34),
                        new MoveLearnSetEntry(Move.LEAF_STORM,40),
                        new MoveLearnSetEntry(Move.OUTRAGE,46)       ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(31)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FLORAL)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Drowler");

    }


}
