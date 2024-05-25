package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Wyfern extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wyfern() {
        super("Wyfern",
                Type.GRASS, Type.DRAGON,
                new Stats(90,
                        60,
                        120,
                        120,
                        110,
                        80),
                List.of(Ability.GALE_WINGS), Ability.SERENE_GRACE,
                13, 165,
                new Stats(0,0,0,0,0,0), 35,
                0.5,
                264, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.DRAGON),
                List.of("Its massive wooden body manages to be extremely rigid, yet flexible at the same time, allowing it to fly and weave through the forests it guards with ease."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.GUST,5),
                        new MoveLearnSetEntry(Move.TWISTER,12),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,17),
                        new MoveLearnSetEntry(Move.PROTECT,20),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,24),
                        new MoveLearnSetEntry(Move.SYNTHESIS,28),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,34),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,38),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,42),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,46),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,56),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,65)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 55, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wyfern");

    }


}
