package drai.dev.gravelmon.pokemon.nodorro;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Metapod extends drai.dev.gravelmon.pokemon.Pokemon {
    public Metapod() {
        super("Metapod",
                Type.BUG,
                new Stats(45,
                        40,
                        58,
                        55,
                        82,
                        25),
                List.of(Ability.SHED_SKIN), Ability.SHED_SKIN,
                8, 100,
                new Stats(0,0,1,0,1,0), 120,
                0.5,
                72, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Metapods of the nodorro region stay in their cocoon for a very long time unlike most metapods of other regions. they develop and strengthen their psychic abilities before evolving."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CALM_MIND,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.CONFUSION,15),
                        new MoveLearnSetEntry(Move.REFLECT,18),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,18),
                        new MoveLearnSetEntry(Move.PSYBEAM,22),
                        new MoveLearnSetEntry(Move.BARRIER,28),
                        new MoveLearnSetEntry(Move.STORED_POWER,30)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Metapod");

    }


}
