package drai.dev.data.pokemon.blazingemerald;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;

import java.util.*;

public class Zangoro extends Pokemon {
    public Zangoro() {
        super("Zangoro",
                Type.NORMAL, Type.DARK,
                new Stats(75, 150, 65, 95, 65, 100),
                List.of(Ability.NO_GUARD), Ability.ARENA_TRAP,
                UnitConverter.feetToMeters(6, 7), UnitConverter.lbsToKg(1814),
                new Stats(0,3,0,0,0,0), 60,
                0.5,
                200, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.FIELD),
                List.of("Zangaro are often spoken of in stories meant to frighten misbehaving children. Its black fur cloaks it during the night when it comes out to hunt prey."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.JUMP_KICK,"egg"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"egg"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.VEILED_SKY,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.GLARE,10),
                        new MoveLearnSetEntry(Move.METAL_CLAW,20),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,30),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,40),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,50),
                        new MoveLearnSetEntry(Move.BULK_UP,60),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,70),
                        new MoveLearnSetEntry(Move.REVENGE,80),
                        new MoveLearnSetEntry(Move.SUPERPOWER,90)
                        ),
                List.of(Label.BLAZING_EMERALD),
                1, List.of(
                        new ItemDrop("gravelmon:murky_claw",50, 1,1)),
                SpawnContext.GROUNDED, SpawnPool.COMMON, 34, 56, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setPreEvolution("zangoose");
        addAdditionalEvolution("zangoose", new EvolutionEntry("zangoro", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"gravelmon:murky_claw"));
    }
}
