package drai.dev.gravelmon.pokemon.orbis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Cappatross extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cappatross() {
        super("Cappatross",
                Type.FLYING,Type.WATER,
                new Stats(85,
                        105,
                        65,
                        65,
                        90,
                        95),
                List.of(Ability.GALE_WINGS,Ability.TANGLED_FEET), Ability.STORM_DRAIN,
                13, 590,
                new Stats(0,2,0,0,0,1), 45,
                0.5,
                178, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Cappatross lead groups of Seadeek and Chickabeach during migrations and long distance flights. They are extremely territorial and will not allow other Pokemon to be near the rest of its group. There will only ever be one Cappatross per flock; when another Seadeek evolves, the two Cappatross will fight it out, the winner either retaining or taking control of the flock."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SOAK,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.ROOST,1),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.BRINE,1),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,1),
                        new MoveLearnSetEntry(Move.TAILWIND,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,1),
                        new MoveLearnSetEntry(Move.LIQUIDATION,1),
                        new MoveLearnSetEntry(Move.PLUCK,1),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cappatross");

    }


}
