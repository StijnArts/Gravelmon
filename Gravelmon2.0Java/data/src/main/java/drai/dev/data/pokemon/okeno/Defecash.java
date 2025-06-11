package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Defecash extends drai.dev.data.pokemon.Pokemon {
    public Defecash() {
        super("Defecash",
                Type.GRASS, Type.DRAGON,
                new Stats(90,
                        83,
                        80,
                        83,
                        80,
                        37),
                List.of(Ability.STORM_DRAIN,Ability.OBLIVIOUS,Ability.STRONG_JAW), Ability.STRONG_JAW,
                12, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Flytrap FangSTAB Grass - Vortex Drain Water - Whirlpool Water - TwisterSTAB Dragon - Dragon BreathSTAB Dragon - OutrageSTAB Dragon - Nature's Call Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NATURESCALL,1),
                        new MoveLearnSetEntry(Move.FLYTRAP_FANG,1),
                        new MoveLearnSetEntry(Move.VORTEX_DRAIN,1),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,1),
                        new MoveLearnSetEntry(Move.OUTRAGE,1),
                        new MoveLearnSetEntry(Move.NATURES_CALL,1),

                        new MoveLearnSetEntry(Move.DRAGONFANG,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Defecash");

    }


}
