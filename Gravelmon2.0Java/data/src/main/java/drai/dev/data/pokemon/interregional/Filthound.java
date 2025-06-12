package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Filthound extends drai.dev.data.pokemon.Pokemon {
    public Filthound() {
        super("Filthound",
                Type.NORMAL, Type.GROUND,
                new Stats(130,
                        95,
                        100,
                        40,
                        85,
                        50),
                List.of(Ability.FLUFFY), Ability.STENCH,
                12, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Filthound's fur is easily covered in mud and saliva if not groomed daily. They are often abandoned due to their natural odor and dirtiness."),
                List.of(),
                List.of(     new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,3),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,6),
                        new MoveLearnSetEntry(Move.COVET,9),
                        new MoveLearnSetEntry(Move.HEADBUTT,12),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,15),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,18),
                        new MoveLearnSetEntry(Move.REST,21),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,24),
                        new MoveLearnSetEntry(Move.FLING,27),
                        new MoveLearnSetEntry(Move.FLAIL,30),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,33),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,36)),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Filthound");

    }


}
