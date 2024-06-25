package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Evercle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Evercle() {
        super("Evercle",
                Type.WATER, Type.QUESTION_MARK,
                new Stats(95,
                        70,
                        70,
                        110,
                        96,
                        79),
                List.of(Ability.MADNESS,Ability.SWIFT_SWIM), Ability.TRACE,
                14, 346,
                new Stats(1,0,0,1,1,0), 75,
                0.25,
                173, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Evercle come across as friendly, but beware of the large beak they have beneath their tentacles. They often quarrel with Jellectric."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BUBBLE,5),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,8),
                        new MoveLearnSetEntry(Move.SING,13),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,15),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,20),
                        new MoveLearnSetEntry(Move.CHARM,22),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,27),
                        new MoveLearnSetEntry(Move.LIFE_DEW,29),
                        new MoveLearnSetEntry(Move.BRINE,34),
                        new MoveLearnSetEntry(Move.CALM_MIND,36),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,41),
                        new MoveLearnSetEntry(Move.SPARKLING_ARIA,43),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,48),
                        new MoveLearnSetEntry(Move.MOONBLAST,50),
                        new MoveLearnSetEntry(Move.PERISH_SONG,55),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,57)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 33, 48, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Evercle");

    }


}
