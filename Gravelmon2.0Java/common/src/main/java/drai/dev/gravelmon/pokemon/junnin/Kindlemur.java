package drai.dev.gravelmon.pokemon.junnin;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Kindlemur extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kindlemur() {
        super("Kindlemur",
                Type.FIRE,
                new Stats(49,
                        51,
                        42,
                        62,
                        39,
                        67),
                List.of(Ability.BLAZE), Ability.COMPETITIVE,
                4, 165,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Kindlemur swings through the trees searching for dead wood, which it uses to make large fires on the ground. It does this to keep itself warm at night."),
                List.of(new EvolutionEntry("burmurly", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"17")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.TAUNT,9),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,15),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,17),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,23),
                        new MoveLearnSetEntry(Move.TORMENT,25),
                        new MoveLearnSetEntry(Move.FACADE,31),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,33),
                        new MoveLearnSetEntry(Move.ACROBATICS,39),
                        new MoveLearnSetEntry(Move.SLACK_OFF,41),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,47),
                        new MoveLearnSetEntry(Move.FIRE_PLEDGE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.BURNINGSNEEZE,"tm"),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"tm")                        ),
                List.of(Label.JUNNIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 3, 22, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE, Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.TREE_TOP),
                0.28, 0.3,
                List.of());
           setLangFileName("Kindlemur");

    }


}
