package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hatchick extends drai.dev.data.pokemon.Pokemon {
    public Hatchick() {
        super("Hatchick",
                Type.NORMAL, Type.FLYING,
                new Stats(55,
                        34,
                        58,
                        34,
                        34,
                        30),
                List.of(Ability.EARLY_BIRD,Ability.RUN_AWAY,Ability.WEAK_ARMOR), Ability.WEAK_ARMOR,
                4, 165,
                new Stats(0,1,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.FIELD),
                List.of("This timid Pokemon only feels safe if it is wearing its eggshell, and it will boldly drive off children that reach for its head. Trainers are always confused seeing them hatch."),
                List.of(new EvolutionEntry("scuffowl", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.CHIRP,1)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Hatchick");

    }


}
