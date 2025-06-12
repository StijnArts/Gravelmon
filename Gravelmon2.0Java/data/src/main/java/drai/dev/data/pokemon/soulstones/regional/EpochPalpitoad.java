package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochPalpitoad extends drai.dev.data.pokemon.Pokemon {
    public EpochPalpitoad(String name, Aspect aspect) {
        super(name, aspect, "EpochPalpitoad",
                Type.GRASS,Type.POISON,
                new Stats(75,
                        55,
                        75,
                        50,
                        69,
                        60),
                List.of(Ability.POISON_TOUCH,Ability.STORM_DRAIN), Ability.PROTEAN,
                8, 170,
                new Stats(0,0,0,0,2,0), 120,
                0.5,
                134, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("As it started to migrate further inland into swamp areas, mushrooms began to grow on its damp body and has now become inseparable from its skin."),
                List.of(new EvolutionEntry("epochseismitoad", EvolutionType.LEVEL_UP, List.of(), 
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_POWDER,10),
                        new MoveLearnSetEntry(Move.ACID,1),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,49),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,32),
                        new MoveLearnSetEntry(Move.AQUA_RING,5),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,16),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,45),
                        new MoveLearnSetEntry(Move.NATURESWRATH,53),
                        new MoveLearnSetEntry(Move.SPORE,42),
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.ALLERGY,19),
                        new MoveLearnSetEntry(Move.ACID_RAIN,57),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,1),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,35),
                        new MoveLearnSetEntry(Move.MUDSHACKLES,7),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,1),
                        new MoveLearnSetEntry(Move.INFECTION,26),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,29),
                        new MoveLearnSetEntry(Move.STUN_SPORE,10),
                        new MoveLearnSetEntry(Move.SLUDGE,13),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,22),
                        new MoveLearnSetEntry(Move.ACID_RAIN,"tm"),
                        new MoveLearnSetEntry(Move.ALLERGY,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CATAPULT,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.MOSSYPUNCH,"tm"),
                        new MoveLearnSetEntry(Move.MUDSHACKLES,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.NECTARTAP,"tm"),
                        new MoveLearnSetEntry(Move.PHOBIA,"tm"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VITALITYDRAIN,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(23)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_SPOOKY, Biome.IS_MUSHROOM)
    .setSpawnPreset(SpawnPreset.FRESHWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Palpitoad");

    }


}
