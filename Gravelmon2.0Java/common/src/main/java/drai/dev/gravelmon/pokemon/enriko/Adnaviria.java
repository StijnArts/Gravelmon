package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Adnaviria extends drai.dev.gravelmon.pokemon.Pokemon {
    public Adnaviria() {
        super("Adnaviria",
                Type.PSYCHIC,
                new Stats(55,
                        78,
                        55,
                        78,
                        66,
                        78),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Its strange, warped anatomy is the result of mutations in its genetic makeup. Its legs are surgically sharp and leave wounds completely sterile, making it a lifesaver in the operating room."),
                List.of(),
                List.of(                    new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.HEALING_WISH,1),
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.YAWN,13),
                        new MoveLearnSetEntry(Move.STORED_POWER,16),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,19),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,22),
                        new MoveLearnSetEntry(Move.HEAL_BELL,27),
                        new MoveLearnSetEntry(Move.UPROAR,32),
                        new MoveLearnSetEntry(Move.SAFEGUARD,37),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,42),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,47)),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 29, 42, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Adnaviria");

    }


}
