package drai.dev.gravelmon.pokemon.orbis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Intimeow extends drai.dev.gravelmon.pokemon.Pokemon {
    public Intimeow() {
        super("Intimeow",
                Type.GHOST,
                new Stats(30,
                        75,
                        55,
                        30,
                        40,
                        95),
                List.of(Ability.STAKEOUT,Ability.PICKPOCKET), Ability.INTIMIDATE,
                5, 39,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                78, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Gangs of Intimeow are rampant in darker areas of Orbopolis where they hide in the shadows."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,4),
                        new MoveLearnSetEntry(Move.FAKE_OUT,8),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,13),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.TAUNT,20),
                        new MoveLearnSetEntry(Move.POUNCE,25),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,29),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,32),
                        new MoveLearnSetEntry(Move.SLASH,36),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,40),
                        new MoveLearnSetEntry(Move.LAST_RESPECTS,44)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Intimeow");

    }


}
