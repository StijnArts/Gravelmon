package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pupanel extends drai.dev.data.pokemon.Pokemon {
    public Pupanel() {
        super("Pupanel",
                Type.ICE, Type.BUG,
                new Stats(45,
                        35,
                        70,
                        75,
                        95,
                        45),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 0,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("prismarch", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(
                        new MoveLearnSetEntry(Move.ATTRACT,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,4),
                        new MoveLearnSetEntry(Move.INFESTATION,8),
                        new MoveLearnSetEntry(Move.MIST,12),
                        new MoveLearnSetEntry(Move.DEFOG,16),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,21),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,24),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,28),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,32),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,36),
                        new MoveLearnSetEntry(Move.BLIZZARD,40),
                        new MoveLearnSetEntry(Move.TAILWIND,44),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,48),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,52)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(22)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Pupanel");

    }


}
