package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hullk extends drai.dev.data.pokemon.Pokemon {
    public Hullk() {
        super("Hullk",
                Type.STEEL, Type.FIRE,
                new Stats(127,
                        67,
                        191,
                        109,
                        53,
                        23),
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                58, 0,
                new Stats(0,0,3,0,0,0), 45,
                0.0,
                231, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Codename: UB-027 Titan. A member of an Ultra Beast family. It's flames that burn from it's presumed mouth never peter out, even in rain. It can emit such a bright light that it can give the illusion of a sunrise at midnight."),
                List.of(),
                List.of(         new MoveLearnSetEntry(Move.ANCIENT_POWER,1),
                        new MoveLearnSetEntry(Move.LOCKON,1),
                        new MoveLearnSetEntry(Move.INCINERATE,1),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,10),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,19),
                        new MoveLearnSetEntry(Move.WILLOWISP,28),
                        new MoveLearnSetEntry(Move.IRON_HEAD,37),
                        new MoveLearnSetEntry(Move.INFERNO,46),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,55),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,64),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,73)               ),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .abnormality()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Hullk");

    }


}
