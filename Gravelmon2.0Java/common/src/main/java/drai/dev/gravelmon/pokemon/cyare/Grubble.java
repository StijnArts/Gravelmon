package drai.dev.gravelmon.pokemon.cyare;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Grubble extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grubble() {
        super("Grubble",
                Type.BUG,
                new Stats(35,
                        35,
                        25,
                        30,
                        30,
                        40),
                List.of(Ability.SHIELD_DUST), Ability.SHIELD_DUST,
                3, 27,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                39, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("GRAHHDFDFDFGRDcleffaFAHHH"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,15),
                        new MoveLearnSetEntry(Move.FLAIL,20),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,25)                        ),
                List.of(Label.CYARE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grubble");

    }


}
