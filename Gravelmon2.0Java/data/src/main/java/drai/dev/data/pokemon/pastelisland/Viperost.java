package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Viperost extends drai.dev.data.pokemon.Pokemon {
    public Viperost() {
        super("Viperost",
                Type.WATER, Type.ICE,
                new Stats(85,
                        60,
                        85,
                        60,
                        70,
                        45),
                List.of(Ability.TORRENT), Ability.DRIZZLE,
                12, 168,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Viperost are cold killers, they wait patiently in the waters, then bite into their prey, freezing them instantly."),
                List.of(new EvolutionEntry("kelviper", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .starter()
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_COLD_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERGROUND).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Viperost");

    }


}
