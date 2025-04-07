package drai.dev.data.pokemon.ishiria.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IshirianRoserade extends drai.dev.data.pokemon.Pokemon {
    public IshirianRoserade(String name, Aspect aspect) {
        super(name, aspect, "IshirianRoserade",
                Type.FIRE,Type.ICE,
                new Stats(70,
                        45,
                        55,
                        130,
                        105,
                        110),
                List.of(Ability.FLAME_BODY), Ability.FLAME_BODY,
                9, 145,
                new Stats(0,0,0,3,0,0), 75,
                0.5,
                242, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Evo Secret Sword (N) Fighting Evo Sacred Sword Fighting - EmberSTAB Fire - Growl Normal - Powder SnowSTAB Ice - Absorb Grass 5 Fire SpinSTAB Fire 10 Growth Normal 15 Icy WindSTAB Ice 17 Poison Powder Poison 17 Sleep Powder Grass 21 Mist Ice 25 IncinerateSTAB Fire 28 Freeze-DrySTAB Ice 31 Ingrain (N) Grass 36 Leech Seed (N) Grass 48 Ice BeamSTAB Ice 52 FlamethrowerSTAB Fire 59 Fire BlastSTAB Fire 65 BlizzardSTAB Ice"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.SECRET_SWORD,1),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,5),
                        new MoveLearnSetEntry(Move.GROWTH,10),
                        new MoveLearnSetEntry(Move.ICY_WIND,15),
                        new MoveLearnSetEntry(Move.POISON_POWDER,17),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,17),
                        new MoveLearnSetEntry(Move.MIST,21),
                        new MoveLearnSetEntry(Move.INCINERATE,25),
                        new MoveLearnSetEntry(Move.FREEZEDRY,28),
                        new MoveLearnSetEntry(Move.INGRAIN,31),
                        new MoveLearnSetEntry(Move.LEECH_SEED,36),
                        new MoveLearnSetEntry(Move.ICE_BEAM,48),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,52),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,59),
                        new MoveLearnSetEntry(Move.BLIZZARD,65),
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
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.FREEZEDRY,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm")),
                List.of(Label.ISHIRIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
                        .setMinLevel(38).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SNOWY_FOREST)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Roserade");

    }


}
