package drai.dev.gravelmon.pokemon.norheim.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class NorheimanUnown extends drai.dev.gravelmon.pokemon.Pokemon {
    public NorheimanUnown(int dex) {
        super(dex , "Unown",
                Type.PSYCHIC, Type.ROCK,
                new Stats(48,
                        48,
                        72,
                        72,
                        48,
                        48),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                5, 165,
                new Stats(0,0,0,0,0,0), 225,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,1),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,21),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,41),
                        new MoveLearnSetEntry(Move.STORED_POWER,61)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY))
                ), List.of(),
                List.of(SpawnPreset.RUINED_PORTAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Unown");
    }


}
