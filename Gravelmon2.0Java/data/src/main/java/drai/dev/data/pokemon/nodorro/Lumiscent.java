package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lumiscent extends drai.dev.data.pokemon.Pokemon {
    public Lumiscent() {
        super("Lumiscent",
                Type.GRASS, Type.LIGHT,
                new Stats(75,
                        80,
                        65,
                        110,
                        80,
                        80),
                List.of(Ability.CHLOROPHYLL), Ability.CHLOROPHYLL,
                9, 6,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Evo Cleansing Light Light - Luminous BlastSTAB Light - Cleansing Light Light - Petal BlizzardSTAB Grass - Moonlight Fairy - Moonblast Fairy 45 Luminous BlastSTAB Light 49 Holy Blessing Light 54 Tail Glow Bug 61 Petal BlizzardSTAB Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MOONLIGHT,1),
                        new MoveLearnSetEntry(Move.CLEANSINGLIGHT,1),
                        new MoveLearnSetEntry(Move.MOONBLAST,1),
                        new MoveLearnSetEntry(Move.LUMINOUSBLAST,45),
                        new MoveLearnSetEntry(Move.HOLYBLESSING,49),
                        new MoveLearnSetEntry(Move.TAIL_GLOW,54),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,61)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_FLORAL).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Lumiscent");
        addAdditionalEvolution("gloom", new EvolutionEntry("lumiscent", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"gravelmon:astral_stone"));
    }


}
