package drai.dev.data.pokemon.okeno;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Frigivurr extends drai.dev.data.pokemon.Pokemon {
    public Frigivurr() {
        super("Frigivurr",
                Type.ICE,Type.GHOST,
                new Stats(58,
                        89,
                        55,
                        119,
                        68,
                        97),
                List.of(Ability.SOUNDPROOF,Ability.UNNERVE), Ability.INSOMNIA,
                12, 0,
                new Stats(0,0,0,1,0,1), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("When hanging from cave ceilings, this Pokémon's glowing ears mimic a nightmarish face. If disturbed, it will encase whatever bothered it in ice."),
                List.of(),
                List.of(                    ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 31, 49, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Frigivurr");

    }


}
