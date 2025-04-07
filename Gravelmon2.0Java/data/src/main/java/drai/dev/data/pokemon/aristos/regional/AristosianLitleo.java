package drai.dev.data.pokemon.aristos.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class AristosianLitleo extends drai.dev.data.pokemon.Pokemon {
    public AristosianLitleo(String name, Aspect aspect) {
        super(name, aspect,"AristosianLitleo",
                Type.GROUND, Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.RIVALRY,Ability.SAND_RUSH,Ability.SAND_FORCE), Ability.SAND_FORCE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Living in desert regions made it more adept at digging and walking across sand. It fights by pinning down opponents into sand so it's even harder for them to escape."),
                List.of(),
                List.of(),
                List.of(Label.ARISTOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Litleo");

    }


}
