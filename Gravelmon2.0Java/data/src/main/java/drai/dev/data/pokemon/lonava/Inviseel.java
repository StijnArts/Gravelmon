package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Inviseel extends drai.dev.data.pokemon.Pokemon {
    public Inviseel() {
        super("Inviseel",
                Type.DRAGON,
                new Stats(70,
                        90,
                        55,
                        55,
                        80,
                        55),
                List.of(Ability.STRONG_JAW), Ability.SHED_SKIN,
                7, 165,
                new Stats(0,1,0,0,1,0), 45,
                0.5,
                142, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.WATER_1),
                List.of("Inviseel take their pre-evolution's characteristic colour-changing abilities one step further by actually turning invisible when threatened. Limnologists aren't sure exactly where Inviseel can be found, though it's suspected that they could live anywhere."),
                List.of(new EvolutionEntry("auroreal", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.RAGE,4),
                        new MoveLearnSetEntry(Move.TWISTER,7),
                        new MoveLearnSetEntry(Move.WRAP,11),
                        new MoveLearnSetEntry(Move.SCARY_FACE,15),
                        new MoveLearnSetEntry(Move.SLAM,19),
                        new MoveLearnSetEntry(Move.DRAGONFANG,24),
                        new MoveLearnSetEntry(Move.CRUNCH,28),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,35),
                        new MoveLearnSetEntry(Move.COIL,41),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,45),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,52),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,57),
                        new MoveLearnSetEntry(Move.THRASH,63),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm"),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tm"),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm"),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.BEACHTIDE,"tm"),
                        new MoveLearnSetEntry(Move.WRING_OUT,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"tm"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm")                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .pseudoLegend()
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.REEF)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
