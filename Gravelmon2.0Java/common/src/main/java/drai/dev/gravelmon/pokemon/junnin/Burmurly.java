package drai.dev.gravelmon.pokemon.junnin;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Burmurly extends drai.dev.gravelmon.pokemon.Pokemon {
    public Burmurly() {
        super("Burmurly",
                Type.FIRE,
                new Stats(63,
                        71,
                        52,
                        84,
                        44,
                        91),
                List.of(Ability.BLAZE), Ability.COMPETITIVE,
                8, 165,
                new Stats(0,0,0,1,0,1), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Burmurly swings though the trees with such speed that it has been nicknamed 'the Flaming Flash'. It's very careful not to set the branches from which it swings aflame."),
                List.of(new EvolutionEntry("merculey", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))
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
                        new MoveLearnSetEntry(Move.BURNINGSNEEZE,"tm"),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"tm")                        ),
                List.of(Label.JUNNIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 46, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE, Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.TREE_TOP),
                0.28, 0.3,
                List.of());
           setLangFileName("Burmurly");

    }


}
