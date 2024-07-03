package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Gorsylum extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gorsylum() {
        super("Gorsylum",
                Type.GHOST, Type.DRAGON,
                new Stats(90,
                        150,
                        104,
                        90,
                        90,
                        76),
                List.of(Ability.DRY_SKIN), Ability.DRY_SKIN,
                26, 165,
                new Stats(0,3,0,0,0,0), 15,
                0.5,
                284, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MINERAL),
                List.of("Gorsylum constantly wail in despair, longing for sunlight despite being deathly harmed by it. Gorsylum will crumble into dust and ash when defeated in battle, but simply plunging its sword into the ground will bring it back from the surrounding debris."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LIQUEFACTION,1),
                        new MoveLearnSetEntry(Move.MALICE_STRIKE,1),
                        new MoveLearnSetEntry(Move.TOMBSTONER,1),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,1),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,1),
                        new MoveLearnSetEntry(Move.CURSE,1),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,1),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,1),
                        new MoveLearnSetEntry(Move.OUTRAGE,1),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,1),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,1),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,1),
                        new MoveLearnSetEntry(Move.SPITE,1),
                        new MoveLearnSetEntry(Move.LASH_OUT,1),
                        new MoveLearnSetEntry(Move.SNARL,1),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,1),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,1),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,1),
                        new MoveLearnSetEntry(Move.FLAIL,1),
                        new MoveLearnSetEntry(Move.LIQUEFACTION,1),

                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 61, 70, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.MANSION),
                0.28, 0.3,
                List.of());
           setLangFileName("Gorsylum");

    }


}
