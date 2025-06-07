package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Brisnie extends drai.dev.data.pokemon.Pokemon {
    public Brisnie() {
        super("Brisnie",
                Type.FAIRY,Type.FLYING,
                new Stats(70,
                        60,
                        50,
                        88,
                        80,
                        106),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 115,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                159, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of("Brisnie's fur is often used for making high end cleaning brushes. Many people encourage Brisnies to stay at their house, in order to get a free deep-cleaning."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,7),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,11),
                        new MoveLearnSetEntry(Move.CHARM,14),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,17),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,21),
                        new MoveLearnSetEntry(Move.WHIRLWIND,24),
                        new MoveLearnSetEntry(Move.SAFEGUARD,29),
                        new MoveLearnSetEntry(Move.AIR_SLASH,35),
                        new MoveLearnSetEntry(Move.DEFOG,40),
                        new MoveLearnSetEntry(Move.MOONBLAST,45),
                        new MoveLearnSetEntry(Move.HEAL_BELL,51),
                        new MoveLearnSetEntry(Move.ENDEAVOR,57),
                        new MoveLearnSetEntry(Move.SCREECH,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Brisnie");

    }


}
