package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ankillosore extends Pokemon {
    public Ankillosore() {
        super("Ankillosore",
                Type.POISON, Type.GROUND,
                new Stats(100, 110, 125, 65, 65, 55),
                List.of(Ability.POISON_POINT, Ability.CONDITIONING), Ability.ROUGH_SKIN,
                17, 2553,
                new Stats(0,1,2,0,0,0), 45,
                0.5,
                234, ExperienceGroup.MEDIUM_SLOW,
                70,
                62, List.of(EggGroup.MONSTER),
                List.of("Ankillosore will let attackers strike its thick hide so it can line up a blow with its tail. If the impact doesn't fell the foe, the venom surely will."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_TAIL,1),
                        new MoveLearnSetEntry(Move.SKULL_BASH,1),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,1),
                        new MoveLearnSetEntry(Move.SLAM,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.POISON_STING,7),
                        new MoveLearnSetEntry(Move.MUDSLAP,10),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.CAUSTIC_BREATH,17),
                        new MoveLearnSetEntry(Move.MUD_BOMB,20),
                        new MoveLearnSetEntry(Move.POISON_TAIL,23),
                        new MoveLearnSetEntry(Move.BULLDOZE,27),
                        new MoveLearnSetEntry(Move.SCARY_FACE,31),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,35),
                        new MoveLearnSetEntry(Move.BRACE,40),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,44),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,48),
                        new MoveLearnSetEntry(Move.POISON_JAB,53),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,57),
                        new MoveLearnSetEntry(Move.CURSE,61),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,66),
                        new MoveLearnSetEntry(Move.FISSURE,72),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,"tm"),
                        new MoveLearnSetEntry(Move.STANDOFF,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:leather",90, 1,2)
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(37)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

    }
}
