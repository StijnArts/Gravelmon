package drai.dev.gravelmon.pokemon.flux;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Sluchuu extends Pokemon {
    public Sluchuu() {
        super("Sluchuu",
                Type.ELECTRIC, Type.WATER,
                new Stats(71,
                        50,
                        80,
                        90,
                        105,
                        36),
                List.of(Ability.VOLT_ABSORB), Ability.REGENERATOR,
                4, 60,
                new Stats(0,9,0,0,2,0), 90,
                0.5,
                151, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS, EggGroup.WATER_1),
                List.of("Although its appearance resembles PIKACHU, it is in fact a mollusk Pokémon more closely related to SHELLOS and GOOMY. It prefers a solitary lifestyle, and will not hesitate to shock those that disturb it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NUZZLE,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.CHARGE,5),
                        new MoveLearnSetEntry(Move.ELECTROWEB,10),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,16),
                        new MoveLearnSetEntry(Move.MINIMIZE,21),
                        new MoveLearnSetEntry(Move.BRINE,25),
                        new MoveLearnSetEntry(Move.RECOVER,30),
                        new MoveLearnSetEntry(Move.DISCHARGE,36),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,41),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,45),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,50),
                        new MoveLearnSetEntry(Move.THUNDER,56),
                        new MoveLearnSetEntry(Move.ELECTRIFY,61),
                        new MoveLearnSetEntry(Move.SOAK,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"egg"),
                        new MoveLearnSetEntry(Move.YAWN,"egg")
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 18, 42, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_RIVER, Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
    }
}
