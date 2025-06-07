package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Chainector extends drai.dev.data.pokemon.Pokemon {
    public Chainector() {
        super("Chainector",
                Type.ELECTRIC,
                new Stats(75,
                        50,
                        75,
                        135,
                        85,
                        75),
                List.of(Ability.PLUS,Ability.MINUS,Ability.BATTERY), Ability.BATTERY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its long arms serve a multitude of purposes from creating electrical connections to reaching an object that's far off. Their uses are so versatile that space stations are becoming more and more reliant on them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MAGNETIC_FLUX,1)                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Chainector");

    }


}
