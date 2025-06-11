package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Najaconda extends drai.dev.data.pokemon.Pokemon {
    public Najaconda() {
        super("Najaconda",
                Type.POISON, Type.DARK,
                new Stats(80,
                        95,
                        95,
                        95,
                        95,
                        80),
                List.of(Ability.SHED_SKIN,Ability.PRESSURE,Ability.SAND_RUSH), Ability.SAND_RUSH,
                21, 165,
                new Stats(0,1,1,1,0,0), 45,
                0.5,
                239, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.DRAGON),
                List.of("It silently lurks inside narrow desert caves, if it sets its eyes on a prey it will never stop chasing it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.WRAP,3),
                        new MoveLearnSetEntry(Move.LICK,7),
                        new MoveLearnSetEntry(Move.ACID,10),
                        new MoveLearnSetEntry(Move.GLARE,14),
                        new MoveLearnSetEntry(Move.POISON_TAIL,19),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,24),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,28),
                        new MoveLearnSetEntry(Move.POISON_FANG,31),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,35),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,38),
                        new MoveLearnSetEntry(Move.WRING_OUT,45),
                        new MoveLearnSetEntry(Move.COIL,51),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,61)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(42)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Najaconda");

    }


}
