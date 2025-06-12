package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Voltako extends drai.dev.data.pokemon.Pokemon {
    public Voltako() {
        super("Voltako",
                Type.ELECTRIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SUCTION_CUPS), Ability.STATIC,
                12, 165,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("raigeko", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:thunder_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,6),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,8),
                        new MoveLearnSetEntry(Move.FLASH,12),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,16),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,20),
                        new MoveLearnSetEntry(Move.BODY_SLAM,24),
                        new MoveLearnSetEntry(Move.SPARK,28),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,32),
                        new MoveLearnSetEntry(Move.SCREECH,38),
                        new MoveLearnSetEntry(Move.AMNESIA,44),
                        new MoveLearnSetEntry(Move.DISCHARGE,50),
                        new MoveLearnSetEntry(Move.THUNDER,56)                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(21)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Voltako");

    }


}
