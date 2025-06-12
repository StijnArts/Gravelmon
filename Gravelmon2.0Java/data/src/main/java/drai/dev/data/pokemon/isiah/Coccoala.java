package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Coccoala extends drai.dev.data.pokemon.Pokemon {
    public Coccoala() {
        super("Coccoala",
                Type.NORMAL,
                new Stats(70,
                        50,
                        60,
                        50,
                        60,
                        40),
                List.of(Ability.CUTE_CHARM), Ability.CUTE_CHARM,
                8, 165,
                new Stats(2,0,0,0,0,0), 165,
                0.5,
                116, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("When a Coccoala becomes deeply fond of his trainer, it hugs them so tightly that they become out of breath."),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.YAWN,1),
                        new MoveLearnSetEntry(Move.ENCORE,6),
                        new MoveLearnSetEntry(Move.SLACK_OFF,9),
                        new MoveLearnSetEntry(Move.HEADBUTT,14),
                        new MoveLearnSetEntry(Move.AMNESIA,17),
                        new MoveLearnSetEntry(Move.COVET,22),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,25),
                        new MoveLearnSetEntry(Move.COUNTER,30),
                        new MoveLearnSetEntry(Move.FLAIL,33),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,38)),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.TREE_TOP)
    .build(), List.of());
	
           setLangFileName("Coccoala");

    }


}
