package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Smeartiste extends drai.dev.data.pokemon.Pokemon {
    public Smeartiste(Stats stats) {
        super("Smeartiste",
                Type.NORMAL,
                stats,
                List.of(Ability.OWNTEMPO, Ability.TECHNICIAN), Ability.MOODY,
                17, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SKETCH, 1),
                        new MoveLearnSetEntry(Move.SKETCH, 1),
                        new MoveLearnSetEntry(Move.SKETCH, 1),
                        new MoveLearnSetEntry(Move.SKETCH, 1)
                ),
                List.of(Label.VARITAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(38).setPool(SpawnPool.RARE).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Smeartiste");
        addAdditionalEvolution("smeargle", new EvolutionEntry("smeartiste", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38"))));

    }


}
