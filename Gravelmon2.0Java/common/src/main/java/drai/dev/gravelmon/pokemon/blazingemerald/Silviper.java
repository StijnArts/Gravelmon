package drai.dev.gravelmon.pokemon.blazingemerald;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;
import drai.dev.gravelmon.util.*;

import java.util.*;

public class Silviper extends Pokemon {
    public Silviper() {
        super("Silviper",
                Type.POISON, Type.STEEL,
                new Stats(100, 130, 150, 35, 80, 55),
                List.of(Ability.STRONG_JAW), Ability.MULTISCALE,
                UnitConverter.feetToMeters(12, 6), UnitConverter.lbsToKg(4387),
                new Stats(0,3,0,0,0,0), 60,
                0.5,
                200, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.DRAGON,EggGroup.FIELD),
                List.of("Silviper roamed the world as a ferocious predator in ancient times. It's long body is fortified with venom-infused silver scales."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,1),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,10),
                        new MoveLearnSetEntry(Move.POISON_FANG,20),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.IRON_TAIL,40),
                        new MoveLearnSetEntry(Move.FANG_BARRAGE,50),
                        new MoveLearnSetEntry(Move.POISON_TAIL,60),
                        new MoveLearnSetEntry(Move.VIRUGAIT,70),
                        new MoveLearnSetEntry(Move.SPIKES,80),
                        new MoveLearnSetEntry(Move.HYPER_FANG,90),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.FROSTBITE,"egg"),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,"egg")
                        ),
                List.of(Label.BLAZING_EMERALD),
                1, List.of(
                        new ItemDrop("gravelmon:silver_scale",50, 1,1)),
                SpawnContext.GROUNDED, SpawnPool.COMMON, 34, 56, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setPreEvolution("seviper");
        addAdditionalEvolution("seviper", new EvolutionEntry("silviper", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"\"gravelmon:silver_scale\""))));
    }
}
