package drai.dev.gravelmon.pokemon.myth;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Phenelpha extends Pokemon {
    public Phenelpha() {
        super("Phenelpha",
                Type.FIRE, Type.FLYING,
                new Stats(100,70,80,120,145,120),
                List.of(Ability.FLAME_BODY), Ability.FLAME_BODY,
                12, 679,
                new Stats(0,0,0,0,1,0), 3,
                -1,
                250, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("A Mythical Pokemon that is said to be the descent of Cresselia, although it seems a bit more evil."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLAME_WHEEL, 1),
                        new MoveLearnSetEntry(Move.PECK, 3),
                        new MoveLearnSetEntry(Move.WILLOWISP, 6),
                        new MoveLearnSetEntry(Move.WING_ATTACK, 10),
                        new MoveLearnSetEntry(Move.PROTECT, 14),
                        new MoveLearnSetEntry(Move.ROOST, 18),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 23),
                        new MoveLearnSetEntry(Move.TAIL_GLOW, 28),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, 32),
                        new MoveLearnSetEntry(Move.CALM_MIND, 35),
                        new MoveLearnSetEntry(Move.AIR_SLASH, 39),
                        new MoveLearnSetEntry(Move.HURRICANE, 44),
                        new MoveLearnSetEntry(Move.INFERNOSTORM, 50),
                        new MoveLearnSetEntry(Move.FLASH_CANNON, 55),
                        new MoveLearnSetEntry(Move.ENCORE, 60),
                        new MoveLearnSetEntry(Move.TOXIC, 65),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, 70),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, 75),
                        new MoveLearnSetEntry(Move.BLAST_BURN, 80)
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 70, 0.000001, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "day"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
        setCanFly(true);
    }
}
