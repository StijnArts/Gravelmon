package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bulledusa extends drai.dev.data.pokemon.Pokemon {
    public Bulledusa() {
        super("Bulledusa",
                Type.WATER,
                new Stats(150,
                        40,
                        48,
                        90,
                        90,
                        40),
                List.of(Ability.WATER_ABSORB,Ability.STICKY_HOLD), Ability.GOOEY,
                11, 1001,
                new Stats(2,0,0,0,0,0), 90,
                0.5,
                161, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.WATER_1),
                List.of("Using the air pocket inside its bulb, Bulledusa floats along the surface of water. It can add and remove air from this pocket, controlling its buoyancy."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.ACID,5),
                        new MoveLearnSetEntry(Move.WITHDRAW,7),
                        new MoveLearnSetEntry(Move.WATER_PULSE,13),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,18),
                        new MoveLearnSetEntry(Move.AQUA_RING,24),
                        new MoveLearnSetEntry(Move.SCALD,29),
                        new MoveLearnSetEntry(Move.BRINE,33),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,37),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,41),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,46),
                        new MoveLearnSetEntry(Move.SOAK,50),
                        new MoveLearnSetEntry(Move.VORTEXDRAIN,55)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Bulledusa");

    }


}
