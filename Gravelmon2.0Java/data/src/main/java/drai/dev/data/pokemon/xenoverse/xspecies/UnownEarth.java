package drai.dev.data.pokemon.xenoverse.xspecies;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class UnownEarth extends Pokemon {
    public UnownEarth(String name, Aspect aspect) {
        super(name, aspect,"UnownEarth",
                Type.PSYCHIC,
                new Stats(48, 72, 48, 72, 48, 48),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                5, 50,
                new Stats(0,1,0,1,0,0), 225,
                0,
                118, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("Their appearance resembles the symbol in Dragalisk's mouth, which is why the Cardinals have considered them profane since time immemorial."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,1)
                ),
                List.of(Label.XENOVERSE, Label.GEN2),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 12, 20, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.END_CITY),
                0.29, 0.3,
                List.of());
        this.setLangFileName("Unown");

    }
}
