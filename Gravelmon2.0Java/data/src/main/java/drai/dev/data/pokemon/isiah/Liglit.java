package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Liglit extends drai.dev.data.pokemon.Pokemon {
    public Liglit() {
        super("Liglit",
                Type.ELECTRIC,
                new Stats(65,
                        88,
                        55,
                        55,
                        44,
                        88),
                List.of(Ability.VITAL_SPIRIT), Ability.STATIC,
                13, 165,
                new Stats(0,0,0,0,0,0), 200,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NUZZLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,7),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,10),
                        new MoveLearnSetEntry(Move.UPROAR,13),
                        new MoveLearnSetEntry(Move.SPARK,16),
                        new MoveLearnSetEntry(Move.TAUNT,19),
                        new MoveLearnSetEntry(Move.SWIFT,22),
                        new MoveLearnSetEntry(Move.AGILITY,26),
                        new MoveLearnSetEntry(Move.SLAM,30),
                        new MoveLearnSetEntry(Move.TICKLE,34),
                        new MoveLearnSetEntry(Move.CHARGE,38),
                        new MoveLearnSetEntry(Move.BOUNCE,42),
                        new MoveLearnSetEntry(Move.DISCHARGE,46),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,50)                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Liglit");

    }


}
