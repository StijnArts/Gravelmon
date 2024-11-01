package drai.dev.data.pokemon.blazingemerald.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HoennianToxapex extends Pokemon {
    public HoennianToxapex(String name, Aspect aspect) {
        super(name, aspect,"HoennianToxapex",
                Type.ROCK, Type.POISON,
                new Stats(60, 63, 182, 43, 122, 25),
                List.of(Ability.POISON_POINT), Ability.SOLID_ROCK,
                UnitConverter.feetToMeters(4, 3), UnitConverter.lbsToKg(1080),
                new Stats(0,0,3,0,0,0), 75,
                0.5,
                173, ExperienceGroup.MEDIUM_FAST,
                70,
                51,  List.of(EggGroup.WATER_1),
                List.of("It disguises itself as a simple rock to catch unsuspecting prey off guard. Toxapex then rams it's entire body into it's victim, paralyzing it with it's toxic spines."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FISSURE,"egg"),
                        new MoveLearnSetEntry(Move.CRYSTALIZE,"egg"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,7),
                        new MoveLearnSetEntry(Move.RECOVER,13),
                        new MoveLearnSetEntry(Move.POISON_JAB,19),
                        new MoveLearnSetEntry(Move.ACCELEROCK,26),
                        new MoveLearnSetEntry(Move.SPIKES,33),
                        new MoveLearnSetEntry(Move.GEOSPLINTER,38),
                        new MoveLearnSetEntry(Move.STONE_SURGE,44),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,51)
                        ),
                List.of(Label.BLAZING_EMERALD, Label.GEN7),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 40, 55, 0.9, List.of(
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.AMETHYST_GEODE),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Mareanie");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
