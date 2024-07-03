package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Baobash extends drai.dev.gravelmon.pokemon.Pokemon {
    public Baobash() {
        super("Baobash",
                Type.GRASS, Type.FIGHTING,
                new Stats(95,
                        100,
                        85,
                        84,
                        75,
                        51),
                List.of(Ability.IRON_FIST), Ability.NO_GUARD,
                19, 165,
                new Stats(0,2,0,0,0,0), 75,
                0.5,
                161, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Its huge fists are almost indestructible, it is capable of punching through a steel beam without feeling a thing."),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,8),
                        new MoveLearnSetEntry(Move.BITE,11),
                        new MoveLearnSetEntry(Move.LEECH_SEED,15),
                        new MoveLearnSetEntry(Move.SEED_BOMB,20),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,24),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,29),
                        new MoveLearnSetEntry(Move.MUD_SHOT,34),
                        new MoveLearnSetEntry(Move.BULK_UP,38),
                        new MoveLearnSetEntry(Move.BODY_SLAM,43),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,47),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,53)                  ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 28, 54, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Baobash");

    }


}
