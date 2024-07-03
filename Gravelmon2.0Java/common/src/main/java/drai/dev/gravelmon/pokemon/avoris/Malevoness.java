package drai.dev.gravelmon.pokemon.avoris;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;

public class Malevoness extends drai.dev.gravelmon.pokemon.Pokemon {
    public Malevoness() {
        super("Malevoness",
                Type.DARK, Type.BUG,
                new Stats(70,
                        45,
                        78,
                        89,
                        78,
                        55),
                List.of(Ability.COMPOUND_EYES,Ability.CUTE_CHARM,Ability.TINTED_LENS), Ability.TINTED_LENS,
                14, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Attraknid's webs are coated with an irresistible sweet scent which lures and traps prey. The aroma hypnotizes their prey into becoming their helper."),
                List.of(),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 32, 54, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setLangFileName("Attraknid");

    }
}
