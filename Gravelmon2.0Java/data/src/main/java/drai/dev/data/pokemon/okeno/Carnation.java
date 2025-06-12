package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Carnation extends drai.dev.data.pokemon.Pokemon {
    public Carnation() {
        super("Carnation",
                Type.GRASS, Type.FIGHTING,
                new Stats(77,
                        94,
                        110,
                        71,
                        81,
                        97),
                List.of(Ability.ANGER_POINT,Ability.FLOWER_GIFT,Ability.CHLOROPHYLL), Ability.CHLOROPHYLL,
                16, 165,
                new Stats(0,1,0,0,0,1), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.HUMAN_LIKE),
                List.of("- Follow Me Normal - Rage Normal 3 Heal Block Psychic 5 Razor LeafSTAB Grass 8 Grass KnotSTAB Grass 11 Vital ThrowSTAB Fighting 15 Helping Hand Normal 19 Seismic TossSTAB Fighting 24 Magical LeafSTAB Grass 29 Tearful Look Normal 32 Storm ThrowSTAB Fighting 35 Grassy Terrain Grass 39 CounterSTAB Fighting 43 Flower Shield Fairy 50 Petal BlizzardSTAB Grass 56 Rage Powder Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RAGE,1),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,3),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,5),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,8),
                        new MoveLearnSetEntry(Move.VITAL_THROW,11),
                        new MoveLearnSetEntry(Move.HELPING_HAND,15),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,19),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,24),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,29),
                        new MoveLearnSetEntry(Move.STORM_THROW,32),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,35),
                        new MoveLearnSetEntry(Move.COUNTER,39),
                        new MoveLearnSetEntry(Move.FLOWER_SHIELD,43),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,50),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,56),
                        new MoveLearnSetEntry(Move.LEAF_STORM,"tm"),
                        new MoveLearnSetEntry(Move.BREAKDOWN,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm")                        ),
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
	
           setLangFileName("Carnation");

    }


}
