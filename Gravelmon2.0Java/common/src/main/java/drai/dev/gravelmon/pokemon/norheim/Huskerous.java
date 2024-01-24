package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Huskerous extends drai.dev.gravelmon.pokemon.Pokemon {
    public Huskerous() {
        super("Huskerous",
                Type.GRASS,Type.ROCK,
                new Stats(96,
                        98,
                        130,
                        80,
                        80,
                        50),
                List.of(Ability.OVERGROW,Ability.DAMP,Ability.ROCK_HEAD), Ability.ROCK_HEAD,
                8, 165,
                new Stats(0,1,2,0,0,0), 0,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG,EggGroup.WATER_3),
                List.of("Evo Horn LeechSTAB Grass 55 Head SmashSTAB Rock 68 Megahorn Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HORN_LEECH,1),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,55),
                        new MoveLearnSetEntry(Move.MEGAHORN,68)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Huskerous");

    }


}
