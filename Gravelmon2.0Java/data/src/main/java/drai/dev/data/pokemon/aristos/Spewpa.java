package drai.dev.data.pokemon.aristos;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Spewpa extends drai.dev.data.pokemon.Pokemon {
    public Spewpa() {
        super("Spewpa",
                Type.BUG,
                new Stats(45,
                        22,
                        60,
                        27,
                        30,
                        29),
                List.of(Ability.SHED_SKIN), Ability.FRIEND_GUARD,
                8, 165,
                new Stats(0,0,2,0,0,0), 120,
                0.5,
                75, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It lives hidden within thicket shadows. When predators attack, it quickly bristles the fur covering its body in an effort to threaten them. To defend itself, it spews powder."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.POISON_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.STUN_SPORE,"tm"),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,"tm")                        ),
                List.of(Label.ARISTOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Spewpa");

    }


}
