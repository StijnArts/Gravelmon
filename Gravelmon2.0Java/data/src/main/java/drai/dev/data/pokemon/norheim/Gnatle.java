package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Gnatle extends drai.dev.data.pokemon.Pokemon {
    public Gnatle() {
        super("Gnatle",
                Type.GRASS, Type.ROCK,
                new Stats(38,
                        45,
                        70,
                        45,
                        65,
                        45),
                List.of(Ability.OVERGROW,Ability.DAMP,Ability.ROCK_HEAD), Ability.ROCK_HEAD,
                5, 165,
                new Stats(0,0,1,0,1,0), 45,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG,EggGroup.WATER_3),
                List.of("Gnatle are incredibly hard to notice, making them highly sought after among collectors. When facing down they look like any kind of rock found in the woods. When happy, they scatter and jump around cheerfully."),
                List.of(new EvolutionEntry("growel", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,1),
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,1),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,1)),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OLD_GROWTH_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Gnatle");

    }


}
