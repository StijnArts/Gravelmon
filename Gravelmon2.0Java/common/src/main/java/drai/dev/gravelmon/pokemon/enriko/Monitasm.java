package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Monitasm extends drai.dev.gravelmon.pokemon.Pokemon {
    public Monitasm() {
        super("Monitasm",
                Type.GHOST,Type.ELECTRIC,
                new Stats(45,
                        30,
                        80,
                        95,
                        125,
                        85),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Whatever is displayed on its screen is unique for each viewer. They are all similarly horrific, however."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,38),
                        new MoveLearnSetEntry(Move.ELECTROWEB,44),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,47),
                        new MoveLearnSetEntry(Move.STORED_POWER,54)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Monitasm");

    }


}
