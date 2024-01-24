package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Twirpant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Twirpant() {
        super("Twirpant",
                Type.BUG,Type.FIGHTING,
                new Stats(55,
                        70,
                        65,
                        35,
                        35,
                        50),
                List.of(Ability.INNER_FOCUS,Ability.DEFIANT,Ability.FRISK), Ability.FRISK,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Twirpant will train 24/7 and go through some of the harshest physical training ever just to get stronger. Some will even train to the point of fainting. Armies of them train hard to protect its nest from invading Dartibi."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Twirpant");

    }


}
