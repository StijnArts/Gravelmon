package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Finbred extends drai.dev.gravelmon.pokemon.Pokemon {
    public Finbred() {
        super("Finbred",
                Type.WATER,
                new Stats(100,
                        110,
                        80,
                        50,
                        50,
                        70),
                List.of(Ability.STRONG_JAW,Ability.GUTS,Ability.ADAPTABILITY), Ability.ADAPTABILITY,
                8, 165,
                new Stats(0,0,0,0,0,0), 85,
                0.5,
                134, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Its diet consists mostly of other Gumuppi, which it hunts by smell. Dissection reveals that it actually does have eyes; its own skull has grown over them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,1),
                        new MoveLearnSetEntry(Move.ACROBATICS,11),
                        new MoveLearnSetEntry(Move.PURSUIT,22),
                        new MoveLearnSetEntry(Move.AQUA_RING,26),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.RECOVER,36),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,42),
                        new MoveLearnSetEntry(Move.FISHIOUS_REND,48)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Finbred");

    }


}
