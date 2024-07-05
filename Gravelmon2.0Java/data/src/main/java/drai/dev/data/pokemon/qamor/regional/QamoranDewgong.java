package drai.dev.data.pokemon.qamor.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class QamoranDewgong extends Pokemon {

    public QamoranDewgong(String name, Aspect aspect) {
        super(name, aspect, "Psyduck",
                Type.WATER, Type.GRASS,
                new Stats(90,
                        70,
                        95,
                        70,
                        80,
                        70),
                List.of(Ability.WATER_BUBBLE), Ability.WATER_BUBBLE,
                21, 165,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                166, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("Dewgong in the Qamor region are able to alter the humidity of the air around them to remain comfortable- they prefer the air being very thick and damp. They are an endangered species due to the historical carelessness of Humans."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HEADBUTT,1),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.GROWL,3),
                        new MoveLearnSetEntry(Move.AIR_BUBBLE,7),
                        new MoveLearnSetEntry(Move.LEECH_SEED,11),
                        new MoveLearnSetEntry(Move.ENCORE,13),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,17),
                        new MoveLearnSetEntry(Move.REST,21),
                        new MoveLearnSetEntry(Move.LIFE_DEW,23),
                        new MoveLearnSetEntry(Move.SYNTHESIS,27),
                        new MoveLearnSetEntry(Move.AQUA_JET,31),
                        new MoveLearnSetEntry(Move.BRINE,33),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,37),
                        new MoveLearnSetEntry(Move.DIVE,41),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,43),
                        new MoveLearnSetEntry(Move.SOAK,47),
                        new MoveLearnSetEntry(Move.SAFEGUARD,51),
                        new MoveLearnSetEntry(Move.LEAF_STORM,53)
                ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 34, 48, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN, Biome.IS_LUSH))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setLangFileName("Dewgong");
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }
}
