package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class WoggleJr extends drai.dev.data.pokemon.Pokemon {
    public WoggleJr() {
        super("WoggleJr",
                Type.FIGHTING,
                new Stats(125,
                        75,
                        70,
                        25,
                        60,
                        65),
                List.of(Ability.THICK_FAT), Ability.HUGE_POWER,
                8, 165,
                new Stats(1,0,0,0,0,0), 45,
                0.85,
                80, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("(Grease type.) Woggle Jr. communities live a secluded life away from all other Pokemon. It is difficult to find one away from its family."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BULK_UP,1),
                        new MoveLearnSetEntry(Move.DETECT,5),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,9),
                        new MoveLearnSetEntry(Move.GLARE,14),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,17),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,24),
                        new MoveLearnSetEntry(Move.AMNESIA,29),
                        new MoveLearnSetEntry(Move.BOUNCE,34),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,39),
                        new MoveLearnSetEntry(Move.SUPERPOWER,45)                        ),
                List.of(Label.ENRIKO, Label.JOKE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Woggle Jr.");

    }


}
