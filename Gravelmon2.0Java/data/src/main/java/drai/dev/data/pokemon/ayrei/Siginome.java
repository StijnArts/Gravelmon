package drai.dev.data.pokemon.ayrei;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Siginome extends drai.dev.data.pokemon.Pokemon {
    public Siginome() {
        super("Siginome",
                Type.GROUND,Type.PSYCHIC,
                new Stats(98,
                        110,
                        70,
                        92,
                        45,
                        70),
                List.of(Ability.WONDER_SKIN,Ability.MAGIC_GUARD), null,
                14, 140,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("It moves sporadically, infesting the abandoned temples of deserts. The two heads can switch control between each other at will."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,35),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,40),
                        new MoveLearnSetEntry(Move.MUD_SHOT,1),
                        new MoveLearnSetEntry(Move.REFLECT,50),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,50),
                        new MoveLearnSetEntry(Move.GRAVITY,5),
                        new MoveLearnSetEntry(Move.HYPNOSIS,10),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,30),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.RECOVER,60),
                        new MoveLearnSetEntry(Move.BULLDOZE,15),
                        new MoveLearnSetEntry(Move.NAZCAPATTERNS,45),
                        new MoveLearnSetEntry(Move.PSYBEAM,20),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,55),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,25),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.EXPANDING_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.GRAVITY,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.IMPRISON,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.POWER_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SPEED_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.STORED_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,"egg"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"egg")                        ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(21)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.JUNGLE_PYRAMID)
    .build(), List.of());
	
           setLangFileName("Siginome");

    }


}
