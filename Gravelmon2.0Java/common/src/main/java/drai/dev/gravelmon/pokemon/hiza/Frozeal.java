package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Frozeal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Frozeal() {
        super("Frozeal",
                Type.ICE,
                new Stats(75,
                        50,
                        80,
                        75,
                        60,
                        60),
                List.of(Ability.ICE_BODY), Ability.PERMAFROST,
                15, 165,
                new Stats(0,0,1,1,0,0), 120,
                0.5,
                119, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("The icy chunks on its body can never melt. It uses its icy breath to freeze alive fish that are too fast for it."),
                List.of(new EvolutionEntry("hauntberg", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))
                ),
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
                        new MoveLearnSetEntry(Move.FREEZEDRY,46),
                        new MoveLearnSetEntry(Move.DISABLE,51),
                        new MoveLearnSetEntry(Move.BLIZZARD,55)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 25, 45, 2, List.of(
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
