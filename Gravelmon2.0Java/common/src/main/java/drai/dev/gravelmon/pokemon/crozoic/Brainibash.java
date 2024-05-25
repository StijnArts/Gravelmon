package drai.dev.gravelmon.pokemon.crozoic;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Brainibash extends drai.dev.gravelmon.pokemon.Pokemon {
    public Brainibash() {
        super("Brainibash",
                Type.PSYCHIC, Type.FIGHTING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.ROCK_HEAD,Ability.TELEPATHY), Ability.ANALYTIC,
                10, 220,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("They compete in battles of both strength and wit. When they clash their heads together, they create a psychic field that absorbs the impact."),
                List.of(new EvolutionEntry("brainiache", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,"\""+Move.ZEN_HEADBUTT.getName()+"\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.SIMPLE_BEAM,1),
                        new MoveLearnSetEntry(Move.SKULL_BASH,1),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,1),
                        new MoveLearnSetEntry(Move.BREAKDOWN,1),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,1),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,28),
                        new MoveLearnSetEntry(Move.AMNESIA,1),
                        new MoveLearnSetEntry(Move.HEADBUTT,1),
                        new MoveLearnSetEntry(Move.DETECT,1),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 12, 26, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS, Biome.IS_LUSH))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Brainibash");

    }


}
