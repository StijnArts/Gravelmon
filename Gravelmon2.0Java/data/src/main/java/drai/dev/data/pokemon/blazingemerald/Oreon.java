package drai.dev.data.pokemon.blazingemerald;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Oreon extends Pokemon {
    public Oreon() {
        super("Oreon",
                Type.POISON,
                new Stats(80, 100, 80, 100, 80, 60),
                List.of(Ability.STICKY_HOLD), Ability.THICK_FAT,
                UnitConverter.feetToMeters(3, 7), UnitConverter.lbsToKg(639),
                new Stats(0,1,0,1,0,0), 15,
                0.5,
                200, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.FIELD),
                List.of("Thought to be a mythical Pokemon, Oreon have only been seen by a small handful of trainers. It's soft, delicious body can regenerate rapidly."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COOKIE_CUT,1),
                        new MoveLearnSetEntry(Move.MILK_DRINK,5),
                        new MoveLearnSetEntry(Move.LICK,14),
                        new MoveLearnSetEntry(Move.ACID,22),
                        new MoveLearnSetEntry(Move.CRUNCH,35),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,41),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,47),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,54),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,61),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,80),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"egg")
                        ),
                List.of(Label.BLAZING_EMERALD, Label.JOKE),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 34, 56, 0.001, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.19, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setPreEvolution("eevee");
        addAdditionalEvolution("eevee", new EvolutionEntry("oreon", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"minecraft:cookie"));
        setModeled(true);
        setBaseScale(0.7);
        setHitbox(1,1);
    }
}
