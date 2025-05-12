package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sootot extends drai.dev.data.pokemon.Pokemon {
    public Sootot() {
        super("Sootot",
                Type.FIRE, Type.FLYING,
                new Stats(30,
                        35,
                        55,
                        55,
                        75,
                        45),
                List.of(Ability.EARLY_BIRD,Ability.OBLIVIOUS), Ability.FLAME_BODY,
                4, 9,
                new Stats(0,0,0,0,1,0), 240,
                0.5,
                58, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Chimchik spend their young lives nesting in chimneys to stay warm. They absorb the smoke exuded which gives them their dark plumage."),
                List.of(new EvolutionEntry("sweepmu", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.EMBER,5),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,8),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,25),
                        new MoveLearnSetEntry(Move.ROOST,28)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_COLD).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Sootot");

    }


}
