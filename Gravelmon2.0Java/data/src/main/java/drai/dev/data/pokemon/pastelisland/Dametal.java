package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dametal extends drai.dev.data.pokemon.Pokemon {
    public Dametal() {
        super("Dametal",
                Type.STEEL,
                new Stats(55,
                        50,
                        60,
                        45,
                        35,
                        45),
                List.of(Ability.GUTS,Ability.PRESSURE), Ability.HUGE_POWER,
                11, 170,
                new Stats(0,0,0,0,0,0), 170,
                0.6,
                58, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MINERAL),
                List.of(""),
                List.of(new EvolutionEntry("damaleo", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(13).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MOUNTAIN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Dametal");

    }


}
