package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pharumm extends drai.dev.data.pokemon.Pokemon {
    public Pharumm() {
        super("Pharumm",
                Type.GHOST, Type.GROUND,
                new Stats(60,
                        90,
                        65,
                        78,
                        89,
                        50),
                List.of(Ability.MUMMY), Ability.MUMMY,
                8, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("caconie", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"39")))),
                List.of(         new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,8),
                        new MoveLearnSetEntry(Move.BONE_CLUB,13),
                        new MoveLearnSetEntry(Move.DETECT,17),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,20),
                        new MoveLearnSetEntry(Move.CURSE,24),
                        new MoveLearnSetEntry(Move.BONE_RUSH,27),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,31),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,35),
                        new MoveLearnSetEntry(Move.FLING,39),
                        new MoveLearnSetEntry(Move.BONEMERANG,43),
                        new MoveLearnSetEntry(Move.SHADOW_BONE,47),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,51)               ),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(24)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .atNight()
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.DESERT_PYRAMID)
    .build(), List.of());
	
           setLangFileName("Pharumm");

    }


}
