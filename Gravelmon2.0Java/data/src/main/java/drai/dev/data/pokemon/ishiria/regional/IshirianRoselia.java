package drai.dev.data.pokemon.ishiria.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IshirianRoselia extends drai.dev.data.pokemon.Pokemon {
    public IshirianRoselia(String name, Aspect aspect) {
        super(name, aspect, "IshirianRoselia",
                Type.FIRE,Type.ICE,
                new Stats(60,
                        30,
                        45,
                        100,
                        80,
                        85),
                List.of(Ability.FLAME_BODY), Ability.FLAME_BODY,
                3, 20,
                new Stats(0,0,0,2,0,0), 150,
                0.5,
                156, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("- EmberSTAB Fire - Growl Normal 3 Powder SnowSTAB Ice 5 Absorb Grass 8 Fire SpinSTAB Fire 12 Growth Normal 15 Icy WindSTAB Ice 17 Poison Powder Poison 17 Sleep Powder Grass 19 Mist Ice 21 IncinerateSTAB Fire 25 Mega Drain Grass 27 Freeze-DrySTAB Ice 30 Ingrain (N) Grass 35 Leech Seed (N) Grass 40 Giga Drain Grass 45 Ice BeamSTAB Ice 50 FlamethrowerSTAB Fire 55 Fire BlastSTAB Fire 60 BlizzardSTAB Ice"),
                List.of(new EvolutionEntry("ishirianroserade", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:ice_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,3),
                        new MoveLearnSetEntry(Move.ABSORB,5),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,8),
                        new MoveLearnSetEntry(Move.GROWTH,12),
                        new MoveLearnSetEntry(Move.ICY_WIND,15),
                        new MoveLearnSetEntry(Move.POISON_POWDER,17),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,17),
                        new MoveLearnSetEntry(Move.MIST,19),
                        new MoveLearnSetEntry(Move.INCINERATE,21),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,25),
                        new MoveLearnSetEntry(Move.FREEZEDRY,27),
                        new MoveLearnSetEntry(Move.INGRAIN,30),
                        new MoveLearnSetEntry(Move.LEECH_SEED,35),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,40),
                        new MoveLearnSetEntry(Move.ICE_BEAM,45),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,50),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,55),
                        new MoveLearnSetEntry(Move.BLIZZARD,60),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.CHILLY_RECEPTION,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWEET_KISS,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,"tm"),
                        new MoveLearnSetEntry(Move.MIMIC,"tm"),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.FREEZEDRY,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm")),
                List.of(Label.ISHIRIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(20).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SNOWY_FOREST)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Roselia");

    }


}
