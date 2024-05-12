package drai.dev.gravelmon.pokemon.otopo;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Coasteron extends drai.dev.gravelmon.pokemon.Pokemon {
    public Coasteron() {
        super("Coasteron",
                Type.WATER, Type.FLYING,
                new Stats(50,
                        50,
                        50,
                        85,
                        70,
                        140),
                List.of(Ability.HYDRATION,Ability.DRIZZLE), Ability.SWIFT_SWIM,
                18, 240,
                new Stats(0,0,0,0,0,2), 0,
                0.5,
                156, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FLYING),
                List.of("Seafarers utilise Coasteron as a signalling device. They may create a piercing toot to alert their trainer to danger."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.SOAK,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.AIR_SLASH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TAILWIND,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.AGILITY,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,15),
                        new MoveLearnSetEntry(Move.WATER_PULSE,20),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,25),
                        new MoveLearnSetEntry(Move.FLY,30),
                        new MoveLearnSetEntry(Move.STEEL_WING,33),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,36),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,39),
                        new MoveLearnSetEntry(Move.MIST,43),
                        new MoveLearnSetEntry(Move.HURRICANE,46),
                        new MoveLearnSetEntry(Move.ROOST,49),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,53)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Coasteron");

    }


}
