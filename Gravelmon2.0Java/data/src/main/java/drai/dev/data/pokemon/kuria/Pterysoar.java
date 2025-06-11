package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pterysoar extends drai.dev.data.pokemon.Pokemon {
    public Pterysoar() {
        super("Pterysoar",
                Type.ROCK, Type.FLYING,
                new Stats(80,
                        95,
                        55,
                        70,
                        55,
                        85),
                List.of(Ability.STRONG_JAW,Ability.SAND_FORCE), Ability.UNBURDEN,
                10, 226,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                144, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.FLYING),
                List.of(""),
                List.of(new EvolutionEntry("hoatzan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"44")))),
                List.of(            new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,6),
                        new MoveLearnSetEntry(Move.WING_ATTACK,10),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,17),
                        new MoveLearnSetEntry(Move.BLOCK,20),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,25),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,33),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,39),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,46),
                        new MoveLearnSetEntry(Move.SKY_DROP,52),
                        new MoveLearnSetEntry(Move.STONE_EDGE,61)             ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(33)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Pterysoar");

    }


}
