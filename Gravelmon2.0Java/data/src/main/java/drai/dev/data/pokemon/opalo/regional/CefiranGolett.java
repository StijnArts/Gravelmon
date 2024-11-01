package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranGolett extends Pokemon {
    public CefiranGolett(String name, Aspect aspect) {
        super(name, aspect,"CefiranGolett",
                Type.STEEL, Type.FIRE,
                new Stats(59,74,50,35,35,50),
                List.of(Ability.WATER_ABSORB), Ability.FLASH_FIRE,
                10, 920,
                new Stats(0,1,0,0,0,0), 190,
                -1,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(new EvolutionEntry("cefirangolurk", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND, 1),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, 1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL, 1),
                        new MoveLearnSetEntry(Move.MUDSLAP, 5),
                        new MoveLearnSetEntry(Move.ROLLOUT, 9),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH, 13),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, 17),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH, 21),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH, 25),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH, 30),
                        new MoveLearnSetEntry(Move.LAVA_PLUME, 35),
                        new MoveLearnSetEntry(Move.CURSE, 40),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM, 45),
                        new MoveLearnSetEntry(Move.HAMMER_ARM, 50),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH, 55)
                ),
                List.of(Label.GEN5,Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 43, 5.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Golett");
        this.setPortraitXYZ(0,1.8,0);
    }
}
