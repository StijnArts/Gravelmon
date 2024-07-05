package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pengerupt extends drai.dev.data.pokemon.Pokemon {
    public Pengerupt() {
        super("Pengerupt",
                Type.ROCK, Type.FIRE,
                new Stats(90,
                        80,
                        91,
                        128,
                        91,
                        15),
                List.of(Ability.SOLID_ROCK,Ability.MAGMATICHEAT), Ability.CHLOROPHYLL,
                11, 307,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                171, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FLYING),
                List.of("Pengerupt wander deep into volcanos so they may fill their bodies with hot lava. They will then travel to the top of the volcano and shoot it into the air. No one knows why they do this."),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,8),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,15),
                        new MoveLearnSetEntry(Move.EMBER,22),
                        new MoveLearnSetEntry(Move.YAWN,29),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,36),
                        new MoveLearnSetEntry(Move.INCINERATE,43),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,50),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,57),
                        new MoveLearnSetEntry(Move.EXPLOSION,64)              ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 35, 52, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_VOLCANIC))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pengerupt");

    }


}
