package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Elekto extends drai.dev.data.pokemon.Pokemon {
    public Elekto() {
        super("Elekto",
                Type.ROCK, Type.ELECTRIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.STATIC), Ability.STATIC,
                15, 165,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of(""),
                List.of(new EvolutionEntry("ambrachios", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,7),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,13),
                        new MoveLearnSetEntry(Move.ROCK_THROW,19),
                        new MoveLearnSetEntry(Move.ENDURE,25),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,31),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,37),
                        new MoveLearnSetEntry(Move.ROAR,43),
                        new MoveLearnSetEntry(Move.POWER_GEM,49),
                        new MoveLearnSetEntry(Move.SCREECH,55),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,61)                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OLD_GROWTH_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Elekto");

    }


}
