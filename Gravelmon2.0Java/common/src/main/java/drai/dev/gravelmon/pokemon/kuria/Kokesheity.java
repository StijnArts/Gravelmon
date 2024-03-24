package drai.dev.gravelmon.pokemon.kuria;

public class Kokesheity extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kokesheity() {
        super("Kokesheity",
                Type.FAIRY,Type.LIGHT,
                new Stats(75,
                        65,
                        70,
                        116,
                        70,
                        91),
                List.of(Ability.SERENE_GRACE,Ability.WONDER_SKIN), Ability.PIXILATE,
                12, 175,
                new Stats(0,0,0,2,0,0), 45,
                1.0,
                193, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FAIRY),
                List.of("Kokosheity love the spotlight. They make friends very quickly and are often seen on TV or performing on stages all around the world."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kokesheity");

    }


}
