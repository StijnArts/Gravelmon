package drai.dev.gravelmon.pokemon.ionos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Marbelous extends drai.dev.gravelmon.pokemon.Pokemon {
    public Marbelous() {
        super("Marbelous",
                Type.ROCK, Type.FIGHTING,
                new Stats(60,
                        69,
                        117,
                        50,
                        91,
                        40),
                List.of(Ability.MAGIC_BOUNCE,Ability.ROCK_HEAD), Ability.IRON_FIST,
                9, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("This Pokémon lingers in the past and imagines itself as a guard of royal a palace. Truth is however that Marbelous hobbles among the ruins of destroyed buildings from a long time ago, all by itself. The marble shield on its right side has the shape of a wheel of cheese and doesn't need carrying."),
                List.of(new EvolutionEntry("destructos", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,"\""+Move.BULK_UP.getName()+"\"")))	),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.DETECT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.REVERSAL,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,5),
                        new MoveLearnSetEntry(Move.COUNTER,11),
                        new MoveLearnSetEntry(Move.AMNESIA,17),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,23),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,27),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,30),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,35),
                        new MoveLearnSetEntry(Move.BULK_UP,36),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,42),
                        new MoveLearnSetEntry(Move.SAND_TOMB,47),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,52),
                        new MoveLearnSetEntry(Move.SUPERPOWER,60),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,"tm")                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 27, 38, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPRING))
                ), List.of(),
                List.of(SpawnPreset.TRAIL_RUINS),
                0.28, 0.3,
                List.of());
           setLangFileName("Marbelous");

    }


}
