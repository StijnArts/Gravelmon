package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Snellow extends drai.dev.data.pokemon.Pokemon {
    public Snellow() {
        super("Snellow",
                Type.BUG, Type.GRASS,
                new Stats(105,
                        45,
                        100,
                        65,
                        125,
                        49),
                List.of(Ability.HARVEST,Ability.GLUTTONY), Ability.UNBURDEN,
                9, 218,
                new Stats(2,0,0,0,0,0), 120,
                0.5,
                145, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG,EggGroup.GRASS),
                List.of(""),
                List.of(),
                List.of(     new MoveLearnSetEntry(Move.RAZOR_LEAF,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,12),
                        new MoveLearnSetEntry(Move.PROTECT,16),
                        new MoveLearnSetEntry(Move.STUN_SPORE,20),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,24),
                        new MoveLearnSetEntry(Move.AIR_SLASH,26),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,28),
                        new MoveLearnSetEntry(Move.SILVER_WIND,32),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,36),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,40),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,45),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,50),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,54),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,61)                   ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(15)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_AUTUMN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Snellow");

    }


}
