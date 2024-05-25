package drai.dev.gravelmon.pokemon.nodorro.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Caterpie extends drai.dev.gravelmon.pokemon.Pokemon {
    public Caterpie(int dex) {
        super(dex, "Caterpie",
                Type.BUG,
                new Stats(45,
                        35,
                        34,
                        32,
                        29,
                        45),
                List.of(Ability.SHIELD_DUST), Ability.RUN_AWAY,
                4, 30,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                39, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Its body is soft and weak. In nature, its perpetual fate is to be seen by others as food. - Placeholder"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,6),
                        new MoveLearnSetEntry(Move.BUG_BITE,15)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Caterpie");

    }


}
