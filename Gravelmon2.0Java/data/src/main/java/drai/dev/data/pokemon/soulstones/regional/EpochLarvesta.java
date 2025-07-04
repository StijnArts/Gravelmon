package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochLarvesta extends drai.dev.data.pokemon.Pokemon {
    public EpochLarvesta(String name, Aspect aspect) {
        super(name, aspect, "EpochLarvesta",
                Type.BUG,Type.ELECTRIC,
                new Stats(55,
                        85,
                        55,
                        60,
                        50,
                        55),
                List.of(Ability.STATIC,Ability.TINTED_LENS), Ability.SWARM,
                11, 288,
                new Stats(0,1,0,0,0,0), 100,
                0.5,
                72, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("You can often find this Pokemon nibbling on electric wires to siphon the electrical current within as food."),
                List.of(new EvolutionEntry("epochvolcarona", EvolutionType.LEVEL_UP, List.of(),
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"50")))),
                List.of(
                        new MoveLearnSetEntry(Move.AGILITY,28),
                        new MoveLearnSetEntry(Move.ATTACK_ORDER,44),
                        new MoveLearnSetEntry(Move.BUG_BITE,16),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,24),
                        new MoveLearnSetEntry(Move.STATICSHOCK,1),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,20),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,8),
                        new MoveLearnSetEntry(Move.SPARK,12),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,36),
                        new MoveLearnSetEntry(Move.SWARMOVERLOAD,52),
                        new MoveLearnSetEntry(Move.VOLT_TACKLE,48),
                        new MoveLearnSetEntry(Move.PROTONCRASH,32),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,40),
                        new MoveLearnSetEntry(Move.BOLT_STRIKE,56),
                        new MoveLearnSetEntry(Move.STRING_SHOT,4),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.BUTTERFLYKISS,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.COUPDEGRACE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DIVINEPUNISHMENT,"tm"),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,"tm"),
                        new MoveLearnSetEntry(Move.DUNEBLAST,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FLUTTER,"tm"),
                        new MoveLearnSetEntry(Move.GENESIS,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HIVEMIND,"tm"),
                        new MoveLearnSetEntry(Move.HURRICANE,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.NECTARTAP,"tm"),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PURGE,"tm"),
                        new MoveLearnSetEntry(Move.RAINBOWSCALES,"tm"),
                        new MoveLearnSetEntry(Move.RAYOFLIGHT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWARMOVERLOAD,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.TAIL_GLOW,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.FORESIGHT,"egg"),
                        new MoveLearnSetEntry(Move.HARDEN,"egg"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"egg"),
                        new MoveLearnSetEntry(Move.MORNING_SUN,"egg"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"egg"),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(8)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MAGICAL)
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Larvesta");

    }


}
