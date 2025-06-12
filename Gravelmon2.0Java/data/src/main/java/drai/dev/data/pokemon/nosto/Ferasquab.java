package drai.dev.data.pokemon.nosto;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ferasquab extends drai.dev.data.pokemon.Pokemon {
    public Ferasquab() {
        super("Ferasquab",
                Type.NORMAL, Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 165,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Cherm and Cherrish are Ferasquab's favourite meal. It uses its sharp beak to sniff out the sweetest Cherm."),
                List.of(new EvolutionEntry("streedove", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"17")))),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ACID,6),
                        new MoveLearnSetEntry(Move.RECYCLE,12),
                        new MoveLearnSetEntry(Move.PLUCK,16),
                        new MoveLearnSetEntry(Move.CROSS_POISON,22),
                        new MoveLearnSetEntry(Move.FLING,26),
                        new MoveLearnSetEntry(Move.ROOST,32),
                        new MoveLearnSetEntry(Move.FLY,36),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,42),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,46),
                        new MoveLearnSetEntry(Move.BELCH,52)
                ),
                List.of(Label.NOSTO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Ferasquab");

    }


}
