package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Voyote extends drai.dev.gravelmon.pokemon.Pokemon {
    public Voyote() {
        super("Voyote",
                Type.ELECTRIC,
                new Stats(70,
                        100,
                        80,
                        92,
                        65,
                        108),
                List.of(Ability.MOXIE,Ability.DEFIANT,Ability.TOUGH_CLAWS), Ability.TOUGH_CLAWS,
                8, 165,
                new Stats(0,0,0,0,0,3), 45,
                0.5,
                218, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Voyote claws are developed to tear up metal and find power cables. Its saliva can shock and paralyze on contact."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER,1)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Voyote");

    }


}
