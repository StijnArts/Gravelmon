package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Cloddle extends drai.dev.data.pokemon.Pokemon {
    public Cloddle() {
        super("Cloddle",
                Type.GROUND,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.STURDY,Ability.MOLD_BREAKER), Ability.WATER_COMPACTION,
                7, 165,
                new Stats(0,0,0,0,0,0), 230,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its body is soft yet durable due to a core deep inside of compressed, ever-hardening earth. It has an easygoing temperment and can commonly be seen in quarries and dig sites."),
                List.of(new EvolutionEntry("temperock", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.HARDEN.getName())))	),
                List.of(),
                List.of(Label.VARITAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(5).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        learnSet.add(new MoveLearnSetEntry(Move.HARDEN, 18));
           setLangFileName("Cloddle");
    }


}
