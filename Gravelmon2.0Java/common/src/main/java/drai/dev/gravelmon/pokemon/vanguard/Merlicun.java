package drai.dev.gravelmon.pokemon.vanguard;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Merlicun extends Pokemon {
    public Merlicun() {
        super("Merlicun",
                Type.BUG,
                new Stats(45,35,25,50,45,50),
                List.of(Ability.SWARM), Ability.FLAME_BODY,
                4, 140,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It isn't considered very useful in any way what so ever. It seems to just want to crawl around and eat leaves."),
                List.of(new EvolutionEntry("firomenis", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.SPLASH, 1),
                        new MoveLearnSetEntry(Move.HARDEN, 5),
                        new MoveLearnSetEntry(Move.STRING_SHOT, 10),
                        new MoveLearnSetEntry(Move.STUN_SPORE, 15),

                        new MoveLearnSetEntry(Move.BUG_BITE, "tutor")
                ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 2, 23, 3.18, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.28, 0.3,
                List.of());
    }
}
