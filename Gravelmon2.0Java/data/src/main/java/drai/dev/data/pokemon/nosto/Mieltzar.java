package drai.dev.data.pokemon.nosto;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Mieltzar extends drai.dev.data.pokemon.Pokemon {
    public Mieltzar(Stats stats) {
        super("Mieltzar",
                Type.BUG,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.TACKLE,4),
                        new MoveLearnSetEntry(Move.SUPERSONIC,7),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,10),
                        new MoveLearnSetEntry(Move.BUG_BITE,13),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,16),
                        new MoveLearnSetEntry(Move.WEB_BALL,19),
                        new MoveLearnSetEntry(Move.WORK_UP,22),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,25),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,29),
                        new MoveLearnSetEntry(Move.DECORATE,36),
                        new MoveLearnSetEntry(Move.DEFEND_ORDER,36),
                        new MoveLearnSetEntry(Move.ATTACK_ORDER,36),
                        new MoveLearnSetEntry(Move.HEAL_ORDER,36),
                        new MoveLearnSetEntry(Move.FELL_STINGER,40)

                ),
                List.of(Label.NOSTO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(25)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST, Biome.IS_PLAINS)
    .setSpawnPreset(SpawnPreset.HONEY_TREE)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Mieltzar");

    }


}
