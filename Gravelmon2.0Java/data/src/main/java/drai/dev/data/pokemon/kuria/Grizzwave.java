package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Grizzwave extends drai.dev.data.pokemon.Pokemon {
    public Grizzwave() {
        super("Grizzwave",
                Type.SOUND, Type.DARK,
                new Stats(90,
                        100,
                        50,
                        100,
                        70,
                        130),
                List.of(Ability.TRICKSTER,Ability.COMPETITIVE), Ability.FREESTYLE,
                14, 182,
                new Stats(0,0,0,0,0,3), 45,
                0.5,
                200, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Grizzwave wants nothing more than to play its sounds for huge crowds. Its speakers are so powerful it can be heard thousands of miles away."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAILWIND, 1),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE, 1),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN, 1),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR, 1),
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK, 1),
                        new MoveLearnSetEntry(Move.TAUNT, 1),
                        new MoveLearnSetEntry(Move.ROUND, 12),
                        new MoveLearnSetEntry(Move.METAL_SOUND, 19),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, 24),
                        new MoveLearnSetEntry(Move.HYPER_VOICE, 30),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, 38),
                        new MoveLearnSetEntry(Move.HURRICANE, 46),
                        new MoveLearnSetEntry(Move.OVERDRIVE, 54),
                        new MoveLearnSetEntry(Move.BOOMBURST, 62)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.RARE)
    .setMinLevel(41)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Grizzwave");

    }


}
