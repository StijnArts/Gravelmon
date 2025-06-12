package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pounther extends Pokemon {
    public Pounther() {
        super("Pounther",
                Type.NORMAL,
                new Stats(55, 80, 50, 35, 40, 75),
                List.of(Ability.LIMBER, Ability.ADRENALINE), Ability.UNBURDEN,
                7, 162,
                new Stats(0,1,0,0,0,0), 225,
                0.5,
                58, ExperienceGroup.FAST,
                70,
                48, List.of(EggGroup.FIELD),
                List.of("Pounther plays with its siblings by sneaking up on them and then jumping them when they least expect it. This game serves as training for the hunt."),
                List.of(new EvolutionEntry("jaguile", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.ASSIST,1),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,3),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,6),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                        new MoveLearnSetEntry(Move.PURSUIT,12),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,15),
                        new MoveLearnSetEntry(Move.FAKE_OUT,19),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,21),
                        new MoveLearnSetEntry(Move.BITE,24),
                        new MoveLearnSetEntry(Move.SLASH,28),
                        new MoveLearnSetEntry(Move.SWAGGER,30),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,33),
                        new MoveLearnSetEntry(Move.SWIFT,37),
                        new MoveLearnSetEntry(Move.TORMENT,39),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,42),
                        new MoveLearnSetEntry(Move.AGILITY,46),
                        new MoveLearnSetEntry(Move.ME_FIRST,48),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tutor"),
                        new MoveLearnSetEntry(Move.SNATCH,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SPITE,"tutor"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tutor"),
                        new MoveLearnSetEntry(Move.SWIFT,"tutor"),
                        new MoveLearnSetEntry(Move.UPROAR,"tutor"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"egg"),
                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"egg"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"egg"),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,"egg"),
                        new MoveLearnSetEntry(Move.PUNISHMENT,"egg")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("cobblemon:quick_claw",100, 1,2)
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

    }
}
