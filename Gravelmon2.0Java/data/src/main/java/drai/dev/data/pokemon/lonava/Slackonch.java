package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Slackonch extends drai.dev.data.pokemon.Pokemon {
    public Slackonch() {
        super("Slackonch",
                Type.WATER,
                new Stats(78,
                        22,
                        78,
                        22,
                        78,
                        22),
                List.of(Ability.DREAMER), Ability.DREAMER,
                3, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A peaceful inhabitant of the sea who rarely moves. Its shell is covered with fuzzy algae, giving it a soft texture."),
                List.of(),
                List.of(                new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,7),
                        new MoveLearnSetEntry(Move.MUD_SPORT,9),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,12),
                        new MoveLearnSetEntry(Move.HEADBUTT,15),
                        new MoveLearnSetEntry(Move.WATER_PULSE,20),
                        new MoveLearnSetEntry(Move.ASSURANCE,25),
                        new MoveLearnSetEntry(Move.SWAGGER,29),
                        new MoveLearnSetEntry(Move.BODY_SLAM,33),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,39),
                        new MoveLearnSetEntry(Move.WORK_UP,42),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,47),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,53),
                        new MoveLearnSetEntry(Move.THRASH,59)         ),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Slackonch");

    }


}
