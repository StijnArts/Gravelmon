package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Barkana extends drai.dev.gravelmon.pokemon.Pokemon {
    public Barkana() {
        super("Barkana",
                Type.GRASS,Type.NORMAL,
                new Stats(85,
                        90,
                        90,
                        60,
                        90,
                        80),
                List.of(Ability.PICKUP), Ability.OBLIVIOUS,
                12, 165,
                new Stats(0,1,1,0,0,0), 45,
                0.5,
                180, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FIELD),
                List.of("Using its mane, it scares bird Pokemon attracted by its sweet scent. They are able to precisely identify any Pokemon around the area by their smell."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,14),
                        new MoveLearnSetEntry(Move.SEED_BOMB,19),
                        new MoveLearnSetEntry(Move.BANANARANG,25),
                        new MoveLearnSetEntry(Move.RETALIATE,30),
                        new MoveLearnSetEntry(Move.SYNTHESIS,37),
                        new MoveLearnSetEntry(Move.POWER_WHIP,49),
                        new MoveLearnSetEntry(Move.LAST_RESORT,56)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 26, 43, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TROPICAL, Biome.IS_TROPICAL_ISLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Barkana");

    }


}
