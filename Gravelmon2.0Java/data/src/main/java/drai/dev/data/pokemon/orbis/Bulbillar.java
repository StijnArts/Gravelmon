package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bulbillar extends drai.dev.data.pokemon.Pokemon {
    public Bulbillar() {
        super("Bulbillar",
                Type.BUG, Type.ELECTRIC,
                new Stats(45,
                        20,
                        20,
                        40,
                        35,
                        35),
                List.of(Ability.ILLUMINATE), Ability.SWARM,
                3, 28,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                39, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("- Thunder ShockSTAB Electric 3 Flash Normal 5 String Shot Bug 8 Struggle BugSTAB Bug 11 ElectrowebSTAB Electric"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.FLASH,3),
                        new MoveLearnSetEntry(Move.STRING_SHOT,5),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,8),
                        new MoveLearnSetEntry(Move.ELECTROWEB,11)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Bulbillar");

    }


}
