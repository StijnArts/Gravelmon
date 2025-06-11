package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranSmeargle extends Pokemon {
    public CefiranSmeargle(String name, Aspect aspect) {
        super(name, aspect,"CefiranSmeargle",
                Type.NORMAL, Type.FIGHTING,
                new Stats(55,20,35,75,20,45),
                List.of(Ability.PRANKSTER), Ability.MOODY,
                12, 580,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                88, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SKETCH, 1),
                        new MoveLearnSetEntry(Move.SKETCH, 11),
                        new MoveLearnSetEntry(Move.SKETCH, 21),
                        new MoveLearnSetEntry(Move.SKETCH, 31),
                        new MoveLearnSetEntry(Move.SKETCH, 41),
                        new MoveLearnSetEntry(Move.CARICATURE, 50),
                        new MoveLearnSetEntry(Move.SKETCH, 51),
                        new MoveLearnSetEntry(Move.SKETCH, 61),
                        new MoveLearnSetEntry(Move.SKETCH, 71),
                        new MoveLearnSetEntry(Move.SKETCH, 81),
                        new MoveLearnSetEntry(Move.SKETCH, 91)
                ),
                List.of(Label.GEN2,Label.OPAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(11)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
        this.setLangFileName("Smeargle");
    }
}
