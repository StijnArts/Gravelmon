package drai.dev.data.pokemon.opalo;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Polekin extends Pokemon {
    public Polekin() {
        super("Polekin",
                Type.GRASS,
                new Stats(58,65,50,51,44,45),
                List.of(Ability.OVERGROW), Ability.RECKLESS,
                4, 300,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("fungorse", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.VINE_WHIP, 5),
                        new MoveLearnSetEntry(Move.ROLLOUT, 8),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK, 11),
                        new MoveLearnSetEntry(Move.LEECH_SEED, 15),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF, 18),
                        new MoveLearnSetEntry(Move.TAKE_DOWN, 27),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD, 32),
                        new MoveLearnSetEntry(Move.MUD_SHOT, 35),
                        new MoveLearnSetEntry(Move.BULK_UP, 39),
                        new MoveLearnSetEntry(Move.IRON_HEAD, 42),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH, 45),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 48),
                        new MoveLearnSetEntry(Move.POISON_JAB, "egg"),
                        new MoveLearnSetEntry(Move.CURSE, "egg"),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL, "egg"),
                        new MoveLearnSetEntry(Move.QUICK_GUARD, "egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT, "egg"),
                        new MoveLearnSetEntry(Move.MEGAHORN, "egg"),
                        new MoveLearnSetEntry(Move.SYNTHESIS, "egg")
                ),
                List.of(Label.OPAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .setAntiBiomes(Biome.IS_COLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
