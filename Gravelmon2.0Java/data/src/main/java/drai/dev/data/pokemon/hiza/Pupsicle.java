package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pupsicle extends drai.dev.data.pokemon.Pokemon {
    public Pupsicle() {
        super("Pupsicle",
                Type.ICE,
                new Stats(60,
                        40,
                        50,
                        50,
                        50,
                        40),
                List.of(Ability.ICE_BODY), Ability.PERMAFROST,
                8, 165,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                58, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("They make large icebergs their home. Their skin is so cold it can freeze on contact."),
                List.of(new EvolutionEntry("frozeal", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ENCORE,7),
                        new MoveLearnSetEntry(Move.FLATTER,11),
                        new MoveLearnSetEntry(Move.ICY_WIND,16),
                        new MoveLearnSetEntry(Move.BRINE,18),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,26),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,29),
                        new MoveLearnSetEntry(Move.ICE_BEAM,32),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,35),
                        new MoveLearnSetEntry(Move.FREEZEDRY,44),
                        new MoveLearnSetEntry(Move.DISABLE,48),
                        new MoveLearnSetEntry(Move.BLIZZARD,50)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 3, 22, 9, List.of(
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
