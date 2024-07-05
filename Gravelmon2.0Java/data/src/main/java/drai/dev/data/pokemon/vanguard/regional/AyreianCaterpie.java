package drai.dev.data.pokemon.vanguard.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class AyreianCaterpie extends Pokemon {
    public AyreianCaterpie(String name, Aspect aspect) {
        super(name, aspect,"AyreianCaterpie",
                Type.BUG, Type.ELECTRIC,
                new Stats(50,30,35,45,35,20),
                List.of(Ability.SHIELD_DUST), Ability.RUN_AWAY,
                3, 29,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                39, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("For protection, it releases a horrible stench from the antenna on its head to drive away enemies."),
                List.of(new EvolutionEntry("ayreianmetapod", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"10")))),
                List.of(
                        new MoveLearnSetEntry(Move.PURSUIT, 1),
                        new MoveLearnSetEntry(Move.STRING_SHOT, 1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, 3),
                        new MoveLearnSetEntry(Move.ELECTROWEB, 7),

                        new MoveLearnSetEntry(Move.BUG_BITE, "tutor"),
                        new MoveLearnSetEntry(Move.ELECTROWEB, "tutor")
                ),
                List.of(Label.GEN1,Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 2, 19, 10.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Caterpie");
    }
}
