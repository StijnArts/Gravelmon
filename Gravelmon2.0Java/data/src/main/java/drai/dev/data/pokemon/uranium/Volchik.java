package drai.dev.data.pokemon.uranium;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Volchik extends Pokemon {
    public Volchik() {
        super("Volchik",
                Type.ELECTRIC, Type.FLYING,
                new Stats(55,
                        40,
                        50,
                        65,
                        40,
                        55),
                List.of(Ability.VOLT_ABSORB), Ability.VOLT_ABSORB,
                6, 95,
                new Stats(0,0,0,1,0,0), 180,
                0.5,
                61, ExperienceGroup.SLOW,
                70,
                100, List.of(EggGroup.FLYING, EggGroup.DRAGON),
                List.of("They gather together during thunderstorms. Their chirping sounds like static electricity."),
                List.of(new EvolutionEntry("voltasu", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.LEER,5),
                        new MoveLearnSetEntry(Move.CHARGE,9),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,13),
                        new MoveLearnSetEntry(Move.SPARK,17),
                        new MoveLearnSetEntry(Move.ROAR,21),
                        new MoveLearnSetEntry(Move.WING_ATTACK,25),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,29),
                        new MoveLearnSetEntry(Move.SPARK,33),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,37),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,41),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,48),
                        new MoveLearnSetEntry(Move.ROOST,51),
                        new MoveLearnSetEntry(Move.DISCHARGE,54),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,55),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,58),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,61),
                        new MoveLearnSetEntry(Move.THUNDER,63),
                        new MoveLearnSetEntry(Move.HURRICANE,68),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,71),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.PLUCK,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"egg"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"egg"),
                        new MoveLearnSetEntry(Move.MEGAHORN,"egg"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"egg"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"egg"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"egg")
                        ),
                List.of(Label.URANIUM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_HIGHLANDS, Biome.IS_BADLANDS)
    .canSeeSky()
    .isThundering()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
