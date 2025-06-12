package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Lightile extends drai.dev.data.pokemon.Pokemon {
    public Lightile() {
        super("Lightile",
                Type.ELECTRIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SUCTION_CUPS), Ability.STATIC,
                5, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("voltako", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.LEER,3),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,5),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,7),
                        new MoveLearnSetEntry(Move.FLASH,11),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,15),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,19),
                        new MoveLearnSetEntry(Move.SPARK,25),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,29),
                        new MoveLearnSetEntry(Move.SCREECH,37),
                        new MoveLearnSetEntry(Move.DISCHARGE,45)                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Lightile");

    }


}
