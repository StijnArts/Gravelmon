package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Haggage extends drai.dev.gravelmon.pokemon.Pokemon {
    public Haggage() {
        super("Haggage",
                Type.DARK,
                new Stats(120,
                        75,
                        90,
                        50,
                        90,
                        50),
                List.of(Ability.INFILTRATOR,Ability.HARVEST,Ability.THICK_FAT), Ability.THICK_FAT,
                9, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.75,
                125, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("The bag mask around its head fits so tight it'd take a tow truck to pull it off. Anyone who sees its unmasked face is said to turn to dust."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SNORE,1),
                        new MoveLearnSetEntry(Move.SNARL,24),
                        new MoveLearnSetEntry(Move.ROLLOUT,26),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,30),
                        new MoveLearnSetEntry(Move.CRUNCH,34),
                        new MoveLearnSetEntry(Move.BODY_SLAM,37),
                        new MoveLearnSetEntry(Move.REST,40),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,44),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,50)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 43, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Haggage");

    }


}
