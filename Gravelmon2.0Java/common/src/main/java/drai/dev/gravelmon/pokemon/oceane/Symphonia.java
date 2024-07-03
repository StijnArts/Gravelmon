package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Symphonia extends drai.dev.gravelmon.pokemon.Pokemon {
    public Symphonia() {
        super("Symphonia",
                Type.NORMAL, Type.BUG,
                new Stats(80,
                        70,
                        70,
                        135,
                        90,
                        60),
                List.of(Ability.MAGIC_BOUNCE), Ability.TECHNICIAN,
                15, 165,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                227, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
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
                        new MoveLearnSetEntry(Move.HEALING_WISH,66)
                ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 31, 54, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Symphonia");

    }


}
