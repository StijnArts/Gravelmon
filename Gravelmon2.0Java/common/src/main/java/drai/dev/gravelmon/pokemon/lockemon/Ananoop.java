package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Ananoop extends Pokemon {
    public Ananoop() {
        super("Ananoop",
                Type.POISON,
                new Stats(100,
                        55,
                        60,
                        90,
                        70,
                        50),
                List.of(Ability.DRY_SKIN, Ability.LIQUID_OOZE), Ability.GOOEY,
                8, 155,
                new Stats(1,0,0,0,0,0), 90,
                0.5,
                160, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS, EggGroup.GRASS),
                List.of("Ananoop are commonly mistaken for ripe fruit by tourists, though if touched have a gooey toxin so powerful it could cause temporary paralysis lasting several hours."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.YAWN,5),
                        new MoveLearnSetEntry(Move.POISON_GAS,8),
                        new MoveLearnSetEntry(Move.SLUDGE,10),
                        new MoveLearnSetEntry(Move.AMNESIA,12),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,17),
                        new MoveLearnSetEntry(Move.ENCORE,20),
                        new MoveLearnSetEntry(Move.TOXIC,25),
                        new MoveLearnSetEntry(Move.SPIT_UP,28),
                        new MoveLearnSetEntry(Move.STOCKPILE,28),
                        new MoveLearnSetEntry(Move.SWALLOW,28),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,33),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,36),
                        new MoveLearnSetEntry(Move.BELCH,41),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,44),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,49),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"egg"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,"egg"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"egg"),
                        new MoveLearnSetEntry(Move.SMOG,"egg"),
                        new MoveLearnSetEntry(Move.STUFF_CHEEKS,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 24, 54, 0.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
