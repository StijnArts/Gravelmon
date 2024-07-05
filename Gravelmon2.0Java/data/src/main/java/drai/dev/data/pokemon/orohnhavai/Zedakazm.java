package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Zedakazm extends drai.dev.data.pokemon.Pokemon {
    public Zedakazm() {
        super("Zedakazm",
                Type.DARK, Type.GHOST,
                new Stats(120,
                        150,
                        90,
                        100,
                        130,
                        90),
                List.of(Ability.PRESSURE), Ability.SHADOW_TAG,
                42, 165,
                new Stats(0,2,0,0,1,0), 3,
                0.0,
                306, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("The Realm of Zedakazm is the abode of the dead in which this beast is known as Ruler of the Underworld. It is known to bring evil souls to this bottomless realm where they will be tormented for eternity. Legend states that Yveltal is its emissary. Arceus has imprisoned Zedakazm deep within its realm."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,1),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,7),
                        new MoveLearnSetEntry(Move.TORMENT,13),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,19),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,25),
                        new MoveLearnSetEntry(Move.TAUNT,31),
                        new MoveLearnSetEntry(Move.CRUNCH,37),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,43),
                        new MoveLearnSetEntry(Move.WORK_UP,49),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,55),
                        new MoveLearnSetEntry(Move.PUNISHMENT,61),
                        new MoveLearnSetEntry(Move.JAW_LOCK,67),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,73),
                        new MoveLearnSetEntry(Move.GRUDGE,79),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,85),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,91)                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 55, 65, .01, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_SOUL_SAND, Biome.IS_NETHER_SOUL_FIRE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Zedakazm");

    }


}
