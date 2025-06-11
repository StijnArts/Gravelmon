package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Wrigormort extends drai.dev.data.pokemon.Pokemon {
    public Wrigormort() {
        super("Wrigormort",
                Type.BUG, Type.POISON,
                new Stats(75,
                        95,
                        115,
                        90,
                        115,
                        55),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                19, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Notorious for defiling graves to search for food, able to strip meat from an entire carcass in minutes. When in danger, it regurgitates rotting meat."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.BIND,5),
                        new MoveLearnSetEntry(Move.BUG_BITE,8),
                        new MoveLearnSetEntry(Move.HARDEN,11),
                        new MoveLearnSetEntry(Move.ACID,15),
                        new MoveLearnSetEntry(Move.RECYCLE,19),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,24),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,29),
                        new MoveLearnSetEntry(Move.STEAMROLLER,35),
                        new MoveLearnSetEntry(Move.WRING_OUT,45)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.RARE)
    .setMinLevel(44)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Wrigormort");

    }


}
