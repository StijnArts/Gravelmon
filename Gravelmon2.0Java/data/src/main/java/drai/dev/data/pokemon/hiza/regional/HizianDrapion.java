package drai.dev.data.pokemon.hiza.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HizianDrapion extends drai.dev.data.pokemon.Pokemon {
    public HizianDrapion(String name, Aspect aspect) {
        super(name, aspect, "Drapion",
                Type.GROUND, Type.DARK,
                new Stats(70,
                        105,
                        105,
                        60,
                        80,
                        80),
                List.of(Ability.IMMUNITY), Ability.TECHNICIAN,
                8, 165,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.WATER_3),
                List.of("What it lacks in venom it makes up in strength. Drapion is capable of tossing a rock twice its own size, using nothing but its tail."),
                List.of(),
                List.of(              new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.HARDEN,5),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,10),
                        new MoveLearnSetEntry(Move.MUDSLAP,15),
                        new MoveLearnSetEntry(Move.ABSORB,21),
                        new MoveLearnSetEntry(Move.METAL_CLAW,25),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,30),
                        new MoveLearnSetEntry(Move.MIND_READER,35),
                        new MoveLearnSetEntry(Move.DIG,40)
                ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 12, 39, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Drapion");

    }


}
