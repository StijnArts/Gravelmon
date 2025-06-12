package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochAbsol extends drai.dev.data.pokemon.Pokemon {
    public EpochAbsol(String name, Aspect aspect) {
        super(name, aspect, "EpochAbsol",
                Type.LIGHT,
                new Stats(65,
                        130,
                        60,
                        75,
                        75,
                        60),
                List.of(Ability.PUREHEART,Ability.SUPER_LUCK), Ability.STALWART,
                12, 470,
                new Stats(0,2,0,0,0,0), 80,
                0.5,
                163, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Its speed is unparalleled, that rumours have begun to swirl that it is actually a favoured pet or messenger of the Gods."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COUPDEGRACE,25),
                        new MoveLearnSetEntry(Move.CONSECRATE,15),
                        new MoveLearnSetEntry(Move.PURGE,35),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.EXCALIBUR,55),
                        new MoveLearnSetEntry(Move.LIGHTSABER,50),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,5),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,40),
                        new MoveLearnSetEntry(Move.HOLYFIRE,1),
                        new MoveLearnSetEntry(Move.VALKYRIECHARIOT,60),
                        new MoveLearnSetEntry(Move.SPARKLE,1),
                        new MoveLearnSetEntry(Move.PURIFY,30),
                        new MoveLearnSetEntry(Move.HEAVENSKNUCKLE,10),
                        new MoveLearnSetEntry(Move.LUMINOUSBLADE,65),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,45),
                        new MoveLearnSetEntry(Move.ZEAL,20),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"tm"),
                        new MoveLearnSetEntry(Move.BATTLEOFWITS,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.CHIDORI,"tm"),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.COSMICAVATAR,"tm"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tm"),
                        new MoveLearnSetEntry(Move.COUPDEGRACE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DEADLYREACH,"tm"),
                        new MoveLearnSetEntry(Move.DIVINEPUNISHMENT,"tm"),
                        new MoveLearnSetEntry(Move.FABLEDRUSH,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.GENESIS,"tm"),
                        new MoveLearnSetEntry(Move.GEOMANCY,"tm"),
                        new MoveLearnSetEntry(Move.GOBLINSTRIKE,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.HEAVENSKNUCKLE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.LIGHTSABER,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICPULSE,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PURGE,"tm"),
                        new MoveLearnSetEntry(Move.RAYOFLIGHT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.SWEEPINGWIND,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.TAIL_GLOW,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TITANIASLAW,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VALKYRIECHARIOT,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.REBUKE,"egg"),
                        new MoveLearnSetEntry(Move.HOLYFIRE,"egg"),
                        new MoveLearnSetEntry(Move.TAIL_GLOW,"egg"),
                        new MoveLearnSetEntry(Move.FINALSTAND,"egg"),
                        new MoveLearnSetEntry(Move.HALLOWEDGROUND,"egg"),
                        new MoveLearnSetEntry(Move.GUARDIANANGEL,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(24)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Absol");

    }


}
