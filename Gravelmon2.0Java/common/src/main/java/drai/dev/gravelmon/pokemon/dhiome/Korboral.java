package drai.dev.gravelmon.pokemon.dhiome;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Korboral extends drai.dev.gravelmon.pokemon.Pokemon {
    public Korboral() {
        super("Korboral",
                Type.NORMAL,Type.GRASS,
                new Stats(110,
                        80,
                        75,
                        50,
                        70,
                        50),
                List.of(Ability.SAP_SIPPER), Ability.HARVEST,
                0, 0,
                new Stats(2,0,0,0,0,0), 128,
                0.5,
                151, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It is known for its ability to grow a superb crop of berries using the rich nutrients found in its pouch. It will feed these especially healthy berries to growing Wombabe."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,7),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.HYPER_FANG,17),
                        new MoveLearnSetEntry(Move.LEECH_SEED,21),
                        new MoveLearnSetEntry(Move.SPIT_UP,25),
                        new MoveLearnSetEntry(Move.SWALLOW,25),
                        new MoveLearnSetEntry(Move.STOCKPILE,25),
                        new MoveLearnSetEntry(Move.BULLET_SEED,28),
                        new MoveLearnSetEntry(Move.SUPER_FANG,33),
                        new MoveLearnSetEntry(Move.REST,37),
                        new MoveLearnSetEntry(Move.BODY_SLAM,41),
                        new MoveLearnSetEntry(Move.SEED_BOMB,46),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,52)                        ),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Korboral");

    }


}
