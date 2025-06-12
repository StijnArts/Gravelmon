package drai.dev.data.pokemon.opalo;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Fungorse extends Pokemon {
    public Fungorse() {
        super("Fungorse",
                Type.GRASS, Type.FAIRY,
                new Stats(80,90,60,65,60,55),
                List.of(Ability.OVERGROW), Ability.RECKLESS,
                10, 590,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                164, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("cervantrier", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.VINE_WHIP, 5),
                        new MoveLearnSetEntry(Move.ROLLOUT, 8),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK, 11),
                        new MoveLearnSetEntry(Move.LEECH_SEED, 15),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF, 18),
                        new MoveLearnSetEntry(Move.STOMP, 23),
                        new MoveLearnSetEntry(Move.SYNTHESIS, 26),
                        new MoveLearnSetEntry(Move.LEAF_BLADE, 29),
                        new MoveLearnSetEntry(Move.MUD_SHOT, 34),
                        new MoveLearnSetEntry(Move.BULK_UP, 38),
                        new MoveLearnSetEntry(Move.IRON_HEAD, 42),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH, 46),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 50),
                        new MoveLearnSetEntry(Move.SACRED_SWORD, 56),
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
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .setAntiBiomes(Biome.IS_COLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
