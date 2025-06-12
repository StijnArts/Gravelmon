package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanGoodra extends drai.dev.data.pokemon.Pokemon {
    public VesitanGoodra(String name, Aspect aspect) {
        super(name, aspect, "VesitanGoodra",
                Type.DRAGON,Type.PSYCHIC,
                new Stats(87,
                        100,
                        89,
                        77,
                        140,
                        100),
                List.of(Ability.SAP_SIPPER,Ability.HYDRATION), null,
                20, 1505,
                new Stats(0,0,0,0,0,3), 20,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Es greift den Gegner mit ausfahrbaren Fühlern an. Aufgrund seiner Blindheit benutzt es diese ebenfalls zur Orientierung und Naruhngssuche."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.FLAIL,28),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.OUTRAGE,63),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,47),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,38),
                        new MoveLearnSetEntry(Move.FEINT,1),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,25),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,18),
                        new MoveLearnSetEntry(Move.PROTECT,9),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,54),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,59),
                        new MoveLearnSetEntry(Move.BIDE,13),
                        new MoveLearnSetEntry(Move.BODY_SLAM,32),
                        new MoveLearnSetEntry(Move.ABSORB,5),
                        new MoveLearnSetEntry(Move.PSYSTRIKE,50)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Goodra");

    }


}
