package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Petumi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Petumi() {
        super("Petumi",
                Type.GRASS,
                new Stats(60,
                        35,
                        50,
                        35,
                        45,
                        45),
                List.of(Ability.LEAF_GUARD,Ability.CHLOROPHYLL,Ability.NATURAL_CURE), Ability.NATURAL_CURE,
                4, 165,
                new Stats(1,0,0,0,0,0), 190,
                0.5,
                41, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.GRASS),
                List.of("Its sweet fragrance grows stronger during the Spring. When gathered in groups, Petumi can leave a town smelling pleasantly for weeks."),
                List.of(new EvolutionEntry("fleuroma", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:leaf_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,3),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,10),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,14),
                        new MoveLearnSetEntry(Move.LEECH_SEED,18),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,21),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,25),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,30),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,33),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,36),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,41),
                        new MoveLearnSetEntry(Move.TICKLE,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FLOWER_SHIELD,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of( new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA))),
                List.of(SpawnPreset.FOLIAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Petumi");

    }


}
