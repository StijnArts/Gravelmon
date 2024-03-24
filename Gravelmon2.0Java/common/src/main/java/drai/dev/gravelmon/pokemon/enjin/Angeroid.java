package drai.dev.gravelmon.pokemon.enjin;

public class Angeroid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Angeroid() {
        super("Angeroid",
                Type.FIGHTING,Type.POISON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.ANGER_POINT), Ability.ANGER_POINT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Added Oct 27 2021 Created by JaneJewel for the April 2020 Around The World Fakeathon Day 27 prompt, Olympics"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BULK_UP,1)                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Angeroid");

    }


}
