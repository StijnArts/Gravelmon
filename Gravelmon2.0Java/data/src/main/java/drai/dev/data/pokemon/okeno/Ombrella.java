package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ombrella extends drai.dev.data.pokemon.Pokemon {
    public Ombrella() {
        super("Ombrella",
                Type.GHOST, Type.WATER,
                new Stats(88,
                        52,
                        52,
                        108,
                        108,
                        88),
                List.of(Ability.DRIZZLE), Ability.PRANKSTER,
                7, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                170, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It manipulates water with its lolling tongue and can make it rain at will. Ombrella are often misunderstood as bringers of bad luck."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DEFOG,1),
                        new MoveLearnSetEntry(Move.BIND,4),
                        new MoveLearnSetEntry(Move.LICK,7),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,12),
                        new MoveLearnSetEntry(Move.WHIRLWIND,16),
                        new MoveLearnSetEntry(Move.WATER_PULSE,20),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,25),
                        new MoveLearnSetEntry(Move.HAZE,29),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,33),
                        new MoveLearnSetEntry(Move.MIST,37),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,40),
                        new MoveLearnSetEntry(Move.GUARD_SWAP,42),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,46),
                        new MoveLearnSetEntry(Move.ENSNARE,50),
                        new MoveLearnSetEntry(Move.SOAK,55),
                        new MoveLearnSetEntry(Move.TICKLE,60),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.SCREECH,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,"tm"),
                        new MoveLearnSetEntry(Move.POLTERGEIST,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 17, 43, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.IS_RAINING,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ombrella");

    }


}
