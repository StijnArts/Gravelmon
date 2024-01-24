package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Pestilint extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pestilint() {
        super("Pestilint",
                Type.BUG,Type.NORMAL,
                new Stats(80,
                        40,
                        105,
                        80,
                        80,
                        20),
                List.of(Ability.FLUFFY), Ability.SHIELD_DUST,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They often live in largely populated areas, creating nests out of dust and other soft materials. These pokemon are often considered a problem because their nests can cause breathing difficulties and become a major fire hazard"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.INFESTATION,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,5),
                        new MoveLearnSetEntry(Move.POWDER,9),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,14),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,18),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,26),
                        new MoveLearnSetEntry(Move.SILVER_WIND,30),
                        new MoveLearnSetEntry(Move.UPROAR,37),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF,45),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,52),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,60)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pestilint");

    }


}
