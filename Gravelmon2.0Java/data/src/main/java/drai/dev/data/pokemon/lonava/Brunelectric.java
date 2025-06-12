package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Brunelectric extends drai.dev.data.pokemon.Pokemon {
    public Brunelectric() {
        super("Brunelectric",
                Type.ELECTRIC, Type.STEEL,
                new Stats(33,
                        33,
                        33,
                        95,
                        95,
                        45),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Created by an esteemed civil engineer, Brunelectric are remnants of a previous era. The mere fact that they are still going centuries later is a testament to the genius of their maker."),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.NUZZLE,5),
                        new MoveLearnSetEntry(Move.HAZARDCLOUD,8),
                        new MoveLearnSetEntry(Move.METRONOME,12),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,17),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,19),
                        new MoveLearnSetEntry(Move.SECRET_POWER,24),
                        new MoveLearnSetEntry(Move.MINIMIZE,27),
                        new MoveLearnSetEntry(Move.DISCHARGE,31),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,36),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,47),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,52),
                        new MoveLearnSetEntry(Move.ELECTRIFY,56)              ),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.TRAIL_RUINS)
    .build(), List.of());
	
           setLangFileName("Brunelectric");

    }


}
