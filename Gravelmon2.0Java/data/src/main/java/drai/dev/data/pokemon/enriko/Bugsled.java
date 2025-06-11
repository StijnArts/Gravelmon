package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Bugsled extends drai.dev.data.pokemon.Pokemon {
    public Bugsled() {
        super("Bugsled",
                Type.BUG, Type.ICE,
                new Stats(120,
                        100,
                        80,
                        10,
                        60,
                        110),
                List.of(Ability.SPEED_BOOST), Ability.REFRIGERATE,
                13, 165,
                new Stats(0,0,0,0,0,0), 90,
                0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is trapped in a cocoon from which it will never hatch. By gaining momentum, it can accelerate to almost 180 miles per hour in search of a mate."),
                List.of(),
                List.of(            new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,5),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,10),
                        new MoveLearnSetEntry(Move.HARDEN,16),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,20),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,26)                ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Bugsled");

    }


}
