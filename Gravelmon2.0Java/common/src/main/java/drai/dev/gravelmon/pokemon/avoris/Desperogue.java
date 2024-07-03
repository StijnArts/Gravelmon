package drai.dev.gravelmon.pokemon.avoris;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Desperogue extends drai.dev.gravelmon.pokemon.Pokemon {
    public Desperogue() {
        super("Desperogue",
                Type.GRASS, Type.DARK,
                new Stats(96,
                        89,
                        89,
                        44,
                        55,
                        60),
                List.of(Ability.HUSTLE,Ability.SAND_RUSH,Ability.RIVALRY), Ability.RIVALRY,
                13, 165,
                new Stats(0,0,0,0,0,0), 45,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It shoots multiple spikes at once, never missing its target. Desperogue pair up with a Desperasca to fight for territory and food in desert areas."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.LEECH_SEED,10),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,13),
                        new MoveLearnSetEntry(Move.BULLET_SEED,16),
                        new MoveLearnSetEntry(Move.POWER_TRIP,19),
                        new MoveLearnSetEntry(Move.INGRAIN,22),
                        new MoveLearnSetEntry(Move.PAYBACK,26),
                        new MoveLearnSetEntry(Move.SPIKES,30),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,35),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,38),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,44),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,49),
                        new MoveLearnSetEntry(Move.SANDSTORM,54)
                ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 33, 48, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Desperogue");

    }


}
