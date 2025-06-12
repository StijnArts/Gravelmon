package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochTrumbeak extends drai.dev.data.pokemon.Pokemon {
    public EpochTrumbeak(String name, Aspect aspect) {
        super(name, aspect, "EpochTrumbeak",
                Type.GRASS,Type.FLYING,
                new Stats(45,
                        85,
                        50,
                        85,
                        40,
                        50),
                List.of(Ability.FLOWER_VEIL,Ability.SYMBIOSIS), Ability.SKILL_LINK,
                6, 148,
                new Stats(0,1,0,0,0,0), 120,
                0.5,
                124, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("A vile nuisance, these Pokemon like to pick on unsuspecting tourists by carpet bombing their vehicles while they are relaxing on the beach."),
                List.of(new EvolutionEntry("epochtoucannon", EvolutionType.LEVEL_UP, List.of(),
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.FORTISSIMO,41),
                        new MoveLearnSetEntry(Move.MEGAPHONE,9),
                        new MoveLearnSetEntry(Move.PLUCK,13),
                        new MoveLearnSetEntry(Move.BULLET_SEED,26),
                        new MoveLearnSetEntry(Move.LEAFAGE,1),
                        new MoveLearnSetEntry(Move.FLOCK,30),
                        new MoveLearnSetEntry(Move.BATTLE_CRY,16),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,13),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,5),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,20),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,23),
                        new MoveLearnSetEntry(Move.SCREECH,34),
                        new MoveLearnSetEntry(Move.JUNGLE_HEALING,38),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,45),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,49),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FLOCK,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FORTISSIMO,"tm"),
                        new MoveLearnSetEntry(Move.GENESIS,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HURRICANE,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.NATURESWRATH,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWEEPINGWIND,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TORNADO,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TURBULENCE,"tm"),
                        new MoveLearnSetEntry(Move.VENDETTA,"tm"),
                        new MoveLearnSetEntry(Move.VITALITYDRAIN,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(18)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FOLIAGE)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Trumbeak");

    }


}
