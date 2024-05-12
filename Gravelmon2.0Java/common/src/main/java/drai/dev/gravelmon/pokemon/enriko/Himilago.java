package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Himilago extends drai.dev.gravelmon.pokemon.Pokemon {
    public Himilago() {
        super("Himilago",
                Type.BUG, Type.ICE,
                new Stats(40,
                        80,
                        60,
                        120,
                        40,
                        140),
                List.of(Ability.SNOW_WARNING), Ability.SLUSH_RUSH,
                14, 165,
                new Stats(0,0,2,2,0,0), 90,
                0.5,
                210, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("After emerging from its frozen cocoon, Himilago rides clouds of icy mist and fog, living a carefree and jovial life. Its wings scatter snowflakes wherever it flies."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RAGE_POWDER,1),
                        new MoveLearnSetEntry(Move.SILVER_WIND,30),
                        new MoveLearnSetEntry(Move.ICE_BEAM,32),
                        new MoveLearnSetEntry(Move.REST,36),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,42),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,48),
                        new MoveLearnSetEntry(Move.SPIKES,54),
                        new MoveLearnSetEntry(Move.BLIZZARD,63)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
