package drai.dev.data.pokemon.blazingemerald;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Goolossal extends Pokemon {
    public Goolossal() {
        super("Goolossal",
                Type.FAIRY,
                new Stats(200, 65, 70, 120, 110, 35),
                List.of(Ability.LIQUID_OOZE), Ability.LIQUID_OOZE,
                UnitConverter.feetToMeters(22, 4), UnitConverter.lbsToKg(4625),
                new Stats(3,0,0,0,0,0), 15,
                0.5,
                360, ExperienceGroup.SLOW,
                70,
                51,  List.of(EggGroup.DRAGON),
                List.of("This enormous evolution of Goomy is entirely unique to the Hoenn region. Goolossal are often accompanied by hordes of Goomy that serve them willingly."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COVET,5),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,10),
                        new MoveLearnSetEntry(Move.DAZZLE_DUST,15),
                        new MoveLearnSetEntry(Move.RECOVER,20),
                        new MoveLearnSetEntry(Move.MOONRAZER,25),
                        new MoveLearnSetEntry(Move.YAWN,30),
                        new MoveLearnSetEntry(Move.MIRE_SURGE,49),
                        new MoveLearnSetEntry(Move.RAGING_WAVES,57),
                        new MoveLearnSetEntry(Move.AMNESIA,66),
                        new MoveLearnSetEntry(Move.HYDRO_CANNON,75),
                        new MoveLearnSetEntry(Move.MIRE_SURGE,46),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.CATACLYSM,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"egg"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"egg"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"egg")
                ),
                List.of(Label.BLAZING_EMERALD),
                0, List.of(),
                new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(50)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

    }
}
