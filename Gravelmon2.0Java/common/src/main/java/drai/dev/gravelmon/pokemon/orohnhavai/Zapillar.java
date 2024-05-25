package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Zapillar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Zapillar() {
        super("Zapillar",
                Type.BUG, Type.ELECTRIC,
                new Stats(40,
                        25,
                        30,
                        40,
                        45,
                        20),
                List.of(Ability.VOLT_ABSORB,Ability.STATIC,Ability.LIGHTNING_ROD), Ability.LIGHTNING_ROD,
                3, 165,
                new Stats(0,0,0,0,1,0), 255,
                0.5,
                52, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Zapillar share energy with each other through the touch of their antennae. Groups of Zapillar will crawl over an enemy, electrocuting it until it is paralyzed."),
                List.of(new EvolutionEntry("zapcoon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"10")))),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,4),
                        new MoveLearnSetEntry(Move.TICKLE,7),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,10),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,14),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,18),
                        new MoveLearnSetEntry(Move.BUG_BITE,22),
                        new MoveLearnSetEntry(Move.STICKY_WEB,25),
                        new MoveLearnSetEntry(Move.DISCHARGE,28),
                        new MoveLearnSetEntry(Move.CHARGE,31),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,35),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,39),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tm"),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.TREE_TOP),
                0.28, 0.3,
                List.of());
           setLangFileName("Zapillar");

    }


}
