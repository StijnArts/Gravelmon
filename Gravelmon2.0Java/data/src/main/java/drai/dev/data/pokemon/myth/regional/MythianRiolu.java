package drai.dev.data.pokemon.myth.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class MythianRiolu extends Pokemon {
    public MythianRiolu(String name, Aspect aspect) {
        super(name, aspect,"MythianRiolu",
                Type.GROUND, Type.GHOST,
                new Stats(40,70,40,35,40,60),
                List.of(Ability.LEVITATE, Ability.ARENA_TRAP), Ability.DRY_SKIN,
                9, 130,
                new Stats(0,1,0,0,0,0), 75,
                0.875,
                57, ExperienceGroup.MEDIUM_SLOW,
                70,
                51, List.of(EggGroup.UNDISCOVERED),
                List.of("The aura that emanates from its body intensifies to alert others if it is afraid or sad."),
                List.of(new EvolutionEntry("mythianlucario", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"160")))),
                List.of(
                        new MoveLearnSetEntry(Move.POPSHOT,1),
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,4),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,8),
                        new MoveLearnSetEntry(Move.COUNTER,12),
                        new MoveLearnSetEntry(Move.WORK_UP,16),
                        new MoveLearnSetEntry(Move.MAGNITUDE,20),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,24),
                        new MoveLearnSetEntry(Move.SCREECH,28),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,32),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,36),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,40),
                        new MoveLearnSetEntry(Move.HELPING_HAND,44),
                        new MoveLearnSetEntry(Move.COPYCAT,48),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,52),
                        new MoveLearnSetEntry(Move.REVERSAL,56),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,"egg"),
                        new MoveLearnSetEntry(Move.DETECT,"egg"),
                        new MoveLearnSetEntry(Move.BITE,"egg"),
                        new MoveLearnSetEntry(Move.MIND_READER,"egg"),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,"egg"),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,"egg"),
                        new MoveLearnSetEntry(Move.AGILITY,"egg"),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.CRUNCH,"egg"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"egg"),
                        new MoveLearnSetEntry(Move.BLAZE_KICK,"egg"),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,"egg"),
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,"egg"),
                        new MoveLearnSetEntry(Move.METEOR_MASH,"egg"),
                        new MoveLearnSetEntry(Move.HOWL,"egg"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"egg")
                ),
                List.of(Label.MYTH, Label.GEN4),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.RARE, 12, 28, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_WASTELAND))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Riolu");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
