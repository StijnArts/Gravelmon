package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class CefiranGolurk extends Pokemon {
    public CefiranGolurk(String name, Aspect aspect) {
        super(name, aspect,"CefiranGolurk",
                Type.STEEL, Type.FIRE,
                new Stats(89,124,80,55,55,80),
                List.of(Ability.WATER_ABSORB), Ability.FLASH_FIRE,
                28, 3300,
                new Stats(0,2,0,0,0,0), 90,
                -1,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND, 1),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, 1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL, 1),
                        new MoveLearnSetEntry(Move.MUDSLAP, 1),
                        new MoveLearnSetEntry(Move.MUDSLAP, 5),
                        new MoveLearnSetEntry(Move.ROLLOUT, 9),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH, 13),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, 17),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH, 21),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH, 25),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH, 30),
                        new MoveLearnSetEntry(Move.LAVA_PLUME, 35),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM, 43),
                        new MoveLearnSetEntry(Move.METEOR_MASH, 50),
                        new MoveLearnSetEntry(Move.HAMMER_ARM, 60),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH, 70)
                ),
                List.of(Label.GEN5,Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 44, 70, 5.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Golurk");
        this.setPortraitXYZ(0,1.8,0);
    }
}
