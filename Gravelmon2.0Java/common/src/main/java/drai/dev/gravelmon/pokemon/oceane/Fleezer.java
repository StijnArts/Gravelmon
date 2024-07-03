package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Fleezer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fleezer() {
        super("Fleezer",
                Type.NORMAL,
                new Stats(85,
                        90,
                        55,
                        85,
                        80,
                        70),
                List.of(Ability.FUR_COAT), Ability.FUR_COAT,
                15, 165,
                new Stats(0,2,0,0,0,0), 75,
                0.5,
                163, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Fleezer slam their heads against ice to break it up, their silky coat absorbing the impact. The value of Fleezer fur was once so highly prized that they adapted to life in the icy seas to escape predation."),
                List.of(new EvolutionEntry("afleezer", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"gravelmon:abyssal_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,1),
                        new MoveLearnSetEntry(Move.SLACK_OFF,1),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,1),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.AFTER_YOU,1),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,1),
                        new MoveLearnSetEntry(Move.BODY_SLAM,1),
                        new MoveLearnSetEntry(Move.FROST_BREATH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.SLAM,1),
                        new MoveLearnSetEntry(Move.NUZZLE,1)),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 35, 53, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN))),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
