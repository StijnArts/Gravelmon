package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Thrashark extends drai.dev.gravelmon.pokemon.Pokemon {
    public Thrashark() {
        super("Thrashark",
                Type.WATER, Type.STEEL,
                new Stats(50,
                        100,
                        65,
                        70,
                        50,
                        85),
                List.of(Ability.INTIMIDATE,Ability.SNIPER,Ability.SWIFT_SWIM), Ability.SWIFT_SWIM,
                12, 165,
                new Stats(0,2,0,0,0,0), 140,
                0.75,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("The fins of Thrashark can easily cut through rocks and boats. They like to dwell in the dark then make a surprise attack to the boats on the surface, sinking them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,5),
                        new MoveLearnSetEntry(Move.AQUA_JET,9),
                        new MoveLearnSetEntry(Move.AGILITY,14),
                        new MoveLearnSetEntry(Move.BITE,19),
                        new MoveLearnSetEntry(Move.SLASH,23),
                        new MoveLearnSetEntry(Move.CRUNCH,25),
                        new MoveLearnSetEntry(Move.WATER_PULSE,28),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,34),
                        new MoveLearnSetEntry(Move.IRON_HEAD,40),
                        new MoveLearnSetEntry(Move.SCREECH,45),
                        new MoveLearnSetEntry(Move.WATERFALL,50),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,56),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,62),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tm"),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.METAL_BURST,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.JAW_LOCK,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 25, 43, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
