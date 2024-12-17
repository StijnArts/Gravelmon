package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Snuggrub extends drai.dev.data.pokemon.Pokemon {
    public Snuggrub() {
        super("Snuggrub",
                Type.BUG,
                new Stats(40,
                        40,
                        30,
                        30,
                        30,
                        25),
                List.of(Ability.SWARM), Ability.FLAME_BODY,
                0, 0,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                39, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Snuggrub live at the base of mountains and volcanoes. They headbutt assaulting opponents with their pointy horn."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.POWDER,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,5),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,8),
                        new MoveLearnSetEntry(Move.EMBER,11),
                        new MoveLearnSetEntry(Move.SCREECH,14),
                        new MoveLearnSetEntry(Move.HORN_LEECH,17),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,22),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,25),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,44),
                        new MoveLearnSetEntry(Move.LUNGE,50)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snuggrub");

    }


}
