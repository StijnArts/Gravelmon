package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Grubzero extends drai.dev.data.pokemon.Pokemon {
    public Grubzero() {
        super("Grubzero",
                Type.BUG, Type.ICE,
                new Stats(45,
                        60,
                        45,
                        75,
                        45,
                        40),
                List.of(Ability.SNOW_CLOAK), Ability.SNOW_CLOAK,
                4, 165,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                64, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.FIELD),
                List.of("Grubzero are herbivores that eat only the fallen winter leaves. Their superficial resemblance to Slunny is a defense mechanism, as predators avoid them instinctively."),
                List.of(new EvolutionEntry("crystalis", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"26")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,5),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,10),
                        new MoveLearnSetEntry(Move.HARDEN,16),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,20),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,26)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Grubzero");

    }


}
