package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Discobrawl extends drai.dev.gravelmon.pokemon.Pokemon {
    public Discobrawl() {
        super("Discobrawl",
                Type.FAIRY, Type.FIGHTING,
                new Stats(75,
                        120,
                        80,
                        45,
                        60,
                        80),
                List.of(Ability.DAZZLING,Ability.DANCER,Ability.MULTISCALE), Ability.MULTISCALE,
                15, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It communicates through complicated arm and leg movements. Its unique way of communicating has inspired many dance moves over the years."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,1),
                        new MoveLearnSetEntry(Move.LOW_KICK,12),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,16),
                        new MoveLearnSetEntry(Move.JUMP_KICK,22),
                        new MoveLearnSetEntry(Move.ATTRACT,26),
                        new MoveLearnSetEntry(Move.BOUNCE,32),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,36),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,40),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,45)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 37, 53, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.28, 0.3,
                List.of());
           setLangFileName("Discobrawl");

    }


}
