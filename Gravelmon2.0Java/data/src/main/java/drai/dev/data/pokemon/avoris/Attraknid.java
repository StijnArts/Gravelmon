package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Attraknid extends drai.dev.data.pokemon.Pokemon {
    public Attraknid() {
        super("Attraknid",
                Type.DARK, Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.COMPOUND_EYES,Ability.CUTE_CHARM,Ability.TINTED_LENS), Ability.TINTED_LENS,
                6, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Attraknid's webs are coated with an irresistible sweet scent which lures and traps prey. The aroma hypnotizes their prey into becoming their helper."),
                List.of(new EvolutionEntry("malevoness", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME, "\"night\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.BATON_PASS,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,6),
                        new MoveLearnSetEntry(Move.DARK_CUTTER,10),
                        new MoveLearnSetEntry(Move.DETECT,15),
                        new MoveLearnSetEntry(Move.PURSUIT,19),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,24),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,28),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,33),
                        new MoveLearnSetEntry(Move.AGILITY,37),
                        new MoveLearnSetEntry(Move.SLASH,42),
                        new MoveLearnSetEntry(Move.XSCISSOR,46),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,51),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,55),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,60)
                ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Attraknid");

    }


}
