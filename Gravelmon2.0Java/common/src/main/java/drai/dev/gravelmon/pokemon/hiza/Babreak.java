package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Babreak extends drai.dev.gravelmon.pokemon.Pokemon {
    public Babreak() {
        super("Babreak",
                Type.DARK, Type.FIGHTING,
                new Stats(50,
                        85,
                        55,
                        65,
                        65,
                        80),
                List.of(Ability.QUICK_FEET), Ability.HUSTLE,
                12, 165,
                new Stats(0,2,0,0,0,0), 120,
                0.5,
                137, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Babreak will intimidate and pick on smaller Pokemon to steal their food, however if they attempt to fight back they are quick to run away."),
                List.of(new EvolutionEntry("babroote", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.ASSURANCE,8),
                        new MoveLearnSetEntry(Move.LOW_KICK,12),
                        new MoveLearnSetEntry(Move.SWAGGER,15),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,17),
                        new MoveLearnSetEntry(Move.UPROAR,20),
                        new MoveLearnSetEntry(Move.BEAT_UP,24),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,30),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,36),
                        new MoveLearnSetEntry(Move.THRASH,44),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,49),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,56),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,59)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 25, 45, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Babreak");

    }


}
