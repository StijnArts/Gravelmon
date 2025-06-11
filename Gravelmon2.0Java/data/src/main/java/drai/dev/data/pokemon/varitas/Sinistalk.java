package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Sinistalk extends drai.dev.data.pokemon.Pokemon {
    public Sinistalk(Stats stats) {
        super("Sinistalk",
                Type.GRASS, Type.DARK,
                stats,
                List.of(Ability.INFILTRATOR), Ability.REGENERATOR,
                21, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Sinistalk are extremely cruel and tricky fighters, adept at dodging due to their highly flexible bodies. They delight in wrapping foes tightly in their thorny vines and watching them suffer. They oddly dislike bright sunlight and prefer to slowly creep and overtake objects in the shade or at night."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.TAUNT, 1),
                        new MoveLearnSetEntry(Move.VINE_WHIP, 6),
                        new MoveLearnSetEntry(Move.BULLET_SEED, 8),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 10),
                        new MoveLearnSetEntry(Move.SMOKESCREEN, 13),
                        new MoveLearnSetEntry(Move.PURSUIT, 18),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF, 22),
                        new MoveLearnSetEntry(Move.HORN_ATTACK, 27),
                        new MoveLearnSetEntry(Move.SPIKES, 31),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES, 31),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN, 37),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, 44),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM, 52),
                        new MoveLearnSetEntry(Move.GROWTH, 60),
                        new MoveLearnSetEntry(Move.BEAT_UP, 68),
                        new MoveLearnSetEntry(Move.TAKE_DOWN, 76),
                        new MoveLearnSetEntry(Move.MOONLIGHT, 85),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH, 92)
                ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 39, 56, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DECIDUOUS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_TAIGA, Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                List.of());
           setLangFileName("Sinistalk");

    }


}
