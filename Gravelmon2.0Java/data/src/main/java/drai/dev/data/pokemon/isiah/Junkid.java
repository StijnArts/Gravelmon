package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Junkid extends drai.dev.data.pokemon.Pokemon {
    public Junkid() {
        super("Junkid",
                Type.STEEL,
                new Stats(50,
                        65,
                        100,
                        23,
                        40,
                        12),
                List.of(Ability.WEAK_ARMOR,Ability.HEATPROOF,Ability.HEAVY_METAL), Ability.HEAVY_METAL,
                8, 165,
                new Stats(0,0,1,0,0,0), 190,
                0.0,
                58, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Comprised of pieces of junk screwed together and given life, Junkid are typically timid until approached gingerly. They love to be fed small pieces of discarded garbage."),
                List.of(),
                List.of(),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Junkid");

    }


}
