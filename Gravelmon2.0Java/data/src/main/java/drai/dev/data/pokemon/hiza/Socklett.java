package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Socklett extends drai.dev.data.pokemon.Pokemon {
    public Socklett() {
        super("Socklett",
                Type.ELECTRIC,
                new Stats(45,
                        80,
                        40,
                        33,
                        30,
                        82),
                List.of(Ability.VITAL_SPIRIT), Ability.MOLD_BREAKER,
                7, 165,
                new Stats(1,0,0,0,0,0), 190,
                0.5,
                60, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Socklett has an incredible sense of smell, making it easy to find its food. It coverts anything it eats into electric power."),
                List.of(new EvolutionEntry("hogawatt", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.CHARGE,5),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,9),
                        new MoveLearnSetEntry(Move.SPARK,13),
                        new MoveLearnSetEntry(Move.MUDSLAP,15),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,19),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,26),
                        new MoveLearnSetEntry(Move.ASSURANCE,28),
                        new MoveLearnSetEntry(Move.BULLDOZE,31),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,33),
                        new MoveLearnSetEntry(Move.ROAR,37),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,39),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,43)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Socklett");

    }


}
