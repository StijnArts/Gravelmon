package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Stimanic extends drai.dev.data.pokemon.Pokemon {
    public Stimanic() {
        super("Stimanic",
                Type.GRASS, Type.ELECTRIC,
                new Stats(73,
                        75,
                        80,
                        104,
                        90,
                        77),
                List.of(Ability.STATIC), Ability.ELECTRIC_SURGE,
                12, 292,
                new Stats(0,0,0,3,0,0), 45,
                1.0,
                221, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.HUMAN_LIKE),
                List.of("A sting from a Stimanic can be life threatening due to intense toxins that paralyze the body. They have powerful electric charges that have been known to disrupt nearby outlets. It is common for Stimanic to cause cities to lose power if too many are close, they stand close to power lines and feed on electricity to make themselves stronger."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.CHLOROBLAST,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,4),
                        new MoveLearnSetEntry(Move.STUN_SPORE,6),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,8),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,21),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,29),
                        new MoveLearnSetEntry(Move.DISCHARGE,34),
                        new MoveLearnSetEntry(Move.SEED_BOMB,38),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,46),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,50)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Stimanic");

    }


}
