package drai.dev.gravelmon.pokemon.pastel island;

public class Geckolt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Geckolt() {
        super("Geckolt",
                Type.GRASS,Type.ELECTRIC,
                new Stats(90,
                        60,
                        65,
                        110,
                        120,
                        85),
                List.of(Ability.OVERGROW), Ability.MOTOR_DRIVE,
                18, 548,
                new Stats(0,0,0,2,1,0), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("These Pokémon are often seen on the forest floors, running at high speeds and generating sparks as they move. Their electrical blasts are deadly, to say the least."),
                List.of(),
                List.of(                        ),
                List.of(Label.PASTEL ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Geckolt");

    }


}
