package drai.dev.data.pokemon.novrai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Underhandit extends drai.dev.data.pokemon.Pokemon {
    public Underhandit() {
        super("Underhandit",
                Type.DARK, Type.FIRE,
                new Stats(67,
                        133,
                        73,
                        84,
                        62,
                        91),
                List.of(Ability.PICKPOCKET,Ability.IRON_FIST,Ability.FRISK), Ability.FRISK,
                7, 165,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                179, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("It produces a red-hot oil from its skin, which coats anything it touches. This oil causes excruciating burns, so reclaiming items it's stolen is a difficult task."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FORESIGHT,1),
                        new MoveLearnSetEntry(Move.ASSURANCE,7),
                        new MoveLearnSetEntry(Move.TICKLE,9),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,12),
                        new MoveLearnSetEntry(Move.THIEF,16),
                        new MoveLearnSetEntry(Move.PURSUIT,18),
                        new MoveLearnSetEntry(Move.SWAGGER,21),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,25),
                        new MoveLearnSetEntry(Move.BURNING_JEALOUSY,27),
                        new MoveLearnSetEntry(Move.FORCE_PALM,30),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,33),
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,38),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,40),
                        new MoveLearnSetEntry(Move.SWITCHEROO,42),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,45),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,49),
                        new MoveLearnSetEntry(Move.EMBARGO,52),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,54),
                        new MoveLearnSetEntry(Move.FLING,58),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,63),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,"tm"),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,"tm"),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tm"),
                        new MoveLearnSetEntry(Move.BEAT_UP,"tm")                        ),
                List.of(Label.NOVRAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(28)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .atNight()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Underhandit");

    }


}
