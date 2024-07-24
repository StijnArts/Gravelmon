package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Meanstalk extends drai.dev.data.pokemon.Pokemon {
    public Meanstalk() {
        super("Meanstalk",
                Type.GRASS, Type.DARK,
                new Stats(70,
                        70,
                        50,
                        75,
                        60,
                        105),
                List.of(Ability.INFILTRATOR), Ability.REGENERATOR,
                13, 165,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They constantly do things like covertly stealing or misplacing people's belongings or using their vines to tamper with outdoor equipment. They yield beans that are extremely bitter, said to be indicative of their true inner rage and malice."),
                List.of(new EvolutionEntry("sinistalk", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:leaf_stone")),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 21, 43, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_TAIGA, Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Meanstalk");

    }


}
