package drai.dev.data.pokemon.enjin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lucidris extends drai.dev.data.pokemon.Pokemon {
    public Lucidris() {
        super("Lucidris",
                Type.POISON, Type.PSYCHIC,
                new Stats(75,
                        45,
                        65,
                        75,
                        100,
                        25),
                List.of(Ability.STICKY_HOLD,Ability.REGENERATOR), Ability.CONTAMINATE,
                7, 260,
                new Stats(0,0,0,0,2,0), 90,
                0.5,
                135, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.WATER_3),
                List.of("It entered a dormant state to outsmart the parasite feeding on its brainwaves. Now, the parasite defends Lucidris from predators until it is ready to evolve."),
                List.of(new EvolutionEntry("chlorodra", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.PSYWAVE,1),
                        new MoveLearnSetEntry(Move.ACID,7),
                        new MoveLearnSetEntry(Move.SUPERSONIC,11),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,13),
                        new MoveLearnSetEntry(Move.PSYBEAM,17),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,20),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,23),
                        new MoveLearnSetEntry(Move.NEUROTOXIN,29),
                        new MoveLearnSetEntry(Move.RECOVER,34),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,39),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,45),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,50),
                        new MoveLearnSetEntry(Move.BREAKDOWN,57),
                        new MoveLearnSetEntry(Move.TRUMP_CARD,"tm"),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"tm"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"tm"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"tm"),
                        new MoveLearnSetEntry(Move.SWALLOW,"tm"),
                        new MoveLearnSetEntry(Move.SPIT_UP,"tm"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"tm"),
                        new MoveLearnSetEntry(Move.WATER_SPORT,"tm"),
                        new MoveLearnSetEntry(Move.GUARD_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.DISABLE,"tm"),
                        new MoveLearnSetEntry(Move.FLAIL,"tm"),
                        new MoveLearnSetEntry(Move.STEAMROLLER,"tm")                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 24, 36, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);

    }


}
