package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rocabayo extends drai.dev.data.pokemon.Pokemon {
    public Rocabayo() {
        super("Rocabayo",
                Type.GRASS,
                new Stats(30,
                        70,
                        85,
                        20,
                        25,
                        85),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 286,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("coltroy", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(      new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,7),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,11),
                        new MoveLearnSetEntry(Move.YAWN,15),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,20),
                        new MoveLearnSetEntry(Move.SUBMISSION,24),
                        new MoveLearnSetEntry(Move.RETALIATE,27),
                        new MoveLearnSetEntry(Move.LEECH_SEED,32),
                        new MoveLearnSetEntry(Move.MILK_DRINK,39),
                        new MoveLearnSetEntry(Move.HORN_LEECH,45),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,51),
                        new MoveLearnSetEntry(Move.LEAF_STORM,57)                   ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(7)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Rocabayo");

    }


}
