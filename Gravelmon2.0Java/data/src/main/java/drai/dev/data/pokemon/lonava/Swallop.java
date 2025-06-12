package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Swallop extends drai.dev.data.pokemon.Pokemon {
    public Swallop() {
        super("Swallop",
                Type.NORMAL, Type.FIGHTING,
                new Stats(77,
                        96,
                        54,
                        45,
                        76,
                        78),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("These waterbirds mate for life, only settling down with a Swallop of equal strength. They battle relentlessly to pick their partner, resulting in the creation of the Lonavan Society for the Protection of Birds — or the LSPB — whose members hide near lakes, waiting to jump in and apply medical aid to injured Swallop."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,13),
                        new MoveLearnSetEntry(Move.WING_ATTACK,17),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,21),
                        new MoveLearnSetEntry(Move.ENDEAVOR,25),
                        new MoveLearnSetEntry(Move.DETECT,29),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,33),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,38),
                        new MoveLearnSetEntry(Move.SWAGGER,43),
                        new MoveLearnSetEntry(Move.DRILL_PECK,48),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,54)
                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(23)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST, Biome.IS_PLAINS)
    .setSpawnPreset(SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Swallop");

    }


}
