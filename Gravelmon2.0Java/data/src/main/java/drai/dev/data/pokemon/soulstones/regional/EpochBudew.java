package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochBudew extends drai.dev.data.pokemon.Pokemon {
    public EpochBudew(String name, Aspect aspect) {
        super(name, aspect, "EpochBudew",
                Type.GROUND,Type.FAIRY,
                new Stats(40,
                        50,
                        35,
                        55,
                        30,
                        70),
                List.of(Ability.SHARPNESS,Ability.JUSTIFIED), Ability.DAZZLING,
                2, 12,
                new Stats(0,1,0,0,0,0), 255,
                0.0,
                56, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("This Pokémon is reluctant to fight, and when confronted, it would rather run away quickly than get its outfit dirty."),
                List.of(new EvolutionEntry("epochroselia", EvolutionType.LEVEL_UP, List.of(),
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.SWEETNOTHINGS,25),
                        new MoveLearnSetEntry(Move.LOVEBURST,40),
                        new MoveLearnSetEntry(Move.THOUSAND_WAVES,65),
                        new MoveLearnSetEntry(Move.LOVELY_KISS,4),
                        new MoveLearnSetEntry(Move.WOOINGHUG,12),
                        new MoveLearnSetEntry(Move.EXCALIBUR,50),
                        new MoveLearnSetEntry(Move.COVET,7),
                        new MoveLearnSetEntry(Move.GOLDRUSH,30),
                        new MoveLearnSetEntry(Move.SPIRIT_BREAK,20),
                        new MoveLearnSetEntry(Move.SANDJET,1),
                        new MoveLearnSetEntry(Move.ODETOJOY,55),
                        new MoveLearnSetEntry(Move.LUMINOUSBLADE,45),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,60),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,35),
                        new MoveLearnSetEntry(Move.ZEAL,15),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"tm"),
                        new MoveLearnSetEntry(Move.BATTLEOFWITS,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.COUPDEGRACE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DIVINEPUNISHMENT,"tm"),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,"tm"),
                        new MoveLearnSetEntry(Move.DUNEBLAST,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.EXECUTION,"tm"),
                        new MoveLearnSetEntry(Move.FABLEDRUSH,"tm"),
                        new MoveLearnSetEntry(Move.FAIRYTALE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FANTASYSEAL,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FORTISSIMO,"tm"),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,"tm"),
                        new MoveLearnSetEntry(Move.GENESIS,"tm"),
                        new MoveLearnSetEntry(Move.GENTLECHIMES,"tm"),
                        new MoveLearnSetEntry(Move.GEOMANCY,"tm"),
                        new MoveLearnSetEntry(Move.GLISTEN,"tm"),
                        new MoveLearnSetEntry(Move.GOLDRUSH,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LIGHTSABER,"tm"),
                        new MoveLearnSetEntry(Move.MUDSHACKLES,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICPULSE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.ODETOJOY,"tm"),
                        new MoveLearnSetEntry(Move.PAY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PURGE,"tm"),
                        new MoveLearnSetEntry(Move.QUICKSAND,"tm"),
                        new MoveLearnSetEntry(Move.RAYOFLIGHT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SIRENSSONG,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWEEPINGWIND,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TITANIASLAW,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VALKYRIECHARIOT,"tm"),
                        new MoveLearnSetEntry(Move.WAIL,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.GENTLECHIMES,"egg"),
                        new MoveLearnSetEntry(Move.MORNING_SUN,"egg"),
                        new MoveLearnSetEntry(Move.RAYOFLIGHT,"egg"),
                        new MoveLearnSetEntry(Move.CLEANSE,"egg"),
                        new MoveLearnSetEntry(Move.SWEET_KISS,"egg"),
                        new MoveLearnSetEntry(Move.ATTRACT,"egg"),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,"egg"),
                        new MoveLearnSetEntry(Move.EDGESTRIKE,"egg"),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(23)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FLORAL, Biome.IS_MAGICAL)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Budew");

    }


}
