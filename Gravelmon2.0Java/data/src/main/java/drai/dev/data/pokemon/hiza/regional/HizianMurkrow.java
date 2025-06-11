package drai.dev.data.pokemon.hiza.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HizianMurkrow extends drai.dev.data.pokemon.Pokemon {
    public HizianMurkrow(String name, Aspect aspect) {
        super(name, aspect, "Murkrow",
                Type.FLYING, Type.GRASS,
                new Stats(60,
                        80,
                        42,
                        80,
                        42,
                        101),
                List.of(Ability.EARLY_BIRD), Ability.EARLY_BIRD,
                5, 165,
                new Stats(0,0,0,0,0,1), 30,
                0.5,
                81, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Many Murkrow can be seem circling crop fields in the morning, it is a sign that there are high quality crops ready to be harvested."),
                List.of(new EvolutionEntry("HizianHonchkrow", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dawn_stone")),
                List.of(                    new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,3),
                        new MoveLearnSetEntry(Move.ASTONISH,6),
                        new MoveLearnSetEntry(Move.PECK,9),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,12),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,15),
                        new MoveLearnSetEntry(Move.SYNTHESIS,18),
                        new MoveLearnSetEntry(Move.PLUCK,21),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,24),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,27),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,30),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,33),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,36)
                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(16)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Murkrow");
        setCanFly(true);
    }


}
