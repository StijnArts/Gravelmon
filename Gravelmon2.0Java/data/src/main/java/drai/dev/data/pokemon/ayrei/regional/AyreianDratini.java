package drai.dev.data.pokemon.ayrei.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AyreianDratini extends drai.dev.data.pokemon.Pokemon {
    public AyreianDratini(String name, Aspect aspect) {
        super(name, aspect, "Dratini",
                Type.FIRE,Type.SOUND,
                new Stats(51,
                        59,
                        50,
                        40,
                        50,
                        50),
                List.of(Ability.INNER_FOCUS), null,
                18, 233,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("The first instance of Dratini sightings where under a meteor shower, so it is theorized that it came from space."),
                List.of(new EvolutionEntry("dragonair ayreian", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.AGILITY,20),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,46),
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,80),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,53),
                        new MoveLearnSetEntry(Move.CALM_MIND,62),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.BOOMBURST,71),
                        new MoveLearnSetEntry(Move.HEARTBEAT,25),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,15),
                        new MoveLearnSetEntry(Move.UPROAR,33),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,39),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BIND,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.MEGAHORN,"tm"),
                        new MoveLearnSetEntry(Move.AUDIOBREAK,"tm")                        ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_LAVA)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Dratini");

    }


}
