package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tenkoi extends drai.dev.data.pokemon.Pokemon {
    public Tenkoi() {
        super("Tenkoi",
                Type.FAIRY,Type.GHOST,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.DEFIANT,Ability.ROUGH_SKIN), Ability.MARVEL_SCALE,
                6, 40,
                new Stats(0,0,0,0,0,0), 150,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Based on: Scapanorhynchus"),
                List.of(new EvolutionEntry("tenchondri", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.SOULCHOMP,1),
                        new MoveLearnSetEntry(Move.SHEDFANGS,1),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,1),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_CHERRY_GROVE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Tenkoi");

    }


}
