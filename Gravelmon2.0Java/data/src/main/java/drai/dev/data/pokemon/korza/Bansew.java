package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bansew extends drai.dev.data.pokemon.Pokemon {
    public Bansew() {
        super("Bansew",
                Type.GHOST,Type.FAIRY,
                new Stats(55,
                        55,
                        60,
                        75,
                        40,
                        50),
                List.of(Ability.INFILTRATOR), Ability.SUPER_LUCK,
                8, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.25,
                117, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FAIRY),
                List.of("Bansew will steal fabric to sew onto its body. Different Bansew have different fabric preferences. Their wails are piercing, and can stop even the toughest pokemon in its tracks."),
                List.of(),
                List.of(                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bansew");

    }


}