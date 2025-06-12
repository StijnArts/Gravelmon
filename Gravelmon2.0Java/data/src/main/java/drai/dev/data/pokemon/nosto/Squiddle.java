package drai.dev.data.pokemon.nosto;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Squiddle extends drai.dev.data.pokemon.Pokemon {
    public Squiddle() {
        super("Squiddle",
                Type.FIRE,
                new Stats(52,
                        32,
                        53,
                        67,
                        54,
                        52),
                List.of(Ability.BLAZE), Ability.LIQUID_OOZE,
                5, 165,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of(""),
                List.of(new EvolutionEntry("squignite", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.SMOG,11),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,13),
                        new MoveLearnSetEntry(Move.FLAME_BURST,16),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,21),
                        new MoveLearnSetEntry(Move.TOXIC,26),
                        new MoveLearnSetEntry(Move.CORROSIVE_GAS,32),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,35),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,39),
                        new MoveLearnSetEntry(Move.WILLOWISP,42),
                        new MoveLearnSetEntry(Move.DARK_PULSE,47)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE, Biome.IS_VOLCANIC)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Squiddle");

    }


}
