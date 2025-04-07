package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Traffimite extends drai.dev.data.pokemon.Pokemon {
    public Traffimite() {
        super("Traffimite",
                Type.ELECTRIC, Type.PSYCHIC,
                new Stats(25,
                        35,
                        70,
                        95,
                        55,
                        45),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 60,
                new Stats(0,0,0,1,0,0), 190,
                0.0,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("- Signal Beam Bug - PsybeamSTAB Psychic - Thunder ShockSTAB Electric"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PSYBEAM,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Traffimite");

    }


}
