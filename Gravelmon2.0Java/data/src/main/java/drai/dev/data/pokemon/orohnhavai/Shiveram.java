package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Shiveram extends drai.dev.data.pokemon.Pokemon {
    public Shiveram() {
        super("Shiveram",
                Type.ICE, Type.NORMAL,
                new Stats(90,
                        90,
                        130,
                        50,
                        80,
                        80),
                List.of(Ability.SNOW_CLOAK,Ability.RECKLESS,Ability.FUR_COAT), Ability.FUR_COAT,
                17, 165,
                new Stats(0,0,3,0,0,0), 54,
                0.5,
                183, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("When Snowool are desperate for protection in the harsh winter cold, the strongest, most bravest Snowool will evolve into Shiveram. It's capable of tanking insanely powerful blows, and reaching ramming speeds of 25 miles per hour."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,3),
                        new MoveLearnSetEntry(Move.ICY_WIND,7),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,10),
                        new MoveLearnSetEntry(Move.MIST,12),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,16),
                        new MoveLearnSetEntry(Move.ICE_SHARD,19),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,23),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,25),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,30),
                        new MoveLearnSetEntry(Move.AVALANCHE,34),
                        new MoveLearnSetEntry(Move.REST,36),
                        new MoveLearnSetEntry(Move.BLIZZARD,41),
                        new MoveLearnSetEntry(Move.HEAD_CHARGE,44)                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FREEZING, Biome.IS_SNOWY)
    .setAntiBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Shiveram");

    }


}
