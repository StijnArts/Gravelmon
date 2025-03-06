package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanBraixen extends drai.dev.data.pokemon.Pokemon {
    public VesitanBraixen(String name, Aspect aspect) {
        super(name, aspect, "VesitanBraixen",
                Type.GRASS,Type.GHOST,
                new Stats(59,
                        90,
                        73,
                        75,
                        57,
                        65),
                List.of(Ability.OVERGROW,Ability.CONTRARY), null,
                10, 145,
                new Stats(0,0,0,0,2,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("In seinem Schweif steckt ein Knochen, den es bei Bedarf zum Kampf einsetzt, um mehr Knochen zu sammeln."),
                List.of(new EvolutionEntry("delphox vesitan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,18),
                        new MoveLearnSetEntry(Move.LEECH_SEED,22),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,27),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.SPITE,31),
                        new MoveLearnSetEntry(Move.HORN_LEECH,48),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,53),
                        new MoveLearnSetEntry(Move.WILLOWISP,45),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,14),
                        new MoveLearnSetEntry(Move.SHADOW_FORCE,51),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,41),
                        new MoveLearnSetEntry(Move.VINE_WHIP,5),
                        new MoveLearnSetEntry(Move.BONE_RUSH,35),
                        new MoveLearnSetEntry(Move.HOWL,11),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,55)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 40, 0.9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Braixen");

    }


}
