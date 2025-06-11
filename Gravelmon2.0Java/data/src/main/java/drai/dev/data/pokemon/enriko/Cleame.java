package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cleame extends drai.dev.data.pokemon.Pokemon {
    public Cleame() {
        super("Cleame",
                Type.WATER,
                new Stats(75,
                        20,
                        80,
                        10,
                        50,
                        10),
                List.of(Ability.ANGER_POINT), Ability.HUGE_POWER,
                8, 165,
                new Stats(0,0,1,0,0,0), 255,
                0.6,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.MINERAL),
                List.of("Notoriously easy to provoke and even easier to offend. When something upsets it greatly, steam puffs from holes on its shell."),
                List.of(new EvolutionEntry("furiousc", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.RAGE,5),
                        new MoveLearnSetEntry(Move.BUBBLE,9),
                        new MoveLearnSetEntry(Move.AQUA_JET,14),
                        new MoveLearnSetEntry(Move.CLAMP,18),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,23),
                        new MoveLearnSetEntry(Move.BIDE,28),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,50)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_OCEAN)
    .setAntiBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
