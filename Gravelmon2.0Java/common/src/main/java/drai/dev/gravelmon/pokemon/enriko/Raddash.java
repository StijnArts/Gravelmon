package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Raddash extends drai.dev.gravelmon.pokemon.Pokemon {
    public Raddash() {
        super("Raddash",
                Type.GRASS,
                new Stats(55,
                        85,
                        40,
                        25,
                        40,
                        85),
                List.of(Ability.NATURAL_CURE,Ability.NO_GUARD,Ability.SHEER_FORCE), Ability.SHEER_FORCE,
                6, 165,
                new Stats(0,0,0,0,0,1), 240,
                0.85,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("It lives its live underground near clear bodies of water, only its leaves showing. If uprooted, it will retaliate with a flurry of kicks before running off at high speeds."),
                List.of(new EvolutionEntry("parceps", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))
                ),
                List.of(                  new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,5),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,11),
                        new MoveLearnSetEntry(Move.SYNTHESIS,18),
                        new MoveLearnSetEntry(Move.JUMP_KICK,25),
                        new MoveLearnSetEntry(Move.BOUNCE,30),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,36),
                        new MoveLearnSetEntry(Move.AGILITY,40),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,45),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,50)
                ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_CROPS),
                0.28, 0.3,
                List.of());
           setLangFileName("Raddash");

    }


}
