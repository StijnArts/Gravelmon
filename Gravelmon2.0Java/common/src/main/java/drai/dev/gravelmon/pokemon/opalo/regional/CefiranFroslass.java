package drai.dev.gravelmon.pokemon.opalo.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class CefiranFroslass extends Pokemon {
    public CefiranFroslass(String name, Aspect aspect) {
        super(name, aspect,"CefiranFroslass",
                Type.GHOST, Type.GROUND,
                new Stats(70,80,70,110,95,70),
                List.of(Ability.SHADOW_TAG), Ability.CURSED_BODY,
                13, 266,
                new Stats(0,0,0,2,0,0), 75,
                0,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY, EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP, 1),
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, 1),
                        new MoveLearnSetEntry(Move.ASTONISH, 1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, 4),
                        new MoveLearnSetEntry(Move.ASTONISH, 10),
                        new MoveLearnSetEntry(Move.MUD_SHOT, 13),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY, 19),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND, 22),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP, 28),
                        new MoveLearnSetEntry(Move.CAPTIVATE, 31),
                        new MoveLearnSetEntry(Move.EARTH_POWER, 37),
                        new MoveLearnSetEntry(Move.SANDSTORM, 40),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, 45),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, 51),
                        new MoveLearnSetEntry(Move.DESTINY_BOND, 59),
                        new MoveLearnSetEntry(Move.AVALANCHE, "egg"),
                        new MoveLearnSetEntry(Move.TACKLE, "egg"),
                        new MoveLearnSetEntry(Move.BLOCK, "egg"),
                        new MoveLearnSetEntry(Move.DISABLE, "egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, "egg"),
                        new MoveLearnSetEntry(Move.HEX, "egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT, "egg"),
                        new MoveLearnSetEntry(Move.SPIKES, "egg"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL, "egg")
                ),
                List.of(Label.GEN3,Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 41, 48, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Froslass");
        setCanFly(true);
    }
}
