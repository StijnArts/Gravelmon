package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Meaniechu extends drai.dev.data.pokemon.Pokemon {
    public Meaniechu() {
        super("Meaniechu",
                Type.ELECTRIC, Type.FIGHTING,
                new Stats(60,
                        96,
                        55,
                        66,
                        66,
                        90),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Raised in a lab, this Pokémon has become both strong and vengeful. Its sinister nature has given it the name ‘Meaniechu’. Its orb tail can break a steel cage with ease."),
                List.of(),
                List.of(     new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,5),
                        new MoveLearnSetEntry(Move.ARM_THRUST,7),
                        new MoveLearnSetEntry(Move.ENDURE,10),
                        new MoveLearnSetEntry(Move.MUDSLAP,13),
                        new MoveLearnSetEntry(Move.SPARK,17),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,21),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,25),
                        new MoveLearnSetEntry(Move.BULK_UP,29),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,33),
                        new MoveLearnSetEntry(Move.DIG,37),
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,40),
                        new MoveLearnSetEntry(Move.AMNESIA,46),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,51),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,56)                   ),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Meaniechu");

    }


}
