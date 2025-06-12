package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AyreianCaterpie extends Pokemon {
    public AyreianCaterpie(String name, Aspect aspect) {
        super(name, aspect,"AyreianCaterpie",
                Type.BUG, Type.ELECTRIC,
                new Stats(50,30,35,45,35,20),
                List.of(Ability.SHIELD_DUST), Ability.RUN_AWAY,
                3, 29,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                39, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("For protection, it releases a horrible stench from the antenna on its head to drive away enemies."),
                List.of(new EvolutionEntry("ayreianmetapod", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"10")))),
                List.of(
                        new MoveLearnSetEntry(Move.PURSUIT, 1),
                        new MoveLearnSetEntry(Move.STRING_SHOT, 1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, 3),
                        new MoveLearnSetEntry(Move.ELECTROWEB, 7),

                        new MoveLearnSetEntry(Move.BUG_BITE, "tutor"),
                        new MoveLearnSetEntry(Move.ELECTROWEB, "tutor")
                ),
                List.of(Label.GEN1,Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(2)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Caterpie");
    }
}
