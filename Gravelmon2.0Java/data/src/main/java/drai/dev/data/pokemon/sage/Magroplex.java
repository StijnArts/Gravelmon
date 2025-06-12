package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Magroplex extends Pokemon {
    public Magroplex() {
        super("Magroplex",
                Type.STEEL,
                new Stats(75, 113, 135, 42, 80, 90),
                List.of(Ability.SHED_SKIN, Ability.BATTLE_ARMOR), Ability.STURDY,
                50, 5534,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                241, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL, EggGroup.DRAGON),
                List.of("Notoriously protective of its community, Magroplex will go so far as to collapse mines approaching its nests. Its durable body allows it to dig miles underground."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THRASH,1),
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GLARE,1),
                        new MoveLearnSetEntry(Move.HARDEN,4),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,7),
                        new MoveLearnSetEntry(Move.BIDE,11),
                        new MoveLearnSetEntry(Move.WRAP,15),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,19),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,22),
                        new MoveLearnSetEntry(Move.DIG,26),
                        new MoveLearnSetEntry(Move.IRON_HEAD,31),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,36),
                        new MoveLearnSetEntry(Move.SKULL_BASH,41),
                        new MoveLearnSetEntry(Move.COIL,43),
                        new MoveLearnSetEntry(Move.CRUNCH,46),
                        new MoveLearnSetEntry(Move.IRON_TAIL,51),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,57),
                        new MoveLearnSetEntry(Move.METAL_BURST,63),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,69),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,75),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,"tm"),
                        new MoveLearnSetEntry(Move.STANDOFF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"egg"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"egg"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"egg"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"egg")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:iron_ore",90, 1,2)
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(43)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .belowY(-30)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

    }
}
