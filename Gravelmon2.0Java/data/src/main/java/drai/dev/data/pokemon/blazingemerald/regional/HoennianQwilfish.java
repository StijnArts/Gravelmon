package drai.dev.data.pokemon.blazingemerald.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HoennianQwilfish extends Pokemon {
    public HoennianQwilfish(String name, Aspect aspect) {
        super(name, aspect,"HoennianQwilfish",
                Type.POISON, Type.STEEL,
                new Stats(55, 52, 160, 93, 110, 5),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                UnitConverter.feetToMeters(2, 7), UnitConverter.lbsToKg(950),
                new Stats(0,0,1,0,1,0), 45,
                0.5,
                88, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.WATER_2),
                List.of("Qwilfish latch their tails to rocks on the seafloor and wait for unsuspecting prey to swim by. When it spots a target, it unleashes an explosion of toxic fumes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAUNT,"egg"),
                        new MoveLearnSetEntry(Move.RAGING_WAVES,"egg"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"egg"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.MINIMIZE,1),
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.IRON_HEAD,10),
                        new MoveLearnSetEntry(Move.SMOG,10),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,19),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,28),
                        new MoveLearnSetEntry(Move.TOXIFUME,37),
                        new MoveLearnSetEntry(Move.CARBONIZE,46)
                        ),
                List.of(Label.BLAZING_EMERALD, Label.GEN2),
                0, List.of(),
                SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 20, 44, 10.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD, Biome.IS_WARM_OCEAN))),
                List.of(SpawnPreset.UNDERWATER),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Qwilfish");
        
        this.setCanSwim(true);
        this.setCanBreathUnderwater(true);
        this.setAvoidsLand(true);
        this.setWanderChance(0);
    }
}
