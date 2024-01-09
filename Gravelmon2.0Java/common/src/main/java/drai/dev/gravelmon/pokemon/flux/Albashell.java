package drai.dev.gravelmon.pokemon.flux;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Albashell extends Pokemon {
    public Albashell() {
        super("Albashell",
                Type.FLYING,
                new Stats(110,
                        80,
                        105,
                        80,
                        100,
                        60),
                List.of(Ability.CLOUD_NINE, Ability.SHELL_ARMOR), Ability.SERENE_GRACE,
                27, 2065,
                new Stats(1,0,1,0,0,0), 45,
                0.5,
                187, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.MONSTER, EggGroup.FLYING),
                List.of("It has a calm demeanor and enjoys ferrying passengers on its back. They are commonly employed as an airborne taxi service throughout Altera."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLY,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.PLUCK,1),
                        new MoveLearnSetEntry(Move.CHARM,14),
                        new MoveLearnSetEntry(Move.WHIRLWIND,17),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,21),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,25),
                        new MoveLearnSetEntry(Move.AIR_SLASH,28),
                        new MoveLearnSetEntry(Move.TAILWIND,32),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,36),
                        new MoveLearnSetEntry(Move.BODY_SLAM,39),
                        new MoveLearnSetEntry(Move.DEFOG,45),
                        new MoveLearnSetEntry(Move.HURRICANE,51),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,56),
                        new MoveLearnSetEntry(Move.SKULL_BASH,62),
                        new MoveLearnSetEntry(Move.CURSE,"egg")
                ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 42, 58, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
    }
}
