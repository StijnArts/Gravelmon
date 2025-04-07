package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Armorillo extends drai.dev.data.pokemon.Pokemon {
    public Armorillo() {
        super("Armorillo",
                Type.STEEL,Type.GROUND,
                new Stats(105,
                        85,
                        120,
                        60,
                        60,
                        65),
                List.of(Ability.BATTLE_ARMOR), Ability.WEAK_ARMOR,
                15, 876,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                173, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Roadent who find extra protection will evolve into this mon, their hide transforming into a strong metal coating. Armorillo have a large buildup of this coating on one arm, which they slash against boulders to sharpen."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,5),
                        new MoveLearnSetEntry(Move.METAL_CLAW,9),
                        new MoveLearnSetEntry(Move.ROLLOUT,13),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,17),
                        new MoveLearnSetEntry(Move.BULLDOZE,22),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,27),
                        new MoveLearnSetEntry(Move.IRON_HEAD,33),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,38),
                        new MoveLearnSetEntry(Move.GYRO_BALL,42),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,47),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,54),
                        new MoveLearnSetEntry(Move.FISSURE,61)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Armorillo");

    }


}
