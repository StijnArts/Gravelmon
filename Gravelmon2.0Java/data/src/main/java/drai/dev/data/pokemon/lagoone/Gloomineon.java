package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gloomineon extends drai.dev.data.pokemon.Pokemon {
    public Gloomineon() {
        super("Gloomineon",
                Type.GHOST, Type.FLYING,
                new Stats(89,
                        89,
                        76,
                        89,
                        91,
                        116),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 390,
                new Stats(0,0,0,0,0,3), 20,
                0.5,
                260, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.GUST,5),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,9),
                        new MoveLearnSetEntry(Move.WHIRLWIND,14),
                        new MoveLearnSetEntry(Move.GRAVITY_WAVE,19),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,23),
                        new MoveLearnSetEntry(Move.SAFEGUARD,27),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,32),
                        new MoveLearnSetEntry(Move.AIR_SLASH,37),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,41),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,45),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,50),
                        new MoveLearnSetEntry(Move.REFLECT,50),
                        new MoveLearnSetEntry(Move.TYPHOON,55)
                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(52)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_DEEP_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Gloomineon");

    }


}
