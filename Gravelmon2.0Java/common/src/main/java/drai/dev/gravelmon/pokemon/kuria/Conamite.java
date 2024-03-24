package drai.dev.gravelmon.pokemon.kuria;

public class Conamite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Conamite() {
        super("Conamite",
                Type.ROCK,
                new Stats(85,
                        85,
                        85,
                        40,
                        60,
                        40),
                List.of(Ability.SOLID_ROCK,Ability.WEAK_ARMOR), Ability.TOUGH_CLAWS,
                11, 995,
                new Stats(1,0,2,0,0,0), 120,
                0.5,
                137, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Many texts from ancient civilizations write about one of their people being impaled by structures similar to Conamite. Rather odd, as they've only been seen moving since 2000 years ago."),
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
           setLangFileName("Conamite");

    }


}
