package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Relicore extends Pokemon {
    public Relicore() {
        super("Relicore",
                Type.WATER, Type.ROCK,
                new Stats(115	,
                        105	,
                        140	,
                        50	,
                        70	,
                        60),
                List.of(Ability.SWIFT_SWIM), Ability.ROCK_HEAD,
                32, 831,
                new Stats(1,0,2,0,0,0), 15,
                0.5,
                195, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2, EggGroup.WATER_1),
                List.of("Its head is as hard as rock in order to withstand the pressure of the seafloor. Its tackles are incredibly powerful."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,1),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,1),
                        new MoveLearnSetEntry(Move.CRASH_IMPACT,1),
                        new MoveLearnSetEntry(Move.PALEOBREATH,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,8),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,15),
                        new MoveLearnSetEntry(Move.YAWN,22),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,29),
                        new MoveLearnSetEntry(Move.MUD_SPORT,36),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,43),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,48),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,51),
                        new MoveLearnSetEntry(Move.DIVE,59),
                        new MoveLearnSetEntry(Move.REST,67),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,67),
                        new MoveLearnSetEntry(Move.SNORE,67),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,75),
                        new MoveLearnSetEntry(Move.GRAND_BOULDER,83),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_BOLT,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.DEVASTATE,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.DIAMOND_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.WAVE_SPLASH,"tutor"),
                        new MoveLearnSetEntry(Move.RAID,"tutor"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"egg"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.BOUNCE,"egg"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"egg"),
                        new MoveLearnSetEntry(Move.CRASH_IMPACT,"egg"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"egg"),
                        new MoveLearnSetEntry(Move.FISSURE,"egg"),
                        new MoveLearnSetEntry(Move.HAIL,"egg"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"egg"),
                        new MoveLearnSetEntry(Move.MAGNITUDE,"egg"),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"egg"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"egg"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"egg"),
                        new MoveLearnSetEntry(Move.PROTECT,"egg"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"egg"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"egg"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"egg"),
                        new MoveLearnSetEntry(Move.SCALD,"egg"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"egg"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"egg"),
                        new MoveLearnSetEntry(Move.SNORE,"egg"),
                        new MoveLearnSetEntry(Move.STARFREEZE,"egg"),
                        new MoveLearnSetEntry(Move.SWAGGER,"egg"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"egg"),
                        new MoveLearnSetEntry(Move.WATER_SPORT,"egg"),
                        new MoveLearnSetEntry(Move.WAVE_SPLASH,"egg"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"egg")
                        ),
                List.of(Label.DENEB),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(48)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_DEEP_OCEAN)
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        this.setPreEvolution("relicanth");
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
        addAdditionalEvolution("relicanth", new EvolutionEntry("relicore", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"48"))));
    }
}
