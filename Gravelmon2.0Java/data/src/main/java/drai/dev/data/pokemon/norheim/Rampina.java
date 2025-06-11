package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Rampina extends drai.dev.data.pokemon.Pokemon {
    public Rampina(Stats stats) {
        super("Rampina",
                Type.NORMAL, Type.FIGHTING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,5),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,10),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,13),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,15),
                        new MoveLearnSetEntry(Move.SWIFT,18),
                        new MoveLearnSetEntry(Move.ROUND,20),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,25),
                        new MoveLearnSetEntry(Move.DETECT,27),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,30),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,33),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,37),
                        new MoveLearnSetEntry(Move.IRON_TAIL,41),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,45)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Rampina");

    }


}
