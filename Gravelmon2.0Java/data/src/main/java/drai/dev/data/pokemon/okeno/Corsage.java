package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Corsage extends drai.dev.data.pokemon.Pokemon {
    public Corsage() {
        super("Rose",
                Type.GRASS, Type.FAIRY,
                new Stats(77,
                        71,
                        120,
                        84,
                        97,
                        81),
                List.of(Ability.TANTRUM,Ability.FLOWER_VEIL,Ability.CHLOROPHYLL), Ability.CHLOROPHYLL,
                12, 165,
                new Stats(0,0,2,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HAPPYSLAP,1),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,3),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,5),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,8),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,11),
                        new MoveLearnSetEntry(Move.HELPING_HAND,15),
                        new MoveLearnSetEntry(Move.CUDDLE,19),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,24),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,29),
                        new MoveLearnSetEntry(Move.SMELLING_SALTS,32),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,35),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,39),
                        new MoveLearnSetEntry(Move.FLOWER_SHIELD,43),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,50),
                        new MoveLearnSetEntry(Move.FLORAL_HEALING,56),
                        new MoveLearnSetEntry(Move.LEAF_STORM,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FLORAL)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Rose");

    }


}
