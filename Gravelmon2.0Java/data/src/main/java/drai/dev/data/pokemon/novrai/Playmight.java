package drai.dev.data.pokemon.novrai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Playmight extends drai.dev.data.pokemon.Pokemon {
    public Playmight() {
        super("Playmight",
                Type.FIGHTING, Type.ROCK,
                new Stats(77,
                        77,
                        93,
                        25,
                        49,
                        25),
                List.of(Ability.STALWART,Ability.MOLD_BREAKER,Ability.SKILL_LINK), Ability.SKILL_LINK,
                8, 165,
                new Stats(0,0,1,0,0,0), 180,
                0.5,
                69, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.HUMAN_LIKE),
                List.of("It brutally smashes rocks into smaller, geometric pieces, then uses them to assemble complex structures. Each part of its body is made of a different mineral."),
                List.of(new EvolutionEntry("khanstruct", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.MUD_SPORT,1),
                        new MoveLearnSetEntry(Move.ARM_THRUST,5),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,7),
                        new MoveLearnSetEntry(Move.MUDSLAP,11),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,14),
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,16),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,20),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,22),
                        new MoveLearnSetEntry(Move.SELFREPAIR,25),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,27),
                        new MoveLearnSetEntry(Move.BLOCK,29),
                        new MoveLearnSetEntry(Move.BODY_PRESS,34),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,38),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,40),
                        new MoveLearnSetEntry(Move.STONE_EDGE,46),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,49),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,53),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.CUDDLE,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.LOVE_LARIAT,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,"tm"),
                        new MoveLearnSetEntry(Move.BEAT_UP,"tm"),
                        new MoveLearnSetEntry(Move.THRASH,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_THROW,"tm"),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm")                        ),
                List.of(Label.NOVRAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Playmight");

    }


}
