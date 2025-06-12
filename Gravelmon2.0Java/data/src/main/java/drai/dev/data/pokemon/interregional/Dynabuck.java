package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Dynabuck extends drai.dev.data.pokemon.Pokemon {
    public Dynabuck() {
        super("Dynabuck",
                Type.FIRE, Type.STEEL,
                new Stats(85,
                        140,
                        50,
                        55,
                        60,
                        95),
                List.of(Ability.ANGER_POINT), Ability.LIMBER,
                12, 165,
                new Stats(0,0,0,0,0,0), 100,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(  new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.EMBER,5),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,8),
                        new MoveLearnSetEntry(Move.BULLDOZE,12),
                        new MoveLearnSetEntry(Move.INCINERATE,15),
                        new MoveLearnSetEntry(Move.AMNESIA,19),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,22),
                        new MoveLearnSetEntry(Move.EARTH_POWER,26),
                        new MoveLearnSetEntry(Move.CURSE,29),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,31),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,40),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,43),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,47)),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_VOLCANIC, Biome.IS_NETHER_FOREST)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Dynabuck");

    }


}
