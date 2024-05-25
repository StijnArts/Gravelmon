package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Traffitron extends drai.dev.gravelmon.pokemon.Pokemon {
    public Traffitron() {
        super("Traffitron",
                Type.ELECTRIC, Type.PSYCHIC,
                new Stats(50,
                        60,
                        95,
                        120,
                        70,
                        70),
                List.of(Ability.ANALYTIC), Ability.ANALYTIC,
                10, 600,
                new Stats(0,0,0,2,0,0), 60,
                0.0,
                163, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("A Pokemon developed by PokePal Inc. This Pokemon is designed to ensure there is an organised flow of traffic throughout the city. They are capable of shooting powerful lasers to those who do not obey traffic laws."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,12),
                        new MoveLearnSetEntry(Move.PSYBEAM,16),
                        new MoveLearnSetEntry(Move.SPARK,20),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,24),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,28),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,34),
                        new MoveLearnSetEntry(Move.DISCHARGE,40),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,46),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,52),
                        new MoveLearnSetEntry(Move.LOCKON,58),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,64),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,"tm")                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Traffitron");

    }


}
