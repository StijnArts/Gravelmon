package drai.dev.gravelmon.pokemon.lagoone;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Starena extends drai.dev.gravelmon.pokemon.Pokemon {
    public Starena() {
        super("Starena",
                Type.GROUND, Type.FIGHTING,
                new Stats(82,
                        115,
                        105,
                        54,
                        74,
                        62),
                List.of(Ability.SAND_VEIL,Ability.BATTLE_ARMOR), Ability.SAND_SPIT,
                10, 280,
                new Stats(0,1,1,0,0,0), 75,
                0.5,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.DIG,21),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,25),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,28),
                        new MoveLearnSetEntry(Move.SAND_TOMB,32),
                        new MoveLearnSetEntry(Move.MEDITATE,36),
                        new MoveLearnSetEntry(Move.EARTH_POWER,40),
                        new MoveLearnSetEntry(Move.SUPERPOWER,44),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,50),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,54)
                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 30, 51, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.DESERT_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Starena");

    }


}
