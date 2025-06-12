package drai.dev.data.pokemon.flux.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AlteranLedian extends Pokemon {
    public AlteranLedian(String name, Aspect aspect) {
        super(name, aspect,"AlteranLedian",
                Type.BUG, Type.FIGHTING,
                new Stats(55, 85, 45, 40, 80, 85),
                List.of(Ability.SWARM, Ability.IRON_FIST), Ability.JUSTIFIED,
                13, 520,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                137, ExperienceGroup.MEDIUM_SLOW,
                70,
                51, List.of(EggGroup.BUG),
                List.of("LEDIAN in Altera display unique patterns and behavior. It recklessly charges into battle, channeling star energy into its kicks and punches."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,1),
                        new MoveLearnSetEntry(Move.SILVER_WIND,1),
                        new MoveLearnSetEntry(Move.AIR_SLASH,1),
                        new MoveLearnSetEntry(Move.AGILITY,1),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,1),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,1),
                        new MoveLearnSetEntry(Move.SWIFT,1),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,15),
                        new MoveLearnSetEntry(Move.REFLECT,15),
                        new MoveLearnSetEntry(Move.SAFEGUARD,15),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,21),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,26),
                        new MoveLearnSetEntry(Move.BATON_PASS,32),
                        new MoveLearnSetEntry(Move.LUNGE,37),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,43),
                        new MoveLearnSetEntry(Move.METEOR_MASH,48),
                        new MoveLearnSetEntry(Move.WISH,54),
                        new MoveLearnSetEntry(Move.WISH,"egg"),
                        new MoveLearnSetEntry(Move.SCREECH,"egg")
                        ),
                List.of(Label.FLUX, Label.GEN2),
                0, List.of(),
                new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(18)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_ARID)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Ledian");

        addAdditionalEvolution("ledyba", new EvolutionEntry("ledian alteran", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18"))));
    }
}
