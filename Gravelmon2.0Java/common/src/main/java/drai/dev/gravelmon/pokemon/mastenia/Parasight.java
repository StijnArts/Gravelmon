package drai.dev.gravelmon.pokemon.mastenia;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Parasight extends drai.dev.gravelmon.pokemon.Pokemon {
    public Parasight() {
        super("Parasight",
                Type.PSYCHIC,Type.BUG,
                new Stats(80,
                        105,
                        80,
                        75,
                        90,
                        30),
                List.of(Ability.ANALYTIC,Ability.DRY_SKIN), Ability.TRACE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Parasight has been taken entirely over by another parasite with psychic properties. Its parasitic relationship shares similarities to another Pokémon. Meanwhile, it also has other traits from a 2nd Pokémon but the link between them has been long lost. Although terrifying, it still remains somewhat obedient."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,1),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,1)                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Parasight");

    }


}
