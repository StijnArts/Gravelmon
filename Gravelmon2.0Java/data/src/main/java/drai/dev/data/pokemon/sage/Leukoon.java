package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Leukoon extends Pokemon {
    public Leukoon() {
        super("Leukoon",
                Type.GHOST, Type.NORMAL,
                new Stats(45, 40, 140, 74, 130, 35),
                List.of(Ability.REGENERATOR, Ability.MAGIC_GUARD), Ability.FRIEND_GUARD,
                8, 253,
                new Stats(0,0,1,0,1,0), 70,
                0.5,
                162, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.FIELD),
                List.of("Scientists call Leukoon the immune system of nature. It is able to engulf any threat to its habitat using its massive, void-like maw."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STOCKPILE,1),
                        new MoveLearnSetEntry(Move.SWALLOW,1),
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,4),
                        new MoveLearnSetEntry(Move.SPITE,8),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,12),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,15),
                        new MoveLearnSetEntry(Move.CURSE,19),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,23),
                        new MoveLearnSetEntry(Move.NULL_ROOM,26),
                        new MoveLearnSetEntry(Move.SINGULARITY,30),
                        new MoveLearnSetEntry(Move.ENGULF,34),
                        new MoveLearnSetEntry(Move.BODY_SLAM,37),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,41),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,45),
                        new MoveLearnSetEntry(Move.HEX,48),
                        new MoveLearnSetEntry(Move.WILLOWISP,52),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,56),
                        new MoveLearnSetEntry(Move.TERRORIZE,59),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.MIRACLE_WILL,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.GRAVITY,"tutor"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tutor"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tutor"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SPITE,"tutor"),
                        new MoveLearnSetEntry(Move.SWIFT,"tutor"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"egg"),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,"egg"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"egg")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:leather",100, 1,1)
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(18)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        
    }
}
