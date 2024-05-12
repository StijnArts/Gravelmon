package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Cubeat extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cubeat() {
        super("Cubeat",
                Type.SOUND,
                new Stats(55,
                        65,
                        50,
                        50,
                        50,
                        50),
                List.of(Ability.KLUTZ,Ability.GUTS), Ability.REVERB,
                6, 109,
                new Stats(0,1,0,0,0,0), 170,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("They sing softly for others to hear in the forest. If they get a big audience, Cubeat use the speakers on their body to amplify their sound."),
                List.of(new EvolutionEntry("raccoustic", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
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
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Cubeat");

    }


}
