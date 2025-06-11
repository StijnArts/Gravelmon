package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Visarab extends drai.dev.data.pokemon.Pokemon {
    public Visarab() {
        super("Visarab",
                Type.BUG, Type.DRAGON,
                new Stats(72,
                        135,
                        96,
                        100,
                        81,
                        116),
                List.of(Ability.INTIMIDATE,Ability.RECKLESS), Ability.WEAK_ARMOR,
                19, 733,
                new Stats(0,2,0,0,0,1), 45,
                0.5,
                270, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MONSTER),
                List.of("Because it has focused all of its saved energy into achieving evolution, it has a short lifespan. Its wings will turn red and glow faintly, casting its bone-white body in an ominous red light."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GILDEDSPEAR,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,7),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,11),
                        new MoveLearnSetEntry(Move.UPROAR,16),
                        new MoveLearnSetEntry(Move.SILVER_WIND,22),
                        new MoveLearnSetEntry(Move.STOMP,24),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,30),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,38),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,42),
                        new MoveLearnSetEntry(Move.MEGAHORN,50),
                        new MoveLearnSetEntry(Move.IRON_HEAD,58),
                        new MoveLearnSetEntry(Move.EARTH_POWER,66),
                        new MoveLearnSetEntry(Move.STONE_EDGE,72),
                        new MoveLearnSetEntry(Move.GILDEDSPEAR,85)           ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Visarab");

    }


}
