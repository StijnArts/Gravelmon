package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Trufftroff extends drai.dev.data.pokemon.Pokemon {
    public Trufftroff() {
        super("Trufftroff",
                Type.GROUND, Type.GRASS,
                new Stats(110,
                        93,
                        88,
                        77,
                        109,
                        33),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.ASTONISH,7),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,10),
                        new MoveLearnSetEntry(Move.MAGNITUDE,14),
                        new MoveLearnSetEntry(Move.BULLDOZE,21),
                        new MoveLearnSetEntry(Move.ROTOTILLER,24),
                        new MoveLearnSetEntry(Move.SEED_BOMB,30),
                        new MoveLearnSetEntry(Move.MORNING_SUN,34),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,39),
                        new MoveLearnSetEntry(Move.POWER_WHIP,44),
                        new MoveLearnSetEntry(Move.FISSURE,50)           ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST, Biome.IS_MUSHROOM)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Trufftroff");

    }


}
