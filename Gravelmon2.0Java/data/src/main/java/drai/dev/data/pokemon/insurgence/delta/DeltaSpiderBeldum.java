package drai.dev.data.pokemon.insurgence.delta;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class DeltaSpiderBeldum extends Pokemon {
    public DeltaSpiderBeldum(String name, Aspect aspect) {
        super(name, aspect,"DeltaSpiderBeldum",
                Type.GROUND, Type.BUG,
                new Stats(40, 55, 80, 35, 60, 30),
                List.of(Ability.POISON_TOUCH, Ability.IMMUNITY), Ability.POISON_HEAL,
                6, 476,
                new Stats(0,0,1,0,0,0), 3,
                -1,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DELTA),
                List.of("A Delta Species discovered by Zero_Breaker. It builds webs in trees, ensnaring prey, and then subdues them with its venom."),
                List.of(new EvolutionEntry("deltaspidermetang", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUG_BITE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,5),
                        new MoveLearnSetEntry(Move.SPIDER_WEB,15),
                        new MoveLearnSetEntry(Move.STICKY_WEB,30),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tutor"),
                        new MoveLearnSetEntry(Move.HOLD_BACK,"tutor"),
                        new MoveLearnSetEntry(Move.STRING_SHOT,"tutor"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tutor")
                        ),
                List.of(Label.GEN3,Label.INSURGENCE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Beldum");
    }
}
