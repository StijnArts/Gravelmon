package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Nemea extends Pokemon {
    public Nemea() {
        super("Nemea",
                Type.STEEL,
                new Stats(80,
                        135,
                        95,
                        85,
                        110,
                        75),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                28, 2855,
                new Stats(0,3,0,0,0,0), 3,
                -1,
                216, ExperienceGroup.SLOW,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("A Pokémon that can control minds. It tosses its opponents over its head with its single powerful horn."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,9),
                        new MoveLearnSetEntry(Move.CORNER,17),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,25),
                        new MoveLearnSetEntry(Move.IRON_HEAD,33),
                        new MoveLearnSetEntry(Move.METAL_SOUND,41),
                        new MoveLearnSetEntry(Move.CRUNCH,49),
                        new MoveLearnSetEntry(Move.STARDUST,57),
                        new MoveLearnSetEntry(Move.WORK_UP,65),
                        new MoveLearnSetEntry(Move.GEO_IMPACT,73),
                        new MoveLearnSetEntry(Move.METAL_BLAST,81),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,89),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,97),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.MEGAHORN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.DEVASTATE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.RAGING_FLAME,"tm"),
                        new MoveLearnSetEntry(Move.DIAMOND_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_NOISE,"tutor"),
                        new MoveLearnSetEntry(Move.RAID,"tutor")
                        ),
                List.of(Label.DENEB, Label.LEGENDARY),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 65, 70, 0.000005, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.MAXY, "40")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
    }
}
