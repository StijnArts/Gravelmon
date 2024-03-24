package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Ribhit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ribhit() {
        super("Ribhit",
                Type.WATER,Type.NORMAL,
                new Stats(96,
                        65,
                        65,
                        65,
                        65,
                        55),
                List.of(Ability.PARENTAL_BOND), Ability.PARENTAL_BOND,
                14, 165,
                new Stats(0,0,0,0,0,0), 100,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.TACKLE,4),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,11),
                        new MoveLearnSetEntry(Move.BUBBLE,16),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,20),
                        new MoveLearnSetEntry(Move.AQUA_RING,27),
                        new MoveLearnSetEntry(Move.AQUA_JET,31),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,36),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,40),
                        new MoveLearnSetEntry(Move.BODY_SLAM,45),
                        new MoveLearnSetEntry(Move.YAWN,47),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,52),
                        new MoveLearnSetEntry(Move.AMNESIA,58),
                        new MoveLearnSetEntry(Move.LAST_RESORT,66)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 27, 39, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER))),
                List.of(SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
