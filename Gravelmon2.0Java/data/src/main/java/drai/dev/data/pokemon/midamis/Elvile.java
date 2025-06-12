package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Elvile extends drai.dev.data.pokemon.Pokemon {
    public Elvile() {
        super("Elvile",
                Type.NORMAL, Type.GROUND,
                new Stats(90,
                        65,
                        95,
                        55,
                        55,
                        55),
                List.of(Ability.SUPER_LUCK), Ability.SUPER_LUCK,
                14, 165,
                new Stats(2,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUD_SHOT,1),
                        new MoveLearnSetEntry(Move.STOMP,24),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,35),
                        new MoveLearnSetEntry(Move.FLAIL,39),
                        new MoveLearnSetEntry(Move.RETURN,43),
                        new MoveLearnSetEntry(Move.EARTH_POWER,49),
                        new MoveLearnSetEntry(Move.BITE,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ME_FIRST,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(19)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Elvile");

    }


}
