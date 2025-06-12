package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Harpirit extends drai.dev.data.pokemon.Pokemon {
    public Harpirit() {
        super("Harpirit",
                Type.GHOST, Type.SOUND,
                new Stats(60,
                        40,
                        50,
                        100,
                        100,
                        80),
                List.of(Ability.SERENE_GRACE,Ability.FOREWARN), Ability.WONDERHARP,
                8, 81,
                new Stats(0,0,0,1,1,0), 100,
                0.5,
                87, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_2),
                List.of("It plays a serene tone with its harp-like tail. Those who listen to the sound are captivated by its loveliness and follow it endlessly, never to be seen again."),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.SPITE,4),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,8),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,12),
                        new MoveLearnSetEntry(Move.SCARY_FACE,16),
                        new MoveLearnSetEntry(Move.WILLOWISP,20),
                        new MoveLearnSetEntry(Move.HEX,24),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,28),
                        new MoveLearnSetEntry(Move.CURSE,32),
                        new MoveLearnSetEntry(Move.IMPRISON,36),
                        new MoveLearnSetEntry(Move.CALM_MIND,44),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,48)                  ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.RARE, 12, 35, 1.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
           setLangFileName("Harpirit");
        setCanSwim(true);
        setCanBreathUnderwater(true);

    }


}
