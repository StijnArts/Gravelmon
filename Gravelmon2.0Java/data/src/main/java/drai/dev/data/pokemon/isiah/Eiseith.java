package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Eiseith extends drai.dev.data.pokemon.Pokemon {
    public Eiseith() {
        super("Eiseith",
                Type.FIRE, Type.ELECTRIC,
                new Stats(111,
                        72,
                        131,
                        131,
                        124,
                        97
                ),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                37, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,1),
                        new MoveLearnSetEntry(Move.FIRE_PLEDGE,1),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,6),
                        new MoveLearnSetEntry(Move.EMBER,10),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,13),
                        new MoveLearnSetEntry(Move.SPARK,19),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,22),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,28),
                        new MoveLearnSetEntry(Move.SWIFT,31),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,37),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,40),
                        new MoveLearnSetEntry(Move.NATURE_POWER,46),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,49),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,55),
                        new MoveLearnSetEntry(Move.THUNDER,58)
                ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .legend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Eiseith");

    }


}
