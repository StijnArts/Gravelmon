package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Shocalf extends drai.dev.data.pokemon.Pokemon {
    public Shocalf() {
        super("Shocalf",
                Type.ELECTRIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("voltuff", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"19")))),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,5),
                        new MoveLearnSetEntry(Move.ARM_THRUST,7),
                        new MoveLearnSetEntry(Move.ENDURE,10),
                        new MoveLearnSetEntry(Move.MUDSLAP,13),
                        new MoveLearnSetEntry(Move.SPARK,17),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,21),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,25),
                        new MoveLearnSetEntry(Move.BULK_UP,29),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,33),
                        new MoveLearnSetEntry(Move.DIG,37),
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,40),
                        new MoveLearnSetEntry(Move.AMNESIA,46),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,51),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,56)
                ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Shocalf");

    }


}
