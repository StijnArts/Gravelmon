package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Kisadee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kisadee() {
        super("Kisadee",
                Type.NORMAL, Type.FLYING,
                new Stats(65,
                        88,
                        53,
                        60,
                        60,
                        89),
                List.of(Ability.KEEN_EYE,Ability.COURAGEOUS,Ability.ADAPTABILITY), Ability.ADAPTABILITY,
                8, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                53, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("They manuver their movements easily in the air, even through the strongest storms. By making quick turns, they catch bug Pokemon mid-flight."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.LEER,3),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,6),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,9),
                        new MoveLearnSetEntry(Move.FLURRYPECK,13),
                        new MoveLearnSetEntry(Move.FORESIGHT,16),
                        new MoveLearnSetEntry(Move.WING_ATTACK,20),
                        new MoveLearnSetEntry(Move.SWIFT,23),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,27),
                        new MoveLearnSetEntry(Move.TAILWIND,30),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,34),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,37),
                        new MoveLearnSetEntry(Move.LAST_RESORT,42),
                        new MoveLearnSetEntry(Move.FEATHERSLASH,46),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kisadee");

    }


}
