package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Chimeaura  extends Pokemon {
    public Chimeaura() {
        super("Chimeaura",
                Type.SOUND, Type.STEEL,
                new Stats(85,55,120,75,115,100),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                20, 69,
                new Stats(0,0,2,0,1,0), 45,
                0.5,
                212, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.AMORPHOUS),
                List.of("Adapting to the sounds of it's environment can help Chimeaura in battle."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HEALING_WISH, 1),
                        new MoveLearnSetEntry(Move.FLASH_CANNON, 1),
                        new MoveLearnSetEntry(Move.WRAP, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.ASTONISH, 1),
                        new MoveLearnSetEntry(Move.POPSHOT, 1),
                        new MoveLearnSetEntry(Move.GROWL, 4),
                        new MoveLearnSetEntry(Move.ASTONISH, 7),
                        new MoveLearnSetEntry(Move.CONFUSION, 10),
                        new MoveLearnSetEntry(Move.YAWN, 13),
                        new MoveLearnSetEntry(Move.BBSHOT, 16),
                        new MoveLearnSetEntry(Move.TAKE_DOWN, 19),
                        new MoveLearnSetEntry(Move.EXTRASENSORY, 22),
                        new MoveLearnSetEntry(Move.HEAL_BELL, 27),
                        new MoveLearnSetEntry(Move.UPROAR, 32),
                        new MoveLearnSetEntry(Move.SHRAPNEL_PULSE, 37),
                        new MoveLearnSetEntry(Move.REST, 42),
                        new MoveLearnSetEntry(Move.HEAL_PULSE, 47),
                        new MoveLearnSetEntry(Move.SNORE, 52),
                        new MoveLearnSetEntry(Move.HEALING_WISH, 57)
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(36)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY, Biome.IS_MAGICAL, Biome.IS_MOUNTAIN)
    .setAntiBiomes(Biome.IS_COLD)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        addAdditionalEvolution("chimecho", new EvolutionEntry("chimeaura", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36"))));
    }
}
