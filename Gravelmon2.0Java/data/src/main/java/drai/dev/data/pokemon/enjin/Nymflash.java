package drai.dev.data.pokemon.enjin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nymflash extends drai.dev.data.pokemon.Pokemon {
    public Nymflash() {
        super("Nymflash",
                Type.FIRE,
                new Stats(56,
                        75,
                        59,
                        70,
                        59,
                        86),
                List.of(Ability.BLAZE), Ability.SNIPER,
                7, 300,
                new Stats(0,0,0,0,0,2), 45,
                0.75,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Its eyes allow it to detect predators from far away, allowing it to make a quick getaway with firepowered jumps. It can also shoot balls of fire from its abdomen to hinder potential pursuers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.LIGHTUP,12),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,15),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,18),
                        new MoveLearnSetEntry(Move.AGILITY,23),
                        new MoveLearnSetEntry(Move.FEINT,27),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,32),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,36),
                        new MoveLearnSetEntry(Move.UTURN,43),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,50),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,57),
                        new MoveLearnSetEntry(Move.FORESIGHT,"tm"),
                        new MoveLearnSetEntry(Move.MORNING_SUN,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,"tm"),
                        new MoveLearnSetEntry(Move.REVERSAL,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.ENERGYLOOP,"tm")                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Nymflash");

    }


}
