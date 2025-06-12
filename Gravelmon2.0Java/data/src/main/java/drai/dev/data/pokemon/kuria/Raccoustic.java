package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Raccoustic extends drai.dev.data.pokemon.Pokemon {
    public Raccoustic() {
        super("Raccoustic",
                Type.SOUND, Type.DARK,
                new Stats(75,
                        80,
                        65,
                        65,
                        65,
                        80),
                List.of(Ability.HUSTLE,Ability.GUTS), Ability.REVERB,
                12, 254,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                114, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Raccoustic's sound has evolved to be more grunge than when it was younger. The sounds it creates are unappealing and can cause devastating damage if played too loudly."),
                List.of(new EvolutionEntry("grizzwave", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40"))),
                        new EvolutionEntry("osbearne", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.TAILWIND, 1),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE, 1),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN, 1),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR, 1),
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK, 1),
                        new MoveLearnSetEntry(Move.TAUNT, 1),
                        new MoveLearnSetEntry(Move.ROUND, 12),
                        new MoveLearnSetEntry(Move.METAL_SOUND, 19),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, 24),
                        new MoveLearnSetEntry(Move.HYPER_VOICE, 30),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, 38),
                        new MoveLearnSetEntry(Move.HURRICANE, 46),
                        new MoveLearnSetEntry(Move.OVERDRIVE, 54),
                        new MoveLearnSetEntry(Move.BOOMBURST, 62)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(21)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Raccoustic");

    }


}
