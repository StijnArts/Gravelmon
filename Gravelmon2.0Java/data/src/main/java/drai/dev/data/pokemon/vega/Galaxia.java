package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Galaxia extends Pokemon {
    public Galaxia() {
        super( "Galaxia",
                Type.POISON, Type.PSYCHIC,
                new Stats(65	,
                        125	,
                        82	,
                        50,
                        77	,
                        90),
                List.of(Ability.SERENE_GRACE), Ability.LONG_REACH,
                15, 579,
                new Stats(0,0,0,2,0,0), 60,
                -1,
                147, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PSYCRUSH,1),
                        new MoveLearnSetEntry(Move.CROSS_POISON,1),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.SONIC_BOOM,1),
                        new MoveLearnSetEntry(Move.PRISM_ATTACK,1),
                        new MoveLearnSetEntry(Move.DISABLE,6),
                        new MoveLearnSetEntry(Move.PSYWAVE,9),
                        new MoveLearnSetEntry(Move.SLUDGE,12),
                        new MoveLearnSetEntry(Move.DARK_HAND,17),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,20),
                        new MoveLearnSetEntry(Move.SHARPSHOOT,23),
                        new MoveLearnSetEntry(Move.COUNTER,28),
                        new MoveLearnSetEntry(Move.HYPNOPULSE,31),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,34),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,39),
                        new MoveLearnSetEntry(Move.VILE_VENOM,42),
                        new MoveLearnSetEntry(Move.MEDITATE,45),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,50),
                        new MoveLearnSetEntry(Move.MARVEL_TRICK,53),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,56),
                        new MoveLearnSetEntry(Move.GRIMEBUSTER,61),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SEVERE_POISON,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tutor"),
                        new MoveLearnSetEntry(Move.PHEROTOXIN,"tutor"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.INFECTION,"tutor"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tutor"),
                        new MoveLearnSetEntry(Move.YOGA_SMASH,"tutor"),
                        new MoveLearnSetEntry(Move.STARDUST,"tutor"),
                        new MoveLearnSetEntry(Move.PSYGATLING,"tutor"),
                        new MoveLearnSetEntry(Move.STARFREEZE,"tutor")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 22, 48, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
        setCanFly(true);
    }
}
