package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Thikachoo extends drai.dev.data.pokemon.Pokemon {
    public Thikachoo(Stats stats) {
        super("Thikachoo",
                Type.ICE, Type.ELECTRIC,
                stats,
                List.of(Ability.SNOWPLOW), Ability.THICK_FAT,
                6, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,4),
                        new MoveLearnSetEntry(Move.SCREECH,10),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,15),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,22),
                        new MoveLearnSetEntry(Move.ROAR,26),
                        new MoveLearnSetEntry(Move.ICE_BEAM,32),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,37),
                        new MoveLearnSetEntry(Move.MINIMIZE,41),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,45),
                        new MoveLearnSetEntry(Move.BLIZZARD,50),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,53),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,58),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,64)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Thikachoo");

    }


}
