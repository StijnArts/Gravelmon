package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Eucharite extends drai.dev.data.pokemon.Pokemon {
    public Eucharite() {
        super("Eucharite",
                Type.FIGHTING, Type.WATER,
                new Stats(70,
                        110,
                        70,
                        115,
                        70,
                        90),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 165,
                new Stats(0,1,0,1,0,0), 45,
                0.0,
                184, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Upon evolution the water in its vessel has turned into a sweet red wine, which Eucharite shares freely with its following, never seeming to deplete no matter the numbers."),
                List.of(),
                List.of(         new MoveLearnSetEntry(Move.HYPNOSIS,1),
                        new MoveLearnSetEntry(Move.MUD_SHOT,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,18),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,24),
                        new MoveLearnSetEntry(Move.BODY_SLAM,32),
                        new MoveLearnSetEntry(Move.EARTH_POWER,40),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,48),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,56),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,66)
                ),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(41)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Eucharite");

    }


}
