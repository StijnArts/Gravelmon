package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanHooh extends drai.dev.data.pokemon.Pokemon {
    public FormanHooh(String name, Aspect aspect) {
        super(name, aspect, "FormanHooh",
                Type.ICE,Type.FAIRY,
                new Stats(148,
                        52,
                        114,
                        153,
                        148,
                        63),
                List.of(Ability.BLESSINGAIR), null,
                46, 0,
                new Stats(0,0,0,0,0,0), 3,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .legend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GLACIAL)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Ho-oh");

    }


}
