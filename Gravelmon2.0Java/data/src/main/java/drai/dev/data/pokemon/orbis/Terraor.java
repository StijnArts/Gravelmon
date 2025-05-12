package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Terraor extends drai.dev.data.pokemon.Pokemon {
    public Terraor(Stats stats) {
        super("Terraor",
                Type.FIRE, Type.GHOST,
                stats,
                List.of(Ability.FLASH_FIRE), Ability.FLASH_FIRE,
                6, 2,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                173, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Believed to be formed from the built up fears of people, Terraor appear at the scariest parts of scary stories, feeding on the listeners screams."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CURSE,1),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,1),
                        new MoveLearnSetEntry(Move.OVERHEAT,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(35).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CHERRY_GROVE).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Terraor");

    }


}
