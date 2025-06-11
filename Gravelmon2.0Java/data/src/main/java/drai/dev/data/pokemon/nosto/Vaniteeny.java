package drai.dev.data.pokemon.nosto;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Vaniteeny extends drai.dev.data.pokemon.Pokemon {
    public Vaniteeny() {
        super("Vaniteeny",
                Type.GHOST, Type.FAIRY,
                new Stats(67,
                        73,
                        52,
                        47,
                        33,
                        34),
                List.of(Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                14, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.25,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Vaniteeny are very shy and will not move in the presence of another being. They stand very still on all 4 of their legs."),
                List.of(new EvolutionEntry("boodoir", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,1),
                        new MoveLearnSetEntry(Move.TACKLE,6),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,10),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,14),
                        new MoveLearnSetEntry(Move.METAL_SOUND,19),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,22),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,27),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,32),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,37),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,42)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Vaniteeny");

    }


}
