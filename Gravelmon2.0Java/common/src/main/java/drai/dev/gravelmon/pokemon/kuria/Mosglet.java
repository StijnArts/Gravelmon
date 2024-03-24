package drai.dev.gravelmon.pokemon.kuria;

public class Mosglet extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mosglet() {
        super("Mosglet",
                Type.WATER,Type.POISON,
                new Stats(130,
                        56,
                        33,
                        83,
                        33,
                        55),
                List.of(Ability.MEGA_LAUNCHER), Ability.MEGA_LAUNCHER,
                14, 1270,
                new Stats(2,0,0,0,0,0), 60,
                0.5,
                111, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.WATER_1),
                List.of("They travel much faster in water than on land. Using the holes in their body, Mosglet quickly fire balls of mucus at anything that threatens them."),
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
           setLangFileName("Mosglet");

    }


}
