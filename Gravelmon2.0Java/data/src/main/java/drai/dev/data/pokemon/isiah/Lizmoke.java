package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Lizmoke extends drai.dev.data.pokemon.Pokemon {
    public Lizmoke() {
        super("Lizmoke",
                Type.ROCK, Type.FIRE,
                new Stats(50,
                        80,
                        50,
                        79,
                        50,
                        53),
                List.of(Ability.BATTLE_ARMOR), Ability.WHITE_SMOKE,
                8, 165,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                70, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("- Tackle Normal - Bite Dark 8 RolloutSTAB Rock 15 Smokescreen Normal 22 EmberSTAB Fire 26 Rock BlastSTAB Rock 29 Yawn Normal 43 IncinerateSTAB Fire 50 Ancient PowerSTAB Rock 57 Flame ChargeSTAB Fire 64 Explosion Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,8),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,15),
                        new MoveLearnSetEntry(Move.EMBER,22),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,26),
                        new MoveLearnSetEntry(Move.YAWN,29),
                        new MoveLearnSetEntry(Move.INCINERATE,43),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,50),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,57),
                        new MoveLearnSetEntry(Move.EXPLOSION,64)                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lizmoke");

    }


}
