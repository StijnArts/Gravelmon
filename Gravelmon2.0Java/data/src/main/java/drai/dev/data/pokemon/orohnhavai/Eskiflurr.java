package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Eskiflurr extends drai.dev.data.pokemon.Pokemon {
    public Eskiflurr() {
        super("Eskiflurr",
                Type.ICE, Type.FAIRY,
                new Stats(96,
                        32,
                        77,
                        82,
                        87,
                        68),
                List.of(Ability.CUTE_CHARM,Ability.TECHNICIAN,Ability.RATTLED), Ability.RATTLED,
                8, 165,
                new Stats(2,0,0,2,2,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Eskiflurr have very soft and silky fur that lock in heat to help it withstand extremely cold temperatures while the ice crystals lining its body help it to endure extreme heat. This species is in danger of extinction because its highly valuable fur and ice crystals being used for clothing and jewelry, making them hard to find in the wild or with Trainers."),
                List.of(),
                List.of(),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Eskiflurr");

    }


}
