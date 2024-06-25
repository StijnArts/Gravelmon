package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Chaballic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chaballic() {
        super("Chaballic",
                Type.FAIRY, Type.DRAGON,
                new Stats(90,
                        71,
                        85,
                        106,
                        85,
                        68),
                List.of(Ability.ANALYTIC,Ability.COMPOUND_EYES), Ability.PRANKSTER,
                13, 216,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                188, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.FIELD),
                List.of("Chaballic can create large illusions of themselves by striking odd poses, and they use this to stun their foes in fear. They're very stubborn when it comes to changing colors."),
                List.of(),
                List.of(              new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.SLASH,1),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,1),
                        new MoveLearnSetEntry(Move.CONFUSION,4),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,6),
                        new MoveLearnSetEntry(Move.TELEPORT,9),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,11),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,14),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,17),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,19),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,23),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,26),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,31),
                        new MoveLearnSetEntry(Move.HELPING_HAND,35),
                        new MoveLearnSetEntry(Move.FEINT,40),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,44),
                        new MoveLearnSetEntry(Move.PROTECT,49),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,53),
                        new MoveLearnSetEntry(Move.STORED_POWER,58)          ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 28, 45, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chaballic");

    }


}
