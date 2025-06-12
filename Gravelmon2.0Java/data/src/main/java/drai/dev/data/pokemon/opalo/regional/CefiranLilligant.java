package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranLilligant extends Pokemon {
    public CefiranLilligant(String name, Aspect aspect) {
        super(name, aspect,"CefiranLilligant",
                Type.GRASS, Type.POISON,
                new Stats(70,60,75,90,110,75),
                List.of(Ability.PRANKSTER, Ability.OWN_TEMPO), Ability.LEAF_GUARD,
                11, 163,
                new Stats(0,0,0,2,0,0), 75,
                0,
                220, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SLUDGE, 1),
                        new MoveLearnSetEntry(Move.GROWTH, 1),
                        new MoveLearnSetEntry(Move.LEECH_SEED, 1),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN, 1),
                        new MoveLearnSetEntry(Move.SYNTHESIS, 1),
                        new MoveLearnSetEntry(Move.TEETER_DANCE, 10),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE, 28),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, 36),
                        new MoveLearnSetEntry(Move.PETAL_DANCE, 46),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE, 55),
                        new MoveLearnSetEntry(Move.VENOSHOCK, 60),
                        new MoveLearnSetEntry(Move.TACKLE, "egg"),
                        new MoveLearnSetEntry(Move.CHARM, "egg"),
                        new MoveLearnSetEntry(Move.ENDURE, "egg"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE, "egg"),
                        new MoveLearnSetEntry(Move.HEALING_WISH, "egg"),
                        new MoveLearnSetEntry(Move.INGRAIN, "egg"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "egg"),
                        new MoveLearnSetEntry(Move.SWEET_SCENT, "egg"),
                        new MoveLearnSetEntry(Move.WORRY_SEED, "egg")
                ),
                List.of(Label.GEN5,Label.OPAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(27)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CHERRY_GROVE)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Lilligant");
    }
}
