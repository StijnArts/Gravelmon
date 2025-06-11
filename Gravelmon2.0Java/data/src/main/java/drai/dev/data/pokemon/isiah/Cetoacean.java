package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cetoacean extends drai.dev.data.pokemon.Pokemon {
    public Cetoacean() {
        super("Cetoacean",
                Type.GHOST, Type.WATER,
                new Stats(121,
                        55,
                        75,
                        65,
                        75,
                        44),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                28, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VORTEXDRAIN,1),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,5),
                        new MoveLearnSetEntry(Move.FAKE_OUT,10),
                        new MoveLearnSetEntry(Move.HAZE,14),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,17),
                        new MoveLearnSetEntry(Move.MIMIC,22),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,26),
                        new MoveLearnSetEntry(Move.ENCORE,32),
                        new MoveLearnSetEntry(Move.HEX,35),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,41),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,45),
                        new MoveLearnSetEntry(Move.POLTERGEIST,51),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,60)
                ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(31)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_DEEP_OCEAN)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Cetoacean");

    }


}
