package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Prospectre extends Pokemon {
    public Prospectre() {
        super("Prospectre",
                Type.GHOST, Type.ROCK,
                new Stats(70,
                        110,
                        50,
                        90,
                        50,
                        65),
                List.of(Ability.SONGBIRD), Ability.SONGBIRD,
                5, 124,
                new Stats(0,1,0,0,0,0), 125,
                0.5,
                118, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,4),
                        new MoveLearnSetEntry(Move.POUND,8),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,12),
                        new MoveLearnSetEntry(Move.CURSE,16),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,20),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,24),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,28),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,32),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,36),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,40),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,44),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,48),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,52)
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 18, 41, 4.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.MINESHAFT),
                0.28, 0.3,
                List.of());
    }
}
