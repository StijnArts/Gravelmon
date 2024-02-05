package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Hogawatt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hogawatt() {
        super("Hogawatt",
                Type.ELECTRIC,Type.GROUND,
                new Stats(65,
                        117,
                        60,
                        53,
                        54,
                        131),
                List.of(Ability.VITAL_SPIRIT), Ability.MOLD_BREAKER,
                15, 165,
                new Stats(2,0,0,0,0,0), 50,
                0.5,
                195, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Once it gets angry, Hogawatt will rampage until its fully out of energy. It is almost impossible to calm this Pokemon down."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.CHARGE,5),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,9),
                        new MoveLearnSetEntry(Move.SPARK,13),
                        new MoveLearnSetEntry(Move.MUDSLAP,15),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,19),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,26),
                        new MoveLearnSetEntry(Move.ASSURANCE,28),
                        new MoveLearnSetEntry(Move.BULLDOZE,33),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,37),
                        new MoveLearnSetEntry(Move.ROAR,41),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,45),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,52)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 31, 46, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hogawatt");

    }


}
