package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Crimgon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Crimgon() {
        super("Crimgon",
                Type.STEEL,Type.DRAGON,
                new Stats(70,
                        90,
                        130,
                        65,
                        80,
                        55),
                List.of(Ability.ANGER_SHELL,Ability.HEAVY_METAL,Ability.SHELL_ARMOR), Ability.SHELL_ARMOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Crimgon is capable of retracting its limbs inside its shell. Inside the shell, it builds up anger, ready to attack with its spiky head. The limbs themselves are soft, unlike the shell."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.SHARPEN,8),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,15),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,20),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,26),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,30),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,36),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,40),
                        new MoveLearnSetEntry(Move.IRON_HEAD,46),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,50),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,62),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,66)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crimgon");

    }


}
