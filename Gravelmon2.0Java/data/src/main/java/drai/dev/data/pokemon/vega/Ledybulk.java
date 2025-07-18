package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ledybulk extends Pokemon {
    public Ledybulk() {
        super( "Ledybulk",
                Type.BUG, Type.FIGHTING,
                new Stats(70	,
                        120,
                        60	,
                        75,
                        90,
                        80),
                List.of(Ability.SWARM), Ability.EARLY_BIRD,
                15, 495,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                174, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("A Ledian with a body specialized for hand-to-hand combat. Its floating feet flutter freely through the air."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,1),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,1),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,1),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,1),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,4),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,9),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,12),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,17),
                        new MoveLearnSetEntry(Move.REFLECT,17),
                        new MoveLearnSetEntry(Move.SAFEGUARD,17),
                        new MoveLearnSetEntry(Move.BATON_PASS,22),
                        new MoveLearnSetEntry(Move.JUMP_KICK,29),
                        new MoveLearnSetEntry(Move.AGILITY,34),
                        new MoveLearnSetEntry(Move.ATTACK_ORDER,38),
                        new MoveLearnSetEntry(Move.DEFEND_ORDER,38),
                        new MoveLearnSetEntry(Move.HEAL_ORDER,38),
                        new MoveLearnSetEntry(Move.RAID,43),
                        new MoveLearnSetEntry(Move.STONE_EDGE,50),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,59),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,64),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DEVASTATE,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tutor"),
                        new MoveLearnSetEntry(Move.RAID,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.DIG,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_NOISE,"tutor"),
                        new MoveLearnSetEntry(Move.PSYGATLING,"tutor"),
                        new MoveLearnSetEntry(Move.WAVE_SPLASH,"tutor"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"egg"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,"egg"),
                        new MoveLearnSetEntry(Move.ANGRY_SWARM,"egg"),
                        new MoveLearnSetEntry(Move.BIDE,"egg"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,"egg"),
                        new MoveLearnSetEntry(Move.DIG,"egg"),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.ENCORE,"egg"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"egg"),
                        new MoveLearnSetEntry(Move.MAGNUM_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.MORNING_SUN,"egg"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"egg"),
                        new MoveLearnSetEntry(Move.PROTECT,"egg"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"egg"),
                        new MoveLearnSetEntry(Move.REFRESH,"egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"egg"),
                        new MoveLearnSetEntry(Move.SANDBLAST,"egg"),
                        new MoveLearnSetEntry(Move.SCREECH,"egg"),
                        new MoveLearnSetEntry(Move.SILVER_WIND,"egg"),
                        new MoveLearnSetEntry(Move.STRING_SHOT,"egg"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"egg"),
                        new MoveLearnSetEntry(Move.SWIFT,"egg"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(39)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .setAntiBiomes(Biome.IS_FREEZING)
    .canSeeSky()
    .atNight()
    .isNotRaining()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
        setPreEvolution("ledian");
        addAdditionalEvolution("ledian", new EvolutionEntry("ledybulk", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38"))));
    }
}
