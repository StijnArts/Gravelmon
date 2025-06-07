package drai.dev.data.pokemon.aristos.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class AristosianNumel extends drai.dev.data.pokemon.Pokemon {
    public AristosianNumel(String name, Aspect aspect) {
        super(name, aspect,"AristosianNumel",
                Type.GRASS, Type.GROUND,
                new Stats(60,
                        60,
                        40,
                        65,
                        45,
                        35),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The moisture and nutrients from the cacti they eat coupled with their slow movement caused their bodies to take on a mossy texture and cacti to grow out of the holes in their backs. Rather than magma, their bodies are filled with cool water which sustains the cactus."),
                List.of(),
                List.of(),
                List.of(Label.ARISTOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Numel");

    }


}
