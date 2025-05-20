package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Meansprout extends drai.dev.data.pokemon.Pokemon {
    public Meansprout() {
        super("Meansprout",
                Type.GRASS,
                new Stats(50,
                        45,
                        30,
                        55,
                        40,
                        80),
                List.of(Ability.INFILTRATOR), Ability.REGENERATOR,
                6, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Meansprout are laughably weak in battle, so they instead toy with foes psychologically, sprouting up and whispering behind their back or using vines to trip them up."),
                List.of(new EvolutionEntry("meanstalk", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 8, 28, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DECIDUOUS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_TAIGA, Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Meansprout");

    }


}
