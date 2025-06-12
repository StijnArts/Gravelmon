package drai.dev.data.pokemon.aristos;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Tangorgon extends drai.dev.data.pokemon.Pokemon {
    public Tangorgon() {
        super("Tangorgon",
                Type.GRASS, Type.DARK,
                new Stats(75,
                        90,
                        50,
                        140,
                        50,
                        110),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAKE_TEARS,1),
                        new MoveLearnSetEntry(Move.IMPRISON,9),
                        new MoveLearnSetEntry(Move.SCREECH,14),
                        new MoveLearnSetEntry(Move.STRIDENTECHO,19),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,24),
                        new MoveLearnSetEntry(Move.CURSE,29),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,34),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,39),
                        new MoveLearnSetEntry(Move.DARK_PULSE,41),
                        new MoveLearnSetEntry(Move.MAGIC_POWDER,45),
                        new MoveLearnSetEntry(Move.HEX,48),
                        new MoveLearnSetEntry(Move.WORRY_SEED,52),
                        new MoveLearnSetEntry(Move.MAGICBACKLASH,56),
                        new MoveLearnSetEntry(Move.PERISH_SONG,64)              ),
                List.of(Label.ARISTOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(27)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Tangorgon");
        addAdditionalEvolution("tangela", new EvolutionEntry("tangorgon", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"cobblemon:dusk_stone"));

    }


}
