package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Norewin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Norewin() {
        super("Norewin",
                Type.ICE, Type.FLYING,
                new Stats(65,
                        70,
                        105,
                        85,
                        105,
                        75),
                List.of(Ability.EARLY_BIRD), Ability.REGENERATOR,
                15, 165,
                new Stats(0,0,2,0,1,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.DRAGON),
                List.of("Norewin are hardy Ice-types because of its high defenses. Norewin are also only seen in the harsh winters or in cold areas in the mountains. They have dragon-like features, but retain the some bird-like features from Childer. To protect themselves, they can freeze themselves in an impenetrable amount of ice."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,5),
                        new MoveLearnSetEntry(Move.GUST,10),
                        new MoveLearnSetEntry(Move.ICY_WIND,13),
                        new MoveLearnSetEntry(Move.SING,17),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,22),
                        new MoveLearnSetEntry(Move.FROST_BREATH,26),
                        new MoveLearnSetEntry(Move.AIR_SLASH,30),
                        new MoveLearnSetEntry(Move.ROOST,35),
                        new MoveLearnSetEntry(Move.AVALANCHE,41),
                        new MoveLearnSetEntry(Move.SCREECH,44),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,50),
                        new MoveLearnSetEntry(Move.COLDSNAP,52),
                        new MoveLearnSetEntry(Move.SHEER_COLD,57)                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 36, 56, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
