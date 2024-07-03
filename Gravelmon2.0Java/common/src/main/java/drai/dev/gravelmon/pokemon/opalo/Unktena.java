package drai.dev.gravelmon.pokemon.opalo;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Unktena extends Pokemon {
    public Unktena() {
        super("Unktena",
                Type.POISON, Type.GHOST,
                new Stats(150,160,130,100,110,130),
                List.of(Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                35, 1355,
                new Stats(2,2,0,0,0,0), 3,
                -1,
                500, ExperienceGroup.SLOW,
                70,
                200, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH, 1),
                        new MoveLearnSetEntry(Move.EMBER, 1),
                        new MoveLearnSetEntry(Move.BITE, 7),
                        new MoveLearnSetEntry(Move.COIL, 13),
                        new MoveLearnSetEntry(Move.SLUDGE, 17),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE, 23),
                        new MoveLearnSetEntry(Move.HYPNOSIS, 29),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, 31),
                        new MoveLearnSetEntry(Move.POISON_JAB, 37),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE, 41),
                        new MoveLearnSetEntry(Move.GUNK_SHOT, 47),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE, 59),
                        new MoveLearnSetEntry(Move.DESTINY_BOND, 65),
                        new MoveLearnSetEntry(Move.OUTRAGE, 72),
                        new MoveLearnSetEntry(Move.HEAT_WAVE, 80)
                ),
                List.of(Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 69, 70, 0.00001, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.33, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
