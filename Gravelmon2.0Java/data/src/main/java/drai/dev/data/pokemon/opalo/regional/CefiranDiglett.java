package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranDiglett extends Pokemon {
    public CefiranDiglett(String name, Aspect aspect) {
        super(name, aspect,"CefiranDiglett",
                Type.GROUND, Type.FLYING,
                new Stats(30,60,35,95,35,45),
                List.of(Ability.ANTICIPATION), Ability.SAND_FORCE,
                2, 8,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                53, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("cefirandugtrio", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"26")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK, 1),
                        new MoveLearnSetEntry(Move.GROWL, 4),
                        new MoveLearnSetEntry(Move.ASTONISH, 7),
                        new MoveLearnSetEntry(Move.MUDSLAP, 12),
                        new MoveLearnSetEntry(Move.MAGNITUDE, 15),
                        new MoveLearnSetEntry(Move.AIR_CUTTER, 18),
                        new MoveLearnSetEntry(Move.WEATHER_BALL, 23),
                        new MoveLearnSetEntry(Move.MUD_BOMB, 26),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, 29),
                        new MoveLearnSetEntry(Move.AIR_SLASH, 37),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD, 40),
                        new MoveLearnSetEntry(Move.FISSURE, 45),

                        new MoveLearnSetEntry(Move.ANCIENT_POWER, "egg"),
                        new MoveLearnSetEntry(Move.ASTONISH, "egg"),
                        new MoveLearnSetEntry(Move.BEAT_UP, "egg"),
                        new MoveLearnSetEntry(Move.ENDURE, "egg"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, "egg"),
                        new MoveLearnSetEntry(Move.RETURN, "egg"),
                        new MoveLearnSetEntry(Move.HEADBUTT, "egg"),
                        new MoveLearnSetEntry(Move.MEMENTO, "egg"),
                        new MoveLearnSetEntry(Move.MUD_BOMB, "egg"),
                        new MoveLearnSetEntry(Move.PURSUIT, "egg"),
                        new MoveLearnSetEntry(Move.REVERSAL, "egg"),
                        new MoveLearnSetEntry(Move.SCREECH, "egg"),
                        new MoveLearnSetEntry(Move.UPROAR, "egg")
                ),
                List.of(Label.GEN1,Label.OPAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(5)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Diglett");
    }
}
