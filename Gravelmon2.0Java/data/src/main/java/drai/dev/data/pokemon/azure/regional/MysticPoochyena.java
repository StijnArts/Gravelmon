package drai.dev.data.pokemon.azure.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class MysticPoochyena extends Pokemon {
    public MysticPoochyena(String name, Aspect aspect) {
        super(name, aspect,"MysticPoochyena",
                Type.FIRE, Type.GHOST,
                new Stats(35, 30, 35, 30, 35, 55),
                List.of(Ability.INTIMIDATE, Ability.SHADOW_TAG), Ability.ADAPTABILITY,
                5, 136,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                56, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("mysticmightyena", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 2, 30, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Poochyena");
    }
}
