package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Oreglyph extends drai.dev.gravelmon.pokemon.Pokemon {
    public Oreglyph() {
        super("Oreglyph",
                Type.ROCK,Type.PSYCHIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.VITAL_SPIRIT,Ability.SPIRITBOUND,Ability.PSYCHIC_SURGE), Ability.PSYCHIC_SURGE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They were discovered on an ancient burial site. It is believed to serve as tombstones, with each of them guarding a single grave for the rest of their life. There is a mysterious power hidden in the core of their bodies."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Oreglyph");

    }


}
