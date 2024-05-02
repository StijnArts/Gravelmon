package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Zaptenna extends drai.dev.gravelmon.pokemon.Pokemon {
    public Zaptenna() {
        super("Zaptenna",
                Type.BUG, Type.ELECTRIC,
                new Stats(60,
                        70,
                        70,
                        105,
                        90,
                        85),
                List.of(Ability.VOLT_ABSORB,Ability.STATIC,Ability.LIGHTNING_ROD), Ability.LIGHTNING_ROD,
                11, 165,
                new Stats(0,0,0,2,1,0), 45,
                0.5,
                214, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Zaptenna communicate with one another via a specific series of flashes on the wings and eyes. It stores electricity in its body via friction created by its fur. Zaptenna have been troublesome as they are known for causing an interference with signals of many electronics."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TICKLE,1),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,4),
                        new MoveLearnSetEntry(Move.TICKLE,7),
                        new MoveLearnSetEntry(Move.PROTECT,10),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,15),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,21),
                        new MoveLearnSetEntry(Move.BUG_BITE,26),
                        new MoveLearnSetEntry(Move.STICKY_WEB,31),
                        new MoveLearnSetEntry(Move.DISCHARGE,36),
                        new MoveLearnSetEntry(Move.CHARGE,42),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,48),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,54),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,59),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,64),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tm"),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 16, 32, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.TREE_TOP),
                0.28, 0.3,
                List.of());
           setLangFileName("Zaptenna");

    }


}
