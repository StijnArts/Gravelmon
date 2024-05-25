package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Smalmon extends Pokemon {
    public Smalmon() {
        super( "Smalmon",
                Type.WATER, Type.GROUND,
                new Stats(50	,
                        65	,
                        48	,
                        53	,
                        43	,
                        45),
                List.of(Ability.SWIFT_SWIM), Ability.MARVEL_SCALE,
                2, 18,
                new Stats(0,1,0,0,0,0), 220,
                0.5,
                68, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("By constantly adjusting the angle of its fins, it can swim against the current in rivers and oceans."),
                List.of(new EvolutionEntry("trojalmon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.MUD_SPORT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,5),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,9),
                        new MoveLearnSetEntry(Move.MUD_SHOT,15),
                        new MoveLearnSetEntry(Move.AQUA_JET,19),
                        new MoveLearnSetEntry(Move.TORMENT,23),
                        new MoveLearnSetEntry(Move.BULLDOZE,29),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,33),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,37),
                        new MoveLearnSetEntry(Move.MAGNITUDE,43),
                        new MoveLearnSetEntry(Move.SCARY_FACE,47),
                        new MoveLearnSetEntry(Move.FROSTBITE,51),
                        new MoveLearnSetEntry(Move.SWAGGER,57),
                        new MoveLearnSetEntry(Move.WAVE_SPLASH,61),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_BOLT,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.DIG,"tutor"),
                        new MoveLearnSetEntry(Move.RAID,"tutor"),
                        new MoveLearnSetEntry(Move.WAVE_SPLASH,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tutor"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"egg"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.BITE,"egg"),
                        new MoveLearnSetEntry(Move.CORNER,"egg"),
                        new MoveLearnSetEntry(Move.CRUNCH,"egg"),
                        new MoveLearnSetEntry(Move.DELUGE,"egg"),
                        new MoveLearnSetEntry(Move.DIVE,"egg"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"egg"),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.GRAND_BOULDER,"egg"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"egg"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.MIST,"egg"),
                        new MoveLearnSetEntry(Move.PROTECT,"egg"),
                        new MoveLearnSetEntry(Move.RAGE,"egg"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"egg"),
                        new MoveLearnSetEntry(Move.SCALD,"egg"),
                        new MoveLearnSetEntry(Move.TAUNT,"egg"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 2, 22, 7.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_RIVER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
    }
}
