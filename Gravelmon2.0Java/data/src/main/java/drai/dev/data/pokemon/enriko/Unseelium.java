package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Unseelium extends drai.dev.data.pokemon.Pokemon {
    public Unseelium() {
        super("Unseelium",
                Type.FAIRY, Type.FLYING,
                new Stats(97,
                        50,
                        9,
                        111,
                        100,
                        57),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("Their head is filled with enough helium to lift their tiny bodies off the ground. If its head bursts, it simply grows a new one. Their gaze instills visceral fear in anyone it locks eyes with."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.SAFEGUARD,5),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,7),
                        new MoveLearnSetEntry(Move.NUZZLE,10),
                        new MoveLearnSetEntry(Move.GUST,12),
                        new MoveLearnSetEntry(Move.TAILWIND,16),
                        new MoveLearnSetEntry(Move.HEART_STAMP,18),
                        new MoveLearnSetEntry(Move.RECOVER,20),
                        new MoveLearnSetEntry(Move.MINIMIZE,24),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,26),
                        new MoveLearnSetEntry(Move.TWISTER,30),
                        new MoveLearnSetEntry(Move.BODY_SLAM,34),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,36),
                        new MoveLearnSetEntry(Move.MOONBLAST,40),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,44),
                        new MoveLearnSetEntry(Move.HURRICANE,50)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Unseelium");

    }


}
