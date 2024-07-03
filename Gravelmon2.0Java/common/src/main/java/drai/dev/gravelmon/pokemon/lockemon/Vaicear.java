package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Vaicear extends Pokemon {
    public Vaicear() {
        super("Vaicear",
                Type.ICE, Type.FIRE,
                new Stats(85,
                        133,
                        70,
                        103,
                        35,
                        104),
                List.of(Ability.FRIGID_BLAZE), Ability.SLUSH_RUSH,
                15, 815,
                new Stats(0,2,0,0,0,0), 200,
                0.5,
                177, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("With a new found homeostasis, Vaicear have mastered the balance between fire and ice. This apex Pokemon once used their heated claws to traverse through the frigid arctic."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.SMOG,4),
                        new MoveLearnSetEntry(Move.TAUNT,7),
                        new MoveLearnSetEntry(Move.ASSURANCE,10),
                        new MoveLearnSetEntry(Move.ICE_FANG,13),
                        new MoveLearnSetEntry(Move.FIRE_FANG,17),
                        new MoveLearnSetEntry(Move.HEADBUTT,21),
                        new MoveLearnSetEntry(Move.SCREECH,25),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,28),
                        new MoveLearnSetEntry(Move.SWAGGER,32),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,36),
                        new MoveLearnSetEntry(Move.UPROAR,41),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,50),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 40, 57, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
