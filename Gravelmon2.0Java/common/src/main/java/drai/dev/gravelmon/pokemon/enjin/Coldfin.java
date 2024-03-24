package drai.dev.gravelmon.pokemon.enjin;

public class Coldfin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Coldfin() {
        super("Coldfin",
                Type.WATER,Type.ICE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Added Oct 27 2021 Etymology: cold + dolphin + fin Evo line: Open to suggestions and submissions Origin: Created by JaneJewel for the April 2020 Around The World Fakeathon Day 21 prompt, Antarctica"),
                List.of(),
                List.of(                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Coldfin");

    }


}
