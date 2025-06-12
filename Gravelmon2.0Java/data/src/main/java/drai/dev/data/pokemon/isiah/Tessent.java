package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Tessent extends drai.dev.data.pokemon.Pokemon {
    public Tessent() {
        super("Tessent",
                Type.FIGHTING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(new EvolutionEntry("tessensei", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.CUT,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,4),
                        new MoveLearnSetEntry(Move.SLASH,9),
                        new MoveLearnSetEntry(Move.AIR_SLASH,12),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,17),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,28),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,31),
                        new MoveLearnSetEntry(Move.DRILL_PECK,34),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,38),
                        new MoveLearnSetEntry(Move.WICKED_LASH,44),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,49)
                ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BAMBOO)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Tessent");

    }


}
