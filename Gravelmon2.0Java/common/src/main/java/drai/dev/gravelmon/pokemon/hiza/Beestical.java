package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Beestical extends drai.dev.gravelmon.pokemon.Pokemon {
    public Beestical() {
        super("Beestical",
                Type.NORMAL,Type.BUG,
                new Stats(101,
                        91,
                        60,
                        84,
                        60,
                        96),
                List.of(Ability.TRIAGE), Ability.TRIAGE,
                7, 165,
                new Stats(2,0,0,0,0,0), 30,
                0.5,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.BUG),
                List.of("A rare Pokemon that only shows up during the spring. The sweet honey they make is said to be able to rejuvenate those who eat."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,5),
                        new MoveLearnSetEntry(Move.GUST,9),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,13),
                        new MoveLearnSetEntry(Move.HEAL_ORDER,16),
                        new MoveLearnSetEntry(Move.FELL_STINGER,19),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,23),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,25),
                        new MoveLearnSetEntry(Move.SAFEGUARD,27),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,31),
                        new MoveLearnSetEntry(Move.SLASH,35),
                        new MoveLearnSetEntry(Move.ATTACK_ORDER,39),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,44),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF,49),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,52),
                        new MoveLearnSetEntry(Move.WISH,57),
                        new MoveLearnSetEntry(Move.HEALING_WISH,66)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 28, 54, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPRING)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.HONEY_TREE),
                0.28, 0.3,
                List.of());
           setLangFileName("Beestical");

    }


}
