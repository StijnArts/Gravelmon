package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Velosoil extends drai.dev.gravelmon.pokemon.Pokemon {
    public Velosoil() {
        super("Velosoil",
                Type.DRAGON, Type.ROCK,
                new Stats(25,
                        90,
                        65,
                        55,
                        45,
                        35),
                List.of(Ability.ROCK_HEAD,Ability.STURDY,Ability.SHEER_FORCE), Ability.SHEER_FORCE,
                6, 165,
                new Stats(0,0,0,0,0,0), 105,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Eating minerals from rock formations is part of their healthy diet. It can chew a tunnel all the way through earth's mantle due to it's tough, heat-resistant skin. The eggs they hatch from are hard like rocks."),
                List.of(new EvolutionEntry("rapterra", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,5),
                        new MoveLearnSetEntry(Move.HEADBUTT,11),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,15),
                        new MoveLearnSetEntry(Move.SCREECH,21),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,25),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,31),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,35),
                        new MoveLearnSetEntry(Move.CRUNCH,41),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,45),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,51),
                        new MoveLearnSetEntry(Move.BODY_SLAM,55),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,61)                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 9, 29, 8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Velosoil");

    }


}
