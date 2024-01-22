package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Stellith extends Pokemon {
    public Stellith() {
        super( "Stellith",
                Type.ROCK, Type.PSYCHIC,
                new Stats(70	,
                        85,
                        55	,
                        95,
                        65,
                        70),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                14, 1790,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                150, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It powers up when exposed to starlight. It is closely related to meteorites, but the exact connection is a mystery."),
                List.of(new EvolutionEntry("planite", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:sun_stone"),
                        new EvolutionEntry("planite", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:moon_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.STARFREEZE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,7),
                        new MoveLearnSetEntry(Move.SWIFT,10),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,16),
                        new MoveLearnSetEntry(Move.PSYWAVE,19),
                        new MoveLearnSetEntry(Move.BATON_PASS,25),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,28),
                        new MoveLearnSetEntry(Move.MAGNET_FORCE,34),
                        new MoveLearnSetEntry(Move.STARDUST,37),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,43),
                        new MoveLearnSetEntry(Move.CALM_MIND,49),
                        new MoveLearnSetEntry(Move.GRAND_BOULDER,55),
                        new MoveLearnSetEntry(Move.EXPLOSION,58),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,"tm"),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.DISCHARGE,"tm"),
                        new MoveLearnSetEntry(Move.DIAMOND_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_NOISE,"tutor"),
                        new MoveLearnSetEntry(Move.PSYGATLING,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_SPARK,"tutor")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 20, 46, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DRIPSTONE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
    }
}
