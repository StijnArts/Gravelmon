package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Arcnid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Arcnid() {
        super("Arcnid",
                Type.ELECTRIC, Type.GROUND,
                new Stats(75,
                        110,
                        100,
                        75,
                        80,
                        40),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Arcnid stalk the dunes at night, preying on Pokemon like Camelt. Their three stingers paralyze their prey, allowing Arcnid to store prey for weeks at a time before feeding."),
                List.of(),
                List.of(         new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.SPARK,7),
                        new MoveLearnSetEntry(Move.BULLDOZE,14),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,21),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,28),
                        new MoveLearnSetEntry(Move.SCREECH,35),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,42),
                        new MoveLearnSetEntry(Move.METAL_SOUND,49),
                        new MoveLearnSetEntry(Move.DISCHARGE,56),
                        new MoveLearnSetEntry(Move.EARTH_POWER,63),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,70),
                        new MoveLearnSetEntry(Move.GRAVITY,77),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,84),
                        new MoveLearnSetEntry(Move.MAGNETIC_FLUX,91)),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 28, 54, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Arcnid");

    }


}
