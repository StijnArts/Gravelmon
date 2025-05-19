package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Taidoko extends drai.dev.data.pokemon.Pokemon {
    public Taidoko() {
        super("Taidoko",
                Type.FIGHTING,Type.NORMAL,
                new Stats(112,
                        95,
                        100,
                        80,
                        65,
                        70),
                List.of(Ability.MAGIC_BOUNCE), Ability.FINALE,
                11, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                235, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Renowned for their tempo and drumming ability. Taidoko use special sticks to hit their now hardened belly, creating louder and deeper beats than before."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ARM_THRUST,6),
                        new MoveLearnSetEntry(Move.FEINT,11),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,15),
                        new MoveLearnSetEntry(Move.ROLLING_KICK,21),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,26),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,30),
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,35),
                        new MoveLearnSetEntry(Move.BODY_SLAM,40),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,44),
                        new MoveLearnSetEntry(Move.DETECT,49),
                        new MoveLearnSetEntry(Move.SUPERPOWER,53),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,58),
                        new MoveLearnSetEntry(Move.COUNTER,62),
                        new MoveLearnSetEntry(Move.SLACK_OFF,66)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Taidoko");

    }


}
