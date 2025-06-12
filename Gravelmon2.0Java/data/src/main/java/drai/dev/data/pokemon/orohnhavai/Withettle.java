package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Withettle extends drai.dev.data.pokemon.Pokemon {
    public Withettle() {
        super("Withettle",
                Type.GRASS,
                new Stats(83,
                        95,
                        72,
                        85,
                        60,
                        40),
                List.of(Ability.EFFECT_SPORE), Ability.WATER_ABSORB,
                10, 165,
                new Stats(2,0,0,0,0,0), 120,
                0.5,
                120, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("They defend themselves with their spiky leaves and heads. Be careful not to come in contact with the fluff around their neck as it may release spores into the air, causing allergic reactions. Their leaves, however, do more good than harm. They are used in herbal medicines as they provide many nutrients which were proven to have many health benefits. The leaves are crushed into powders and even used for tea."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TRI_ATTACK,1),
                        new MoveLearnSetEntry(Move.GROWTH,5),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,8),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,12),
                        new MoveLearnSetEntry(Move.ENDEAVOR,16),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,18),
                        new MoveLearnSetEntry(Move.LEECH_SEED,25),
                        new MoveLearnSetEntry(Move.INGRAIN,28),
                        new MoveLearnSetEntry(Move.STUN_SPORE,32),
                        new MoveLearnSetEntry(Move.SEED_BOMB,36),
                        new MoveLearnSetEntry(Move.SPIKES,40),
                        new MoveLearnSetEntry(Move.WORRY_SEED,45),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,48),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,51),
                        new MoveLearnSetEntry(Move.COUNTER,"tm"),
                        new MoveLearnSetEntry(Move.POISON_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 19, 35, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Withettle");

    }


}
