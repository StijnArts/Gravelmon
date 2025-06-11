package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cupidtera extends drai.dev.data.pokemon.Pokemon {
    public Cupidtera() {
        super("Cupidtera",
                Type.BUG, Type.FAIRY,
                new Stats(76,
                        45,
                        65,
                        93,
                        55,
                        98),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The pair are inseparable, fused at the abdomen. They fire 'love darts' to protect other Loameo; finding an abandoned love dart is a sign that you'll soon meet your special someone."),
                List.of(),
                List.of(   new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,6),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,12),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,18),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,24),
                        new MoveLearnSetEntry(Move.ATTRACT,30),
                        new MoveLearnSetEntry(Move.SWITCHEROO,36),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,42),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,48),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,54)              ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Cupidtera");

    }


}
