package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochDottler extends drai.dev.data.pokemon.Pokemon {
    public EpochDottler(String name, Aspect aspect) {
        super(name, aspect, "EpochDottler",
                Type.NORMAL,
                new Stats(70,
                        50,
                        75,
                        40,
                        25,
                        75),
                List.of(Ability.STURDY,Ability.UNAWARE), Ability.OWN_TEMPO,
                4, 195,
                new Stats(0,0,0,0,2,0), 120,
                0.5,
                117, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Customers love how much fun it is to kick and throw around. It is a great toy to entertain dog Pokemon by playing ball or long chases around the yard."),
                List.of(new EvolutionEntry("epochorbeetle", EvolutionType.LEVEL_UP, List.of(), 
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                        new MoveLearnSetEntry(Move.FLAIL,16),
                        new MoveLearnSetEntry(Move.BIDE,7),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,4),
                        new MoveLearnSetEntry(Move.HEADBUTT,19),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.FEINT,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,13)),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(10).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).setAntiBiomes(Biome.IS_FOREST).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Dottler");

    }


}
