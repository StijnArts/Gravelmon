package drai.dev.data.pokemon.tokas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scuddle extends drai.dev.data.pokemon.Pokemon {
    public Scuddle() {
        super("Scuddle",
                Type.WATER, Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.HARVEST), Ability.FRIEND_GUARD,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Water GunSTAB Water - BubbleSTAB Water - Charm Fairy 6 Razor LeafSTAB Grass 8 Tackle Normal 10 Fake Tears Dark 10 Return Normal 11 Double Slap Normal 20 Snore Normal 44 Grass Whistle Grass 44 Bubble BeamSTAB Water 47 Protect Normal 77 CrabhammerSTAB Water 100 Attract Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,6),
                        new MoveLearnSetEntry(Move.TACKLE,8),
                        new MoveLearnSetEntry(Move.RETURN,10),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,10),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,11),
                        new MoveLearnSetEntry(Move.SNORE,20),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,44),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,44),
                        new MoveLearnSetEntry(Move.PROTECT,47),
                        new MoveLearnSetEntry(Move.CRABHAMMER,77),
                        new MoveLearnSetEntry(Move.ATTRACT,100)                        ),
                List.of(Label.TOKAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Scuddle");

    }


}
