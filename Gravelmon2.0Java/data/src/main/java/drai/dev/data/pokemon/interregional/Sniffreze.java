package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Sniffreze extends drai.dev.data.pokemon.Pokemon {
    public Sniffreze() {
        super("Sniffreze",
                Type.ICE,
                new Stats(45,
                        40,
                        50,
                        70,
                        55,
                        60),
                List.of(Ability.TEARYEYED), Ability.INSOMNIA,
                6, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("kloakold", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))
                ),
                List.of(       new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.DISABLE,4),
                        new MoveLearnSetEntry(Move.ICE_SHARD,8),
                        new MoveLearnSetEntry(Move.SPITE,12),
                        new MoveLearnSetEntry(Move.ICY_WIND,16),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,20),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,24),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,28),
                        new MoveLearnSetEntry(Move.ICE_BEAM,32),
                        new MoveLearnSetEntry(Move.IMPRISON,36),
                        new MoveLearnSetEntry(Move.MIST,40),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,44),
                        new MoveLearnSetEntry(Move.FREEZEDRY,48),
                        new MoveLearnSetEntry(Move.BLIZZARD,52)
                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .isRaining()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Sniffreze");

    }


}
