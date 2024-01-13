package drai.dev.gravelmon.pokemon.azure.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class MysticMightyena extends Pokemon {
    public MysticMightyena(int dexNo) {
        super(dexNo,"MysticMightyena",
                Type.FIRE, Type.GHOST,
                new Stats(70, 60, 70, 90, 60, 70),
                List.of(Ability.INTIMIDATE, Ability.SHADOW_TAG), Ability.ADAPTABILITY,
                10, 370,
                new Stats(0,0,0,2,0,0), 127,
                0.5,
                127, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.SMOG,1),
                        new MoveLearnSetEntry(Move.EMBER,4),
                        new MoveLearnSetEntry(Move.MINIMIZE,8),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,12),
                        new MoveLearnSetEntry(Move.HEX,16),
                        new MoveLearnSetEntry(Move.WILLOWISP,20),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,24),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,28),
                        new MoveLearnSetEntry(Move.CURSE,32),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,36),
                        new MoveLearnSetEntry(Move.INFERNO,40),
                        new MoveLearnSetEntry(Move.IMPRISON,44),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,48),
                        new MoveLearnSetEntry(Move.OVERHEAT,52),
                        new MoveLearnSetEntry(Move.MEMENTO,56)
                ),
                List.of(Label.GEN3,Label.AZURE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 18, 50, 5.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Mightyena");
    }
}
