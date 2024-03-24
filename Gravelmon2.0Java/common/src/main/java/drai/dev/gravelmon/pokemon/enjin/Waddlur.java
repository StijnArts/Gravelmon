package drai.dev.gravelmon.pokemon.enjin;

public class Waddlur extends drai.dev.gravelmon.pokemon.Pokemon {
    public Waddlur() {
        super("Waddlur",
                Type.ICE,Type.DRAGON,
                new Stats(65,
                        25,
                        55,
                        30,
                        55,
                        55),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                2, 59,
                new Stats(1,0,0,0,0,0), 90,
                0.5,
                57, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Waddlur come down from the mountains at midnight to walk the streets of remote towns, either solitary or in small groups. Their outstretched arms give the image they are looking for a warm embrace. They always vanish before dawn."),
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
           setLangFileName("Waddlur");

    }


}
