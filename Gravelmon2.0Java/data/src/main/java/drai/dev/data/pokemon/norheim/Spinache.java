package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Spinache extends drai.dev.data.pokemon.Pokemon {
    public Spinache() {
        super("Spinache",
                Type.GRASS, Type.FIGHTING,
                new Stats(65,
                        70,
                        60,
                        40,
                        55,
                        55),
                List.of(Ability.OWN_TEMPO,Ability.INSOMNIA,Ability.SAP_SIPPER), Ability.SAP_SIPPER,
                5, 165,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Spinache spins around at all times, preventing it from getting attacked by Moler, leaving it with constant nausea. While spinning, this Pokemon ruins crops and turns farmland into a complete mess."),
                List.of(new EvolutionEntry("beatroot", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))),
                List.of(            new MoveLearnSetEntry(Move.MUD_SPORT,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.MAGNITUDE,13),
                        new MoveLearnSetEntry(Move.BIDE,19),
                        new MoveLearnSetEntry(Move.BULK_UP,24),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,29),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,36),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,40),
                        new MoveLearnSetEntry(Move.ROTOTILLER,45),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,50),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,58),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,68),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,"tm"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm")             ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 6, 26, 4.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_CROPS),
                0.28, 0.3,
                List.of());
           setLangFileName("Spinache");

    }


}
