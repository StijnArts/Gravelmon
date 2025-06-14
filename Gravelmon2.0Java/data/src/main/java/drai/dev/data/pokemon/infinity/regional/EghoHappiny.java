package drai.dev.data.pokemon.infinity.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class EghoHappiny extends Pokemon {
    public EghoHappiny(String name, Aspect aspect) {
        super(name, aspect,"EghoHappiny",
                Type.FIGHTING, Type.FAIRY,
                new Stats(65, 100, 15, 5, 5, 30),
                List.of(Ability.ANGER_POINT, Ability.RECKLESS), Ability.OWN_TEMPO,
                6, 244,
                new Stats(0,2,0,0,0,0), 80,
                0,
                80, ExperienceGroup.FAST,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("In order to adapt to an environment of egg-stealing predators, Happiny has become hyper-aggressive and territorial. It carries an egg-shaped rock in its pouch."),
                List.of(new EvolutionEntry("eghochansey", EvolutionType.LEVEL_UP, true, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"26"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "cobblemon:oval_stone"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME, "day")))),
                List.of(
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.KARATE_CHOP,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,1),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,5),
                        new MoveLearnSetEntry(Move.REFRESH,9),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,12),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,13),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,18),
                        new MoveLearnSetEntry(Move.ROCK_THROW,22),
                        new MoveLearnSetEntry(Move.ARM_THRUST,28),
                        new MoveLearnSetEntry(Move.BULK_UP,32),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tutor"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.KARATE_CHOP,"tutor"),
                        new MoveLearnSetEntry(Move.POUND,"tutor"),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,"tutor"),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,"tutor"),
                        new MoveLearnSetEntry(Move.REFRESH,"tutor"),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,"tutor"),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,"tutor"),
                        new MoveLearnSetEntry(Move.ROCK_THROW,"tutor"),
                        new MoveLearnSetEntry(Move.ARM_THRUST,"tutor"),
                        new MoveLearnSetEntry(Move.BEAT_UP,"egg"),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"egg"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"egg"),
                        new MoveLearnSetEntry(Move.MEGAHORN,"egg"),
                        new MoveLearnSetEntry(Move.METEOR_MASH,"egg"),
                        new MoveLearnSetEntry(Move.METRONOME,"egg"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"egg"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"egg"),
                        new MoveLearnSetEntry(Move.REVENGE,"egg"),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,"egg"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,"egg")
                        ),
                List.of(Label.INFINITY, Label.GEN4),
                1, List.of(
                        new ItemDrop("cobblemon:oval_stone",20, 1,1)
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .duringDaytime()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Happiny");

    }
}
