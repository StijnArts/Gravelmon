package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Snowl extends drai.dev.data.pokemon.Pokemon {
    public Snowl() {
        super("Snowl",
                Type.GHOST, Type.ICE,
                new Stats(75,
                        87,
                        56,
                        76,
                        87,
                        87),
                List.of(Ability.SNOW_CLOAK,Ability.TOUGH_CLAWS,Ability.SNOW_WARNING), Ability.SNOW_WARNING,
                15, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Snowl represents the serenity and quietness of the snowy and dense forests of Norheim. They can whip up horrible blizzards with their wings against those who try to harm their habitat. This may also however harm their young."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,8),
                        new MoveLearnSetEntry(Move.SPITE,12),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,19),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,24),
                        new MoveLearnSetEntry(Move.ICY_WIND,29),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,33),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,38),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,42),
                        new MoveLearnSetEntry(Move.HURRICANE,55)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST, Biome.IS_TUNDRA)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Snowl");

    }


}
