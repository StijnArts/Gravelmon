package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Andracarina extends drai.dev.data.pokemon.Pokemon {
    public Andracarina() {
        super("Andracarina",
                Type.FLYING, Type.POISON,
                new Stats(211,
                        41,
                        83,
                        89,
                        103,
                        43),
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                18, 0,
                new Stats(3,0,0,0,0,0), 30,
                0.0,
                257, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Codename: UB-026 Nebula. One of the Ultra Beasts. Inside its cloudy body is a gigantic cloud of colorful yet highly corrosive gas. It leaves trails of shrivelled plants in it's wake."),
                List.of(),
                List.of(           new MoveLearnSetEntry(Move.MOONBLAST,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.BITE,7),
                        new MoveLearnSetEntry(Move.ACID,11),
                        new MoveLearnSetEntry(Move.PURSUIT,14),
                        new MoveLearnSetEntry(Move.POISON_FANG,19),
                        new MoveLearnSetEntry(Move.SLAM,22),
                        new MoveLearnSetEntry(Move.GLARE,25),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,35),
                        new MoveLearnSetEntry(Move.COIL,41),
                        new MoveLearnSetEntry(Move.TAILWIND,46),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,51),
                        new MoveLearnSetEntry(Move.MOONLIGHT,55),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,60),
                        new MoveLearnSetEntry(Move.HURRICANE,70)             ),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .abnormality()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Andracarina");

    }


}
