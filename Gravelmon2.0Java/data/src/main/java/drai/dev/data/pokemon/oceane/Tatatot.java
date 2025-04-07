package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import java.util.*;

public class Tatatot extends drai.dev.data.pokemon.Pokemon {
    public Tatatot() {
        super("Tatatot",
                Type.NORMAL, Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 165,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("drumbum", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"17")))),
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
                        new MoveLearnSetEntry(Move.HEALING_WISH,66)
                ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 3, 22, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Tatatot");

    }


}
