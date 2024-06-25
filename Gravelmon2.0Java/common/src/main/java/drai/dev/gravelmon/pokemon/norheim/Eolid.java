package drai.dev.gravelmon.pokemon.norheim;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Eolid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Eolid() {
        super("Eolid",
                Type.ROCK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SOUNDPROOF,Ability.SAND_FORCE), Ability.REGENERATOR,
                5, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("Eosoli", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"23")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,9),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,13),
                        new MoveLearnSetEntry(Move.UPROAR,16),
                        new MoveLearnSetEntry(Move.SCREECH,19),
                        new MoveLearnSetEntry(Move.PURSUIT,21),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,25),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,29),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,34),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,39),
                        new MoveLearnSetEntry(Move.RETALIATE,43),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,48),
                        new MoveLearnSetEntry(Move.STONE_EDGE,54)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 4.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Eolid");

    }


}
