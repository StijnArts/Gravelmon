package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Pestalation extends Pokemon {
    public Pestalation() {
        super("Pestalation",
                Type.FLYING, Type.POISON,
                new Stats(111,
                        111,
                        111,
                        111,
                        111,
                        111),
                List.of(Ability.STEELWORKER, Ability.BEAST_BOOST), Ability.POLLUTION,
                16, 337,
                new Stats(1,1,0,1,0,0), 45,
                -1,
                257, ExperienceGroup.SLOW,
                70,
                200, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.POISON_FANG,15),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,20),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,27),
                        new MoveLearnSetEntry(Move.BITE,34),
                        new MoveLearnSetEntry(Move.HAZE,41),
                        new MoveLearnSetEntry(Move.VENOSHOCK,48),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,55),
                        new MoveLearnSetEntry(Move.AIR_SLASH,62),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,69)
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(

                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 50, 70, 0.05, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.33, 0.3,
                List.of());
        setCanFly(true);
    }
}
