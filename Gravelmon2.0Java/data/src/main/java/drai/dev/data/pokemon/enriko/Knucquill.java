package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Knucquill extends drai.dev.data.pokemon.Pokemon {
    public Knucquill() {
        super("Knucquill",
                Type.GROUND, Type.FIGHTING,
                new Stats(75,
                        110,
                        90,
                        40,
                        70,
                        70),
                List.of(Ability.SAND_VEIL,Ability.SHEER_FORCE,Ability.ROUGH_SKIN), Ability.ROUGH_SKIN,
                10, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The spikes on its knuckles are unbreakable. A single punch can easily gouge its enemy's vital areas."),
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
                        new MoveLearnSetEntry(Move.BELLY_DRUM,54)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 22, 36, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND, Biome.IS_FOREST))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Knucquill");

    }


}
