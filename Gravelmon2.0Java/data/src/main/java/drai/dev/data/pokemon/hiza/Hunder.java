package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hunder extends drai.dev.data.pokemon.Pokemon {
    public Hunder() {
        super("Hunder",
                Type.ELECTRIC,
                new Stats(50,
                        87,
                        70,
                        77,
                        60,
                        80),
                List.of(Ability.MOXIE,Ability.DEFIANT,Ability.TOUGH_CLAWS), Ability.TOUGH_CLAWS,
                10, 165,
                new Stats(0,0,0,0,0,2), 120,
                0.5,
                140, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("They live in small packs lead by the strongest one. Those packs are known to invade powerplants to chew on cables and other electricity sources."),
                List.of(new EvolutionEntry("voyote", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:thunder_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,5),
                        new MoveLearnSetEntry(Move.HOWL,9),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,17),
                        new MoveLearnSetEntry(Move.CHARGE,21),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,26),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,35),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,43)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 21, 34, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.IS_RAINING,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hunder");

    }


}
