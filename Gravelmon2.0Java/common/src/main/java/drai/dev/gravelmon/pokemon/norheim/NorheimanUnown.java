package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class NorheimanUnown extends drai.dev.gravelmon.pokemon.Pokemon {
    public NorheimanUnown() {
        super("Unown",
                Type.PSYCHIC,Type.ROCK,
                new Stats(48,
                        48,
                        72,
                        72,
                        48,
                        48),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Hidden Power Normal 21 Cosmic Power Psychic 41 Ancient PowerSTAB Rock 61 Stored PowerSTAB Psychic"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,1),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,21),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,41),
                        new MoveLearnSetEntry(Move.STORED_POWER,61)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Unown");

    }


}
