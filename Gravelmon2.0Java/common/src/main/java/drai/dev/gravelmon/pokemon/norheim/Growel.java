package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Growel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Growel() {
        super("Growel",
                Type.GRASS,Type.ROCK,
                new Stats(60,
                        80,
                        90,
                        70,
                        73,
                        45),
                List.of(Ability.OVERGROW,Ability.DAMP,Ability.ROCK_HEAD), Ability.ROCK_HEAD,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG,EggGroup.WATER_3),
                List.of("Growel are incredibly rare in the wild in relation to its pre evolved form. Considered ancient warriors of the great forests of Norheim, Growel practices stealth tactics like no other Pokemon."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Growel");

    }


}
