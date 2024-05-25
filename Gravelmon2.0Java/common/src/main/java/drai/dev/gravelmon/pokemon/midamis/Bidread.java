package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Bidread extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bidread() {
        super("Bidread",
                Type.GHOST, Type.DARK,
                new Stats(90,
                        75,
                        60,
                        70,
                        100,
                        65),
                List.of(Ability.LEVITATE), Ability.CURSED_BODY,
                12, 165,
                new Stats(0,0,0,0,2,0), 45,
                0.125,
                128, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.FLYING),
                List.of("Bidread were once thought to be messengers of a bad omen, using the orb they carry for fortune telling. A young man would train a Bidaune before his wedding, and if it evolved in to a Bidengel he would be blessed in marriage, but cursed if it evolved in to a Bidread. Such myths have long since died out, however."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.SPITE,4),
                        new MoveLearnSetEntry(Move.SAFEGUARD,7),
                        new MoveLearnSetEntry(Move.WING_ATTACK,12),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,15),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,18),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,23),
                        new MoveLearnSetEntry(Move.RECOVER,32),
                        new MoveLearnSetEntry(Move.HEX,36),
                        new MoveLearnSetEntry(Move.TAILWIND,41),
                        new MoveLearnSetEntry(Move.DARK_PULSE,45),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,49),
                        new MoveLearnSetEntry(Move.GUST,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.MIMIC,"tm"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 28, 47, 1, List.of(
                    new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
