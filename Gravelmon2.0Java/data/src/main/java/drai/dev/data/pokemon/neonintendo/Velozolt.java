package drai.dev.data.pokemon.neonintendo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Velozolt extends drai.dev.data.pokemon.Pokemon {
    public Velozolt() {
        super("Velozolt",
                Type.ELECTRIC, Type.ROCK,
                new Stats(60,
                        100,
                        70,
                        110,
                        60,
                        85),
                List.of(Ability.VOLT_ABSORB), Ability.STATIC,
                18, 1900,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                170, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("- Tackle Normal - Thunder ShockSTAB Electric 7 Charge Electric 13 Aerial Ace Flying 18 AccelerockSTAB Rock 23 Pluck Flying 29 Ancient PowerSTAB Rock 35 Slam Normal 42 Wild ChargeSTAB Electric 49 Feather Dance Flying 56 DischargeSTAB Electric 63 Bolt BeakSTAB Electric 70 Stone EdgeSTAB Rock 77 ThunderSTAB Electric"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.CHARGE,7),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,13),
                        new MoveLearnSetEntry(Move.ACCELEROCK,18),
                        new MoveLearnSetEntry(Move.PLUCK,23),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,29),
                        new MoveLearnSetEntry(Move.SLAM,35),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,42),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,49),
                        new MoveLearnSetEntry(Move.DISCHARGE,56),
                        new MoveLearnSetEntry(Move.BOLT_BEAK,63),
                        new MoveLearnSetEntry(Move.STONE_EDGE,70),
                        new MoveLearnSetEntry(Move.THUNDER,77),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_KICK,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm")                        ),
                List.of(Label.NEO_NINTENDO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Velozolt");

    }


}
