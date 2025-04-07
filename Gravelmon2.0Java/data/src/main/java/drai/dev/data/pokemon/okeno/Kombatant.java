package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Kombatant extends drai.dev.data.pokemon.Pokemon {
    public Kombatant() {
        super("Kombatant",
                Type.BUG,
                new Stats(66,
                        88,
                        88,
                        72,
                        50,
                        56),
                List.of(Ability.BATTLE_ARMOR,Ability.UNDERLING,Ability.SHARPSHOOTER), Ability.SHARPSHOOTER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Pin MissileSTAB Bug Reversal Fighting Baton Pass Normal Bullet Seed Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.REVERSAL,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Kombatant");

    }


}
