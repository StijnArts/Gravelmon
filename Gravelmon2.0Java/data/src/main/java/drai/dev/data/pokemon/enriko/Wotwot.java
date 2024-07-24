package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Wotwot extends drai.dev.data.pokemon.Pokemon {
    public Wotwot() {
        super("Wotwot",
                Type.DARK, Type.FIGHTING,
                new Stats(80,
                        92,
                        70,
                        70,
                        70,
                        75),
                List.of(Ability.GUTS,Ability.NO_GUARD,Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                15, 165,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.MONSTER),
                List.of("Wotwot will do the bidding of whatever they look up to, no matter how dark or unsafe the job is. For this reason, they're often stereotyped as 'evil' Pokemon."),
                List.of(new EvolutionEntry("dunnoboss", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME, "\"night\"")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SNARL,5),
                        new MoveLearnSetEntry(Move.TAUNT,9),
                        new MoveLearnSetEntry(Move.ARM_THRUST,15),
                        new MoveLearnSetEntry(Move.DETECT,19),
                        new MoveLearnSetEntry(Move.RETALIATE,22),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,29),
                        new MoveLearnSetEntry(Move.BULK_UP,34),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,38),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,42),
                        new MoveLearnSetEntry(Move.DARKEST_LARIAT,47),
                        new MoveLearnSetEntry(Move.BLOCK,51),
                        new MoveLearnSetEntry(Move.GLARE,56)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 7, 29, 5.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Wotwot");

    }


}
