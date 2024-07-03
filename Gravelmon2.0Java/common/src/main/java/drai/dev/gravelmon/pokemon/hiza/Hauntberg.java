package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Hauntberg extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hauntberg() {
        super("Hauntberg",
                Type.ICE, Type.GHOST,
                new Stats(105,
                        70,
                        100,
                        90,
                        75,
                        85),
                List.of(Ability.ICE_BODY), Ability.PERMAFROST,
                18, 165,
                new Stats(0,0,1,2,0,0), 45,
                0.5,
                234, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("It purposely swims towards ships in an attempt to sink them. Large ship graveyards are how it marks its territory."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ENCORE,7),
                        new MoveLearnSetEntry(Move.FLATTER,11),
                        new MoveLearnSetEntry(Move.ICY_WIND,16),
                        new MoveLearnSetEntry(Move.BRINE,18),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,29),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,32),
                        new MoveLearnSetEntry(Move.ICE_BEAM,36),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,40),
                        new MoveLearnSetEntry(Move.HEX,44),
                        new MoveLearnSetEntry(Move.FREEZEDRY,48),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,50),
                        new MoveLearnSetEntry(Move.DISABLE,54),
                        new MoveLearnSetEntry(Move.BLIZZARD,57),
                        new MoveLearnSetEntry(Move.SHEER_COLD,60)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 40, 56, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN, Biome.IS_FROZEN_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
