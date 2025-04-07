package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Puffemperor extends drai.dev.data.pokemon.Pokemon {
    public Puffemperor() {
        super("Puffemperor",
                Type.FLYING, Type.ICE,
                new Stats(80,
                        64,
                        86,
                        90,
                        100,
                        70),
                List.of(Ability.BIG_PECKS), Ability.ICE_BODY,
                18, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                221, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("- Quash Dark - Haze Ice - Cold Snap Ice - Pound Normal - Powder SnowSTAB Ice - Icy WindSTAB Ice - Frost BreathSTAB Ice - Ice BeamSTAB Ice - BlizzardSTAB Ice - Feather Dance Flying - PeckSTAB Flying - PluckSTAB Flying - Air CutterSTAB Flying - Air SlashSTAB Flying - Royal Decree Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HAZE,1),
                        new MoveLearnSetEntry(Move.AIR_SLASH,1),
                        new MoveLearnSetEntry(Move.ROYALDECREE,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,1),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.FROST_BREATH,1),
                        new MoveLearnSetEntry(Move.PLUCK,1),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,1),
                        new MoveLearnSetEntry(Move.COLDSNAP,1),
                        new MoveLearnSetEntry(Move.QUASH,1),
                        new MoveLearnSetEntry(Move.ICE_BEAM,1),
                        new MoveLearnSetEntry(Move.BLIZZARD,1),
                        new MoveLearnSetEntry(Move.TRIPLE_AXEL,"tm"),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(30).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SNOWY).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Puffemperor");

    }


}
