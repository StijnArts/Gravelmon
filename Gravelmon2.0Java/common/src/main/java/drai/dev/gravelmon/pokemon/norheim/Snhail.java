package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Snhail extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snhail() {
        super("Snhail",
                Type.ICE,
                new Stats(50,
                        76,
                        90,
                        68,
                        76,
                        50),
                List.of(Ability.SNOW_WARNING,Ability.SLUSH_RUSH,Ability.MIRROR_ARMOR), Ability.MIRROR_ARMOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Curious yet easily frightened. Approaching its -248 fahrenheit icicle covered shell will instantly freeze any foe."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,5),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,10),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,15),
                        new MoveLearnSetEntry(Move.SHARPEN,20),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,25),
                        new MoveLearnSetEntry(Move.ICE_SHARD,30),
                        new MoveLearnSetEntry(Move.MIMIC,35),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,40),
                        new MoveLearnSetEntry(Move.FROST_BREATH,44),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,49),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,55),
                        new MoveLearnSetEntry(Move.BLIZZARD,60),
                        new MoveLearnSetEntry(Move.SHEER_COLD,75)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snhail");

    }


}
