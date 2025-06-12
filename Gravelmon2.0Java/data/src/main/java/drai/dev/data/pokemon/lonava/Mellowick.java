package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Mellowick extends drai.dev.data.pokemon.Pokemon {
    public Mellowick() {
        super("Mellowick",
                Type.FIRE,
                new Stats(60,
                        50,
                        60,
                        75,
                        70,
                        55),
                List.of(Ability.FLASH_FIRE), Ability.FLAME_BODY,
                3, 165,
                new Stats(0,0,0,1,0,0), 220,
                0.5,
                74, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Mellowick's burning wax body emits the most divine scent, which changes depending on its mood. Candlemakers from all over the world have tried to reproduce these scents, with little success. Lonavan artisans know the secret, but refuse to share the formula, only ever bringing it out for specific occasions."),
                List.of(new EvolutionEntry("rewaxation", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,5),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,9),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,12),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,15),
                        new MoveLearnSetEntry(Move.INCINERATE,18),
                        new MoveLearnSetEntry(Move.WILLOWISP,21),
                        new MoveLearnSetEntry(Move.FLAME_BURST,24),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,28),
                        new MoveLearnSetEntry(Move.FIERY_DANCE,32),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,36),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,42),
                        new MoveLearnSetEntry(Move.OVERHEAT,48)                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Mellowick");

    }


}
