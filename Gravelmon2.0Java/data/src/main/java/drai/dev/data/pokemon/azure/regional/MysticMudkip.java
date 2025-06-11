package drai.dev.data.pokemon.azure.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class MysticMudkip extends Pokemon {
    public MysticMudkip(String name, Aspect aspect) {
        super(name, aspect,"MysticMudkip",
                Type.FIGHTING,
                new Stats(50, 70, 50, 40, 50, 50),
                List.of(Ability.IMMUNITY), Ability.INNER_FOCUS,
                4, 76,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.MONSTER),
                List.of(""),
                List.of(new EvolutionEntry("mysticmarshtomp", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ARM_THRUST,4),
                        new MoveLearnSetEntry(Move.TWISTER,8),
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,12),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,16),
                        new MoveLearnSetEntry(Move.WORK_UP,20),
                        new MoveLearnSetEntry(Move.SLASH,24),
                        new MoveLearnSetEntry(Move.VITAL_THROW,28),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,33),
                        new MoveLearnSetEntry(Move.BODY_SLAM,36),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,40),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,44),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,44),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,48)

                        ),
                List.of(Label.GEN3,Label.AZURE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Mudkip");
    }
}
