package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Gnawgorus extends drai.dev.data.pokemon.Pokemon {
    public Gnawgorus() {
        super("Gnawgorus",
                Type.WATER, Type.DARK,
                new Stats(115,
                        90,
                        120,
                        60,
                        80,
                        40),
                List.of(Ability.INTIMIDATE), Ability.SWIFT_SWIM,
                19, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.POISON_FANG,4),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,8),
                        new MoveLearnSetEntry(Move.SCARY_FACE,12),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.ICE_FANG,20),
                        new MoveLearnSetEntry(Move.SCREECH,24),
                        new MoveLearnSetEntry(Move.SWAGGER,28),
                        new MoveLearnSetEntry(Move.CRUNCH,32),
                        new MoveLearnSetEntry(Move.AGILITY,36),
                        new MoveLearnSetEntry(Move.LIQUIDATION,40),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,44)),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(48)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
