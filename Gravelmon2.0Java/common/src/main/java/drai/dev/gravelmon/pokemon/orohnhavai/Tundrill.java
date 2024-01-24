package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Tundrill extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tundrill() {
        super("Tundrill",
                Type.GROUND,Type.STEEL,
                new Stats(100,
                        57,
                        98,
                        35,
                        64,
                        90),
                List.of(Ability.SAND_RUSH,Ability.SAND_VEIL,Ability.ARENA_TRAP), Ability.ARENA_TRAP,
                8, 165,
                new Stats(2,0,0,0,0,0), 60,
                0.5,
                156, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.MONSTER),
                List.of("A major hazard for roads and urban areas in general. Twisting its body in a drilling motion, it can submerge into the ground in mere seconds. Attracted to noise, they quickly drill their way to the source. They also will set traps for prey to fall in."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,7),
                        new MoveLearnSetEntry(Move.METAL_CLAW,13),
                        new MoveLearnSetEntry(Move.METAL_SOUND,17),
                        new MoveLearnSetEntry(Move.MUD_SPORT,21),
                        new MoveLearnSetEntry(Move.HORN_DRILL,26),
                        new MoveLearnSetEntry(Move.IRON_HEAD,32),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,38),
                        new MoveLearnSetEntry(Move.SPIKES,42),
                        new MoveLearnSetEntry(Move.BLOCK,47)                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tundrill");

    }


}
