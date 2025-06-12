package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochLampent extends drai.dev.data.pokemon.Pokemon {
    public EpochLampent(String name, Aspect aspect) {
        super(name, aspect, "EpochLampent",
                Type.LIGHT,Type.GHOST,
                new Stats(50,
                        40,
                        55,
                        75,
                        85,
                        65),
                List.of(Ability.WANDERING_SPIRIT,Ability.TRANSISTOR), Ability.DAZZLING,
                6, 130,
                new Stats(0,0,0,2,0,0), 100,
                0.5,
                130, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It possesses street lights and pranks municipal workers into thinking the lamp light has fused. It then scares the workers when they come to repair them."),
                List.of(new EvolutionEntry("epochchandelure", EvolutionType.ITEM_INTERACT, false, List.of(),
 List.of(), List.of(), "cobblemon:shiny_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.ECTOPLASM,56),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,40),
                        new MoveLearnSetEntry(Move.STROBELIGHT,1),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,27),
                        new MoveLearnSetEntry(Move.CURSE,52),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,22),
                        new MoveLearnSetEntry(Move.FLASH,11),
                        new MoveLearnSetEntry(Move.DISCHARGE,32),
                        new MoveLearnSetEntry(Move.MORNING_SUN,36),
                        new MoveLearnSetEntry(Move.LUMINESCENCE,1),
                        new MoveLearnSetEntry(Move.PHOTON_GEYSER,60),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,7),
                        new MoveLearnSetEntry(Move.SPOTLIGHT,1),
                        new MoveLearnSetEntry(Move.PULSE,14),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,48),
                        new MoveLearnSetEntry(Move.HEX,18),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,44),
                        new MoveLearnSetEntry(Move.GOOSEBUMP,1),
                        new MoveLearnSetEntry(Move.ARCANEENERGY,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"tm"),
                        new MoveLearnSetEntry(Move.BATTERYACID,"tm"),
                        new MoveLearnSetEntry(Move.BATTLEOFWITS,"tm"),
                        new MoveLearnSetEntry(Move.BURNINGOFUDA,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DIVINEPUNISHMENT,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.FANTASYSEAL,"tm"),
                        new MoveLearnSetEntry(Move.GENESIS,"tm"),
                        new MoveLearnSetEntry(Move.GENTLECHIMES,"tm"),
                        new MoveLearnSetEntry(Move.GLISTEN,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.MACABREDANCE,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm"),
                        new MoveLearnSetEntry(Move.MEMENTO,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.MISSILESHOT,"tm"),
                        new MoveLearnSetEntry(Move.MIXEDWAVES,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.POLTERGEIST,"tm"),
                        new MoveLearnSetEntry(Move.POSSESSION,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PURGE,"tm"),
                        new MoveLearnSetEntry(Move.RAYOFLIGHT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOULSHIELD,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(27)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Lampent");

    }


}
