package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Babroote extends drai.dev.data.pokemon.Pokemon {
    public Babroote() {
        super("Babroote",
                Type.DARK, Type.FIGHTING,
                new Stats(70,
                        112,
                        70,
                        85,
                        75,
                        98),
                List.of(Ability.QUICK_FEET), Ability.GORILLA_TACTICS,
                17, 165,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                223, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("They prefer living alone and train to strengthen their body. Their powerful forearms are made of 90% pure muscle."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.ASSURANCE,8),
                        new MoveLearnSetEntry(Move.LOW_KICK,12),
                        new MoveLearnSetEntry(Move.SWAGGER,15),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,17),
                        new MoveLearnSetEntry(Move.UPROAR,20),
                        new MoveLearnSetEntry(Move.BEAT_UP,24),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,30),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,36),
                        new MoveLearnSetEntry(Move.THRASH,44),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,49),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,56),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,59)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(43)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Babroote");

    }


}
