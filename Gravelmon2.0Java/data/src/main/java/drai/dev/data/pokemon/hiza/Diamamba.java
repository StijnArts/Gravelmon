package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Diamamba extends drai.dev.data.pokemon.Pokemon {
    public Diamamba() {
        super("Diamamba",
                Type.POISON, Type.STEEL,
                new Stats(55,
                        70,
                        140,
                        70,
                        140,
                        60),
                List.of(Ability.ROUGH_SKIN), Ability.ROUGH_SKIN,
                8, 165,
                new Stats(0,0,1,1,1,0), 45,
                0.5,
                221, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.DRAGON),
                List.of("Rattletack who didn't shed its skin enough will have it harden and become Diamamba. Its fangs are hard as diamond and can pierce through the hardest armor."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.WRAP,3),
                        new MoveLearnSetEntry(Move.LICK,7),
                        new MoveLearnSetEntry(Move.ACID,10),
                        new MoveLearnSetEntry(Move.GLARE,14),
                        new MoveLearnSetEntry(Move.POISON_TAIL,19),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,24),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,28),
                        new MoveLearnSetEntry(Move.POISON_FANG,31),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,35),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,38),
                        new MoveLearnSetEntry(Move.WRING_OUT,45),
                        new MoveLearnSetEntry(Move.COIL,49),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,57)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(42)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Diamamba");

    }


}
