package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Magief extends Pokemon {
    public Magief() {
        super("Magief",
                Type.DARK, Type.FLYING,
                new Stats(36,
                        38,
                        35,
                        55,
                        37,
                        44),
                List.of(Ability.PICKUP), Ability.PICKPOCKET,
                4, 12,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                49, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.FLYING),
                List.of("They are perceptive Pokemon able to see shiny objects from several miles away. They are known to horde treasures for the leaders of their flock."),
                List.of(new EvolutionEntry("corsuave", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.SWITCHEROO,1),
                        new MoveLearnSetEntry(Move.THIEF,6),
                        new MoveLearnSetEntry(Move.PLUCK,9),
                        new MoveLearnSetEntry(Move.MIMIC,12),
                        new MoveLearnSetEntry(Move.BEAT_UP,15),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,20),
                        new MoveLearnSetEntry(Move.AIR_SLASH,23),
                        new MoveLearnSetEntry(Move.PSYCH_UP,26),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,29),
                        new MoveLearnSetEntry(Move.HURRICANE,34),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,37),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,"egg"),
                        new MoveLearnSetEntry(Move.DRILL_PECK,"egg"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"egg")
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST, Biome.IS_PLAINS))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
    }
}
