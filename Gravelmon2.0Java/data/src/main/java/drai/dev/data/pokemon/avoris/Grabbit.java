package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Grabbit extends drai.dev.data.pokemon.Pokemon {
    public Grabbit() {
        super("Grabbit",
                Type.DARK, Type.POISON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.STICKY_HOLD,Ability.PICKUP,Ability.PICKPOCKET), Ability.PICKPOCKET,
                3, 165,
                new Stats(0,0,0,0,0,0), 170,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their sticky webbing can latch onto anything. They hide in dark areas, waiting to snatch food and other items from passersby."),
                List.of(new EvolutionEntry("frobber", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME, "\"night\"")))),
                List.of(               new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ACID,5),
                        new MoveLearnSetEntry(Move.FAKE_OUT,8),
                        new MoveLearnSetEntry(Move.HYPNOSIS,13),
                        new MoveLearnSetEntry(Move.PAYBACK,15),
                        new MoveLearnSetEntry(Move.POISON_FANG,20),
                        new MoveLearnSetEntry(Move.ECHOLOCATE,22),
                        new MoveLearnSetEntry(Move.THIEF,27),
                        new MoveLearnSetEntry(Move.SWAGGER,29),
                        new MoveLearnSetEntry(Move.VENOSHOCK,34),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,36),
                        new MoveLearnSetEntry(Move.CROSS_POISON,41),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,43),
                        new MoveLearnSetEntry(Move.TOXIC,48),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,50),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,55),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,57)
                ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 7, 32, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grabbit");

    }


}
