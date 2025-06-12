package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Frossit extends drai.dev.data.pokemon.Pokemon {
    public Frossit() {
        super("Frossit",
                Type.WATER, Type.ICE,
                new Stats(90,
                        50,
                        75,
                        85,
                        100,
                        60),
                List.of(Ability.ICE_BODY,Ability.WATER_VEIL,Ability.SWIFT_SWIM), Ability.SWIFT_SWIM,
                11, 165,
                new Stats(0,0,0,0,2,0), 75,
                0.5,
                113, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("With the addition of its Ice-type, it is able to deliver powerful attacks at freezing temperatures. It will freeze a foe when threatened."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FREEZEDRY,1),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,41),
                        new MoveLearnSetEntry(Move.ICE_BEAM,46),
                        new MoveLearnSetEntry(Move.BLIZZARD,53),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TICKLE,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .setAntiBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
           setLangFileName("Frossit");

    }


}
