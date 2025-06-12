package drai.dev.data.pokemon.blazingemerald.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HoennianRegigigas extends Pokemon {
    public HoennianRegigigas(String name, Aspect aspect) {
        super(name, aspect,"HoennianRegigigas",
                Type.GHOST,
                new Stats(55, 195, 95, 90, 180, 85),
                List.of(Ability.CLEAR_BODY), Ability.SHADOW_TAG,
                UnitConverter.feetToMeters(6, 11), UnitConverter.lbsToKg(2425),
                new Stats(0,2,0,0,1,0), 3,
                0.5,
                302, ExperienceGroup.SLOW,
                70,
                51,  List.of(EggGroup.UNDISCOVERED),
                List.of("After eons of being sealed away, all that remains of Regigigas is its skeletal structure. In its prime, this Pokemon was capable of reshaping the world."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_POWDER,1),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,1),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,1),
                        new MoveLearnSetEntry(Move.BONE_RUSH,40),
                        new MoveLearnSetEntry(Move.REVENGE,50),
                        new MoveLearnSetEntry(Move.BLACKOUT,60),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,70),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,80),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,90),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.VEILED_SKY,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FREEZEDRY,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SHEER_COLD,"egg"),
                        new MoveLearnSetEntry(Move.DARK_BARGAIN,"egg")
                        ),
                List.of(Label.BLAZING_EMERALD, Label.GEN1),
                0, List.of(),
                new PokemonSpawnDataBuilder(1)
    .legend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setAntiBiomes(Biome.IS_ARID, Biome.IS_TEMPERATE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
        this.setLangFileName("Regigigas");

        this.setCanFly(true);
    }
}
