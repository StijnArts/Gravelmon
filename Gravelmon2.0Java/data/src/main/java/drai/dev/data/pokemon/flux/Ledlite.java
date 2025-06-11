package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ledlite extends Pokemon {
    public Ledlite() {
        super("Ledlite",
                Type.ELECTRIC,
                new Stats(45,
                        36,
                        45,
                        36,
                        72,
                        27),
                List.of(Ability.ILLUMINATE, Ability.PLUS), Ability.VOLT_ABSORB,
                4, 30,
                new Stats(0,0,0,0,1,0), 200,
                -1,
                53, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("When it draws in electric current through its tail, its head starts glowing. It can stay lit for a whole month on an hour's worth of charge."),
                List.of(new EvolutionEntry("insulatex", EvolutionType.LEVEL_UP, false, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "26")))),
                List.of(
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,1),
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,1)
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_OVERWORLD)
    .setAntiBiomes(Biome.IS_HIGHLANDS)
    .isThundering()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
    }
}
