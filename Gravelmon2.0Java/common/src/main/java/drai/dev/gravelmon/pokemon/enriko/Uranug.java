package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Uranug extends drai.dev.gravelmon.pokemon.Pokemon {
    public Uranug() {
        super("Uranug",
                Type.ROCK,
                new Stats(35,
                        50,
                        70,
                        60,
                        70,
                        20),
                List.of(Ability.ROCK_HEAD,Ability.CORROSION,Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("The material Uranug is made of has a very short half-life. Prolonged contact with its skin can cause severe radiation burns."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SINGE,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,3),
                        new MoveLearnSetEntry(Move.SHARPEN,7),
                        new MoveLearnSetEntry(Move.ROCK_THROW,12),
                        new MoveLearnSetEntry(Move.ACID,17),
                        new MoveLearnSetEntry(Move.SWIFT,22),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,26),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,32),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,37),
                        new MoveLearnSetEntry(Move.TOXIC,44),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,46),
                        new MoveLearnSetEntry(Move.POWER_GEM,52),
                        new MoveLearnSetEntry(Move.EXPLOSION,60)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Uranug");

    }


}
