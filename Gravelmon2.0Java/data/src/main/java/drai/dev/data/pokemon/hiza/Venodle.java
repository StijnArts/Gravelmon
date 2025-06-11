package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Venodle extends drai.dev.data.pokemon.Pokemon {
    public Venodle() {
        super("Venodle",
                Type.POISON,
                new Stats(30,
                        45,
                        45,
                        45,
                        45,
                        30),
                List.of(Ability.SHED_SKIN,Ability.UNNERVE,Ability.SAND_VEIL), Ability.SAND_VEIL,
                6, 165,
                new Stats(0,0,0,1,0,0), 225,
                0.5,
                59, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.DRAGON),
                List.of("Its fangs are still too small and fragile to be used to bite. It will instead spit poison and try to blind its foes."),
                List.of(new EvolutionEntry("rattletack", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"160")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.WRAP,3),
                        new MoveLearnSetEntry(Move.LICK,6),
                        new MoveLearnSetEntry(Move.ACID,9),
                        new MoveLearnSetEntry(Move.GLARE,12),
                        new MoveLearnSetEntry(Move.POISON_TAIL,17),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,21),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,26),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,31),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,36),
                        new MoveLearnSetEntry(Move.WRING_OUT,41),
                        new MoveLearnSetEntry(Move.COIL,46),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,52)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Venodle");

    }


}
