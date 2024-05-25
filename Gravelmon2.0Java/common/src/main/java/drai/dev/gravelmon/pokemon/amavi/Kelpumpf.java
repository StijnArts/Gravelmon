package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Kelpumpf extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kelpumpf() {
        super("Kelpumpf",
                Type.GHOST, Type.GRASS,
                new Stats(85,
                        55,
                        60,
                        15,
                        45,
                        75),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,0,0,0,0,0), 180,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("dispariot", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(            new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.WORRY_SEED,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,3),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,6),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,9),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,13),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,17),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,20),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,24),
                        new MoveLearnSetEntry(Move.WILLOWISP,27),
                        new MoveLearnSetEntry(Move.LEAF_SHIELD,30),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,34),
                        new MoveLearnSetEntry(Move.HORN_LEECH,38),
                        new MoveLearnSetEntry(Move.CURSE,42),
                        new MoveLearnSetEntry(Move.KARMA_BEAM,47),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,51),
                        new MoveLearnSetEntry(Move.TERRORIZE,55),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,60),
                        new MoveLearnSetEntry(Move.LEAF_STORM,64)            ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 8, 33, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kelpump");

    }


}
