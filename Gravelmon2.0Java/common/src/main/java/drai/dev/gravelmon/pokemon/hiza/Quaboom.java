package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Quaboom extends drai.dev.gravelmon.pokemon.Pokemon {
    public Quaboom() {
        super("Quaboom",
                Type.ROCK, Type.POISON,
                new Stats(40,
                        80,
                        130,
                        40,
                        130,
                        5),
                List.of(Ability.AFTERMATH), Ability.MOLD_BREAKER,
                6, 165,
                new Stats(0,0,1,0,0,0), 65,
                0.5,
                88, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.WATER_2),
                List.of("It hides around rocks where it spends most of the days sleeping. If provoked it will shoot out poisonous barbs from its back in all directions."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,1),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,1),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,1),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,7),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,11),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,15),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,18),
                        new MoveLearnSetEntry(Move.VENOSHOCK,22),
                        new MoveLearnSetEntry(Move.SANDSTORM,26),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,29),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,33),
                        new MoveLearnSetEntry(Move.POWER_GEM,39),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,44),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,50)
                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 45, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Quaboom");

    }


}
