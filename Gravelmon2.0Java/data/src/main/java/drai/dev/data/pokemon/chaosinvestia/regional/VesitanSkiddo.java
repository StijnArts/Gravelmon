package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanSkiddo extends drai.dev.data.pokemon.Pokemon {
    public VesitanSkiddo(String name, Aspect aspect) {
        super(name, aspect, "VesitanSkiddo",
                Type.GRASS,Type.ROCK,
                new Stats(70,
                        68,
                        48,
                        41,
                        62,
                        69),
                List.of(Ability.SAP_SIPPER,Ability.GRASS_PELT), null,
                9, 310,
                new Stats(1,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Man sagt, es sei eines der ersten Pokémon, die mit Menschen zusammengelebt haben. Es ist sehr ruhig und friedfertig."),
                List.of(new EvolutionEntry("gogoat vesitan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEECH_SEED,12),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,16),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,9),
                        new MoveLearnSetEntry(Move.HORN_LEECH,42),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,13),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,38),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,45),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.BULLDOZE,26),
                        new MoveLearnSetEntry(Move.VINE_WHIP,7),
                        new MoveLearnSetEntry(Move.SYNTHESIS,20),
                        new MoveLearnSetEntry(Move.SEED_BOMB,30),
                        new MoveLearnSetEntry(Move.MILK_DRINK,50),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,22),
                        new MoveLearnSetEntry(Move.BULK_UP,34),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,"egg"),
                        new MoveLearnSetEntry(Move.MILK_DRINK,"egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"egg")                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(5)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Skiddo");

    }


}
