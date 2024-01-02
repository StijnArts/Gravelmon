package drai.dev.gravelmon.pokemon.myth.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class MythianLucario extends Pokemon {
    public MythianLucario(int dexNo) {
        super(dexNo,"MythianLucario",
                Type.GROUND, Type.GHOST,
                new Stats(70,110,70,115,70,90),
                List.of(Ability.LEVITATE, Ability.ARENA_TRAP), Ability.DRY_SKIN,
                12, 540,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                184, ExperienceGroup.MEDIUM_SLOW,
                70,
                51, List.of(EggGroup.FIELD, EggGroup.HUMAN_LIKE),
                List.of("By reading the auras of all things, it can tell how others are feeling from over half a mile away."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AURA_SPHERE,1),
                        new MoveLearnSetEntry(Move.LIFE_DEW,1),
                        new MoveLearnSetEntry(Move.WORK_UP,1),
                        new MoveLearnSetEntry(Move.MAGNITUDE,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.FORCE_PALM,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.COPYCAT,1),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,1),
                        new MoveLearnSetEntry(Move.REVERSAL,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.DETECT,1),
                        new MoveLearnSetEntry(Move.FEINT,1),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,1),
                        new MoveLearnSetEntry(Move.COUNTER,12),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,16),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,20),
                        new MoveLearnSetEntry(Move.CALM_MIND,24),
                        new MoveLearnSetEntry(Move.METAL_SOUND,28),
                        new MoveLearnSetEntry(Move.BULLET_WAVE,32),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,36),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,40),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,44),
                        new MoveLearnSetEntry(Move.METEOR_MASH,48),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,52),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,56),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,60),
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
                SpawnContext.GROUNDED, SpawnPool.RARE, 29, 52, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_WASTELAND))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Lucario");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
