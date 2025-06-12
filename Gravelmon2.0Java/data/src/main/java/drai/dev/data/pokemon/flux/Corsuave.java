package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Corsuave extends Pokemon {
    public Corsuave() {
        super("Corsuave",
                Type.DARK, Type.FLYING,
                new Stats(51,
                        63,
                        45,
                        80,
                        57,
                        69),
                List.of(Ability.PICKUP), Ability.PICKPOCKET,
                7, 150,
                new Stats(0,0,0,2,0,0), 120,
                0.5,
                128, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.FLYING),
                List.of("CORSUAVE are intelligent Pokemon employing cunning strategies to defeat enemies or evade threats. This nature makes them difficult to work with."),
                List.of(/*new EvolutionEntry("corsuave", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))*/),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.SWITCHEROO,1),
                        new MoveLearnSetEntry(Move.THIEF,1),
                        new MoveLearnSetEntry(Move.PLUCK,1),
                        new MoveLearnSetEntry(Move.MIMIC,12),
                        new MoveLearnSetEntry(Move.BEAT_UP,15),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,22),
                        new MoveLearnSetEntry(Move.AIR_SLASH,27),
                        new MoveLearnSetEntry(Move.PSYCH_UP,32),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,37),
                        new MoveLearnSetEntry(Move.HURRICANE,44),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,49),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,"egg"),
                        new MoveLearnSetEntry(Move.DRILL_PECK,"egg"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"egg")
                ),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(16)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST, Biome.IS_PLAINS)
    .setAntiBiomes(Biome.IS_COLD)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
    }
}
