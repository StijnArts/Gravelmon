package drai.dev.data.pokemon.hub.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HubianSmeargle extends drai.dev.data.pokemon.Pokemon {
    public HubianSmeargle(String name, Aspect aspect) {
        super(name, aspect, "Smeargle",
                Type.GROUND, Type.FAIRY,
                new Stats(55,
                        20,
                        35,
                        20,
                        45,
                        75),
                List.of(Ability.OWN_TEMPO), Ability.TECHNICIAN,
                12, 165,
                new Stats(0,0,0,0,1,0), 45,
                0.5,
                88, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Smeargle on Easter Island is just as artistic as its Johto counterpart, filling the walls of its cave home with hundreds of colorful chalk drawings. It is unable to learn any move, instead it is born capable of an endless possibility of potential."),
                List.of(),
                List.of(              new MoveLearnSetEntry(Move.SKETCH,1),
                        new MoveLearnSetEntry(Move.SKETCH,11),
                        new MoveLearnSetEntry(Move.SKETCH,21),
                        new MoveLearnSetEntry(Move.SKETCH,31),
                        new MoveLearnSetEntry(Move.SKETCH,41),
                        new MoveLearnSetEntry(Move.SKETCH,51),
                        new MoveLearnSetEntry(Move.SKETCH,61),
                        new MoveLearnSetEntry(Move.SKETCH,71),
                        new MoveLearnSetEntry(Move.SKETCH,81),
                        new MoveLearnSetEntry(Move.SKETCH,91)
                        ),
                List.of(Label.HUB),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(11)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Smeargle");

    }


}
