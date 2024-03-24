package drai.dev.gravelmon.pokemon.olysos;

public class Happetite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Happetite() {
        super("Happetite",
                Type.GRASS,Type.DRAGON,
                new Stats(90,
                        120,
                        70,
                        30,
                        50,
                        65),
                List.of(Ability.STRONG_JAW,Ability.HUSTLE), Ability.RECKLESS,
                13, 360,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                1250, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.DRAGON),
                List.of("Beneath its mask is a mouth that can stretch far, able to gobble down large meals without any effort."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Happetite");

    }


}
