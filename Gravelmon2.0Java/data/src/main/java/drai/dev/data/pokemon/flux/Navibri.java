package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Navibri extends Pokemon {
    public Navibri() {
        super("Navibri",
                Type.FLYING, Type.NORMAL,
                new Stats(56,
                        70,
                        58,
                        50,
                        40,
                        91),
                List.of(Ability.SAP_SIPPER, Ability.SPEED_BOOST), Ability.BOMBARDIER,
                6, 103,
                new Stats(0,0,0,0,0,2), 120,
                0.5,
                128, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("It has a flawless sense of direction, and can memorize migratory routes across hundreds of miles. They act as scouts for the flock."),
                List.of(new EvolutionEntry("turbolibri", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.WING_ATTACK,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,11),
                        new MoveLearnSetEntry(Move.BULLET_SEED,14),
                        new MoveLearnSetEntry(Move.AGILITY,19),
                        new MoveLearnSetEntry(Move.DRILL_PECK,24),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,29),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF,33),
                        new MoveLearnSetEntry(Move.TAILWIND,39),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,44),
                        new MoveLearnSetEntry(Move.EXPLOSION,49)
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 16, 33, 0.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FLORAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
    }
}
