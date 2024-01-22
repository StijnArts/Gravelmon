package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Lylapse extends Pokemon {
    public Lylapse() {
        super("Lylapse",
                Type.GROUND,
                new Stats(85,
                        95,
                        75,
                        110,
                        80,
                        135),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                22, 2342,
                new Stats(0,0,0,0,0,3), 3,
                -1,
                217, ExperienceGroup.SLOW,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("A Pokémon that can distort space. When it runs, its legs move at such a high speed that it appears to be gliding."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.MUD_SHOT,9),
                        new MoveLearnSetEntry(Move.SAND_TOMB,17),
                        new MoveLearnSetEntry(Move.MAGNITUDE,25),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,33),
                        new MoveLearnSetEntry(Move.SCARY_FACE,41),
                        new MoveLearnSetEntry(Move.EARTH_POWER,49),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,57),
                        new MoveLearnSetEntry(Move.WORK_UP,65),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,73),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,81),
                        new MoveLearnSetEntry(Move.AGILITY,89),
                        new MoveLearnSetEntry(Move.DELUGE,97),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_BOLT,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.RAGING_FLAME,"tm"),
                        new MoveLearnSetEntry(Move.DIAMOND_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.DIG,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_NOISE,"tutor"),
                        new MoveLearnSetEntry(Move.RAID,"tutor"),
                        new MoveLearnSetEntry(Move.WAVE_SPLASH,"tutor")
                        ),
                List.of(Label.DENEB, Label.LEGENDARY),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 65, 70, 0.000005, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.MAXY, "40")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
    }
}
