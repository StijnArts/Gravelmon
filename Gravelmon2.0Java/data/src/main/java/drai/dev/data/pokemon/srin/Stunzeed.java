package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Stunzeed extends drai.dev.data.pokemon.Pokemon {
    public Stunzeed(Stats stats) {
        super("Stunzeed",
                Type.ELECTRIC,Type.GRASS,
                stats,
                List.of(Ability.LEVITATE,Ability.ELECTRIC_SURGE), Ability.GRASSY_SURGE,
                8, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,1),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,1),
                        new MoveLearnSetEntry(Move.TWIN_BEAM,1),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,1),
                        new MoveLearnSetEntry(Move.SEEDSHOT,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.TOPSYTURVY,1),
                        new MoveLearnSetEntry(Move.SEED_BOMB,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,1),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,1),
                        new MoveLearnSetEntry(Move.DOUBLE_SHOCK,1),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.GRAVITY,1)                        ),
                List.of(Label.SORIN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CHERRY_GROVE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Stunzeed");

    }


}
