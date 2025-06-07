package drai.dev.data.pokemon.flux;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gellin extends drai.dev.data.pokemon.Pokemon {
    public Gellin() {
        super("Gellin",
                Type.GRASS,Type.ELECTRIC,
                new Stats(90,
                        35,
                        75,
                        120,
                        100,
                        85),
                List.of(Ability.CHLOROPHYLL,Ability.SURGE_SURFER), Ability.SOLAR_POWER,
                14, 383,
                new Stats(0,0,0,1,1,0), 128,
                0.0,
                177, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("The energy that Gellin generates from photosynthesis is converted into electromagnetic pulses. It uses these as a means of propulsion."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,1),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.RECYCLE,1),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,17),
                        new MoveLearnSetEntry(Move.SYNTHESIS,21),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,27),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,31),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,39),
                        new MoveLearnSetEntry(Move.RECOVER,45),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,53),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,59),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,67),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,67),
                        new MoveLearnSetEntry(Move.CHLOROBLAST,75),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm")),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Gellin");

    }


}
