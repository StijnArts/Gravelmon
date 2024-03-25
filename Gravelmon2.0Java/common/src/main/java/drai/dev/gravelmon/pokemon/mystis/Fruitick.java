package drai.dev.gravelmon.pokemon.mystis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Fruitick extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fruitick() {
        super("Fruitick",
                Type.BUG,Type.GRASS,
                new Stats(50,
                        60,
                        40,
                        30,
                        40,
                        80),
                List.of(Ability.HARVEST), Ability.HARVEST,
                0, 3,
                new Stats(1,0,0,0,0,0), 190,
                0.5,
                60, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.BUG,EggGroup.GRASS),
                List.of("They imitate fruit to be protected by nests of Anbrosia. If they are found out, however, they will promptly be devoured."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,2),
                        new MoveLearnSetEntry(Move.ABSORB,3),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.MINIMIZE,5),
                        new MoveLearnSetEntry(Move.JUICESPRAY,6),
                        new MoveLearnSetEntry(Move.SEEDSHOT,8),
                        new MoveLearnSetEntry(Move.PINCH,12),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,14),
                        new MoveLearnSetEntry(Move.BUG_BITE,16),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,18),
                        new MoveLearnSetEntry(Move.BODY_SLAM,20),
                        new MoveLearnSetEntry(Move.SEED_BOMB,24),
                        new MoveLearnSetEntry(Move.FRUITMUNCH,30),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.LUNGE,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.SUGAR_RUSH,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fruitick");

    }


}
