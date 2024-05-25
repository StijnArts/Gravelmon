package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Riverous extends drai.dev.gravelmon.pokemon.Pokemon {
    public Riverous(Stats stats) {
        super("Riverous",
                Type.WATER,
                stats,
                List.of(Ability.SWIFT_SWIM), Ability.STRONG_JAW,
                21, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Riverous have a short temper and large appetite, often dominating rivers and lakes to the point of complete desolation. They can even chase prey outside of water for a short time."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BRINE,1),
                        new MoveLearnSetEntry(Move.WATERFALL,1),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.WATER_PULSE,12),
                        new MoveLearnSetEntry(Move.YAWN,16),
                        new MoveLearnSetEntry(Move.FLAIL,19),
                        new MoveLearnSetEntry(Move.CORAL_BREAK,23),
                        new MoveLearnSetEntry(Move.AGILITY,28),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,34),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,39),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,45),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,50),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,37)
                ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 28, 47, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_RIVER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Riverous");

    }


}
