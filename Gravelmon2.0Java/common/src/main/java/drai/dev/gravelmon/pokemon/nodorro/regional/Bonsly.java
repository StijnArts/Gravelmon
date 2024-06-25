package drai.dev.gravelmon.pokemon.nodorro.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Bonsly extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bonsly(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "Bonsly",
                Type.GROUND,
                new Stats(45,
                        30,
                        45,
                        75,
                        80,
                        20),
                List.of(Ability.RATTLED,Ability.RUN_AWAY), Ability.DRY_SKIN,
                7, 90,
                new Stats(0,0,0,1,0,0), 155,
                0.5,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Bonsly is a good mimic, making it often mistaken for a real rooted carrot. although it can easily be recognized as a fake due to it's curling 'leaves'."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.COPYCAT,1),
                        new MoveLearnSetEntry(Move.LOW_KICK,5),
                        new MoveLearnSetEntry(Move.MUD_SHOT,8),
                        new MoveLearnSetEntry(Move.MIMIC,11),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,16),
                        new MoveLearnSetEntry(Move.BULLDOZE,20),
                        new MoveLearnSetEntry(Move.FLATTER,23),
                        new MoveLearnSetEntry(Move.NATURE_POWER,28),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,31),
                        new MoveLearnSetEntry(Move.COUNTER,35),
                        new MoveLearnSetEntry(Move.TAUNT,40)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bonsly");

    }


}
