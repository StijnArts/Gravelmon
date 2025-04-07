package drai.dev.data.pokemon.enjin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Quivarner extends drai.dev.data.pokemon.Pokemon {
    public Quivarner() {
        super("Quivarner",
                Type.FIRE,
                new Stats(72,
                        100,
                        75,
                        95,
                        75,
                        113),
                List.of(Ability.BLAZE), Ability.SNIPER,
                15, 550,
                new Stats(0,0,0,0,0,3), 45,
                0.75,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Thanks to its advanced eyes and astounding speed, it will never miss its target when shooting a bolt of fire from its abdomen. Nothing but ashes remain when the bolt makes its mark."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BLAZEARROW,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.LIGHTUP,1),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,15),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,18),
                        new MoveLearnSetEntry(Move.AGILITY,23),
                        new MoveLearnSetEntry(Move.FEINT,27),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,32),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,36),
                        new MoveLearnSetEntry(Move.UTURN,45),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,53),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,62),
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
           setLangFileName("Quivarner");

    }


}
