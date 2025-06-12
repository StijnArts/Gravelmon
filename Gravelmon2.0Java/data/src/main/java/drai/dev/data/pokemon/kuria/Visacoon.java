package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Visacoon extends drai.dev.data.pokemon.Pokemon {
    public Visacoon() {
        super("Visacoon",
                Type.BUG, Type.DRAGON,
                new Stats(52,
                        75,
                        106,
                        70,
                        86,
                        31),
                List.of(Ability.INTIMIDATE,Ability.OVERCOAT), Ability.WEAK_ARMOR,
                11, 547,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                147, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It uses the same scare trick as Wurmidrake to ward off predators. Its shell has shaped itself to produce a more convincing image. It peers unblinking from within its cocoon, patiently awaiting evolution."),
                List.of(new EvolutionEntry("visarab", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"52")))),
                List.of(             new MoveLearnSetEntry(Move.GILDEDSPEAR,1),
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
                ), new PokemonSpawnDataBuilder(2)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Visacoon");

    }


}
