package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Chenileaf extends drai.dev.data.pokemon.Pokemon {
    public Chenileaf() {
        super("Chenileaf",
                Type.BUG, Type.GRASS,
                new Stats(35,
                        30,
                        25,
                        45,
                        40,
                        25),
                List.of(Ability.SWARM,Ability.SHED_SKIN,Ability.SHIELD_DUST), Ability.SHIELD_DUST,
                3, 165,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                45, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It will aid and bandage the wounds of their allies using the silk it produces on its tail. There is a farm in eastern Havai that collect and breed Chenileaf for their silk."),
                List.of(new EvolutionEntry("cottoon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"7")))),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.ABSORB,5),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,9),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,13)                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Chenileaf");

    }


}
