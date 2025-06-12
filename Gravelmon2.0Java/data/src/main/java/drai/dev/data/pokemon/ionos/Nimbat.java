package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nimbat extends drai.dev.data.pokemon.Pokemon {
    public Nimbat() {
        super("Nimbat",
                Type.ELECTRIC, Type.FLYING,
                new Stats(62,
                        60,
                        75,
                        80,
                        75,
                        75),
                List.of(Ability.LIGHTNING_ROD,Ability.CLOUD_NINE), Ability.DRIZZLE,
                6, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Cloubat lives inside mountainous caves where thunder can be heard. They charge themselves by gathering electricity stored inside dark clouds, or by using their tail and muzzle together like an outlet while asleep. Their sense of smell and memory is said to be excellent."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.TAILWIND,4),
                        new MoveLearnSetEntry(Move.BITE,8),
                        new MoveLearnSetEntry(Move.CHARGE,11),
                        new MoveLearnSetEntry(Move.SONIC_BOOM,15),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,22),
                        new MoveLearnSetEntry(Move.SNORE,25),
                        new MoveLearnSetEntry(Move.REST,25),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,29),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,35),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,40),
                        new MoveLearnSetEntry(Move.AIR_SLASH,44),
                        new MoveLearnSetEntry(Move.THUNDER,50),
                        new MoveLearnSetEntry(Move.HURRICANE,59),
                        new MoveLearnSetEntry(Move.WATER_GUN,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.BOOMBURST,"tm"),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.HEART_STAMP,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm")                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 7, 29, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.IS_THUNDERING,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nimbat");
        setCanFly(true);

    }


}
