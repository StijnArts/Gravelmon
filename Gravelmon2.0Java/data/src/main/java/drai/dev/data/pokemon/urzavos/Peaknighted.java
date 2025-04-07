package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Peaknighted extends drai.dev.data.pokemon.Pokemon {
    public Peaknighted(Stats stats) {
        super("Peaknighted",
                Type.PSYCHIC, Type.FLYING,
                stats,
                List.of(Ability.UNNERVE,Ability.RIVALRY), Ability.BIG_PECKS,
                18, 953,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Peaknighted do not give up, even when defeated in battle. They are quick to use their psychic abilities to confuse foes, then finish them off with powerful pecks."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Peaknighted");

    }


}
