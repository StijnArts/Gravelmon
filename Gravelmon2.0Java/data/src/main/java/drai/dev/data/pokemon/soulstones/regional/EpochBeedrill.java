package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochBeedrill extends drai.dev.data.pokemon.Pokemon {
    public EpochBeedrill(String name, Aspect aspect) {
        super(name, aspect, "EpochBeedrill",
                Type.BUG,Type.STEEL,
                new Stats(95,
                        35,
                        60,
                        95,
                        100,
                        80),
                List.of(Ability.SOUNDPROOF,Ability.BATTLE_ARMOR), Ability.FULL_METAL_BODY,
                10, 295,
                new Stats(0,2,0,0,0,0), 100,
                0.5,
                178, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("All of its time spent observing its enemies while in its earlier stages have helped it learn such that it now preys on those that once hunted it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AGILITY,22),
                        new MoveLearnSetEntry(Move.PHEROMONESTREAM,25),
                        new MoveLearnSetEntry(Move.HELLBULLET,36),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,12),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,40),
                        new MoveLearnSetEntry(Move.HIVEMIND,55),
                        new MoveLearnSetEntry(Move.METAL_SOUND,16),
                        new MoveLearnSetEntry(Move.THUNDER_CAGE,1),
                        new MoveLearnSetEntry(Move.DISCHARGE,32),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,28),
                        new MoveLearnSetEntry(Move.MAGNETICCANNON,50),
                        new MoveLearnSetEntry(Move.QUICKSILVER,5),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,45),
                        new MoveLearnSetEntry(Move.IRONSPARKS,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,10),
                        new MoveLearnSetEntry(Move.GEAR_UP,12),
                        new MoveLearnSetEntry(Move.MAGNETIC_FLUX,12),
                        new MoveLearnSetEntry(Move.SCREECH,16),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"tm"),
                        new MoveLearnSetEntry(Move.BOMBARDMENT,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.CLUSTERROCKETS,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.COUPDEGRACE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DEAFEN,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FLUTTER,"tm"),
                        new MoveLearnSetEntry(Move.GAMMA_RAY,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.MAGNETICCANNON,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.MISSILESHOT,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.NECTARTAP,"tm"),
                        new MoveLearnSetEntry(Move.OVERCLOCK,"tm"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PURGE,"tm"),
                        new MoveLearnSetEntry(Move.RAINBOWSCALES,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.SWARMOVERLOAD,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAIL_GLOW,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(15)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Beedrill");

    }


}
