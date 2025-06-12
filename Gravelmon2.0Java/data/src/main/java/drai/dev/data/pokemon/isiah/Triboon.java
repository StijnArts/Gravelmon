package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Triboon extends drai.dev.data.pokemon.Pokemon {
    public Triboon() {
        super("Triboon",
                Type.NORMAL, Type.FIGHTING,
                new Stats(74,
                        113,
                        52,
                        78,
                        74,
                        94),
                List.of(Ability.INTIMIDATE,Ability.RELENTLESS,Ability.TANGLED_FEET), Ability.TANGLED_FEET,
                14, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TICKLE,7),
                        new MoveLearnSetEntry(Move.LOW_KICK,13),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,19),
                        new MoveLearnSetEntry(Move.SWIFT,22),
                        new MoveLearnSetEntry(Move.SLAM,26),
                        new MoveLearnSetEntry(Move.VINESWING,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,"tm")                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(7)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TROPICAL_ISLAND, Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Triboon");

    }


}
