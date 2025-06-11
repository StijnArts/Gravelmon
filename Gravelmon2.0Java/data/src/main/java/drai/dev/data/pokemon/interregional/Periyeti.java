package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Periyeti extends drai.dev.data.pokemon.Pokemon {
    public Periyeti() {
        super("Periyeti",
                Type.ICE, Type.FIGHTING,
                new Stats(100,
                        135,
                        75,
                        60,
                        70,
                        70),
                List.of(Ability.SNOW_CLOAK), Ability.ANGER_POINT,
                8, 165,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                178, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.MONSTER),
                List.of("Periyeti live in exile as they abandon themselves from all people and Pokemon. Due to their snow-colored fur, it's nearly impossible to spot one and makes many people doubt their existence."),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,1),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,17),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,22),
                        new MoveLearnSetEntry(Move.SLAM,25),
                        new MoveLearnSetEntry(Move.AVALANCHE,29),
                        new MoveLearnSetEntry(Move.REVERSAL,33),
                        new MoveLearnSetEntry(Move.ICE_HAMMER,37),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,42),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,45),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,49)),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .isRaining()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Periyeti");

    }


}
