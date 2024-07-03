package drai.dev.gravelmon.pokemon.flux;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Vilucard extends Pokemon {
    public Vilucard() {
        super("Vilucard",
                Type.DARK, Type.POISON,
                new Stats(70,
                        105,
                        60,
                        101,
                        60,
                        99),
                List.of(Ability.BLOODLUST, Ability.INFILTRATOR), Ability.POISON_TOUCH,
                16, 643,
                new Stats(0,1,0,0,0,0), 90,
                0.5,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.HUMAN_LIKE),
                List.of("It constantly plots dastardly schemes to spread chaos and fear. However, its plans are always foiled by Herolune."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAIN_LIFE,1),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,1),
                        new MoveLearnSetEntry(Move.PAYBACK,1),
                        new MoveLearnSetEntry(Move.POISON_FANG,1),
                        new MoveLearnSetEntry(Move.ECHOLOCATE,1),
                        new MoveLearnSetEntry(Move.THIEF,1),
                        new MoveLearnSetEntry(Move.SWAGGER,1),
                        new MoveLearnSetEntry(Move.VENOSHOCK,1),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,1),
                        new MoveLearnSetEntry(Move.CROSS_POISON,1),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,1),
                        new MoveLearnSetEntry(Move.TOXIC,1),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,1),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ACID,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"egg"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"egg"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"egg"),
                        new MoveLearnSetEntry(Move.TORMENT,"egg"),
                        new MoveLearnSetEntry(Move.FEINT,"egg"),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,"egg")
                ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 32, 56, 0.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST, Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
    }
}
