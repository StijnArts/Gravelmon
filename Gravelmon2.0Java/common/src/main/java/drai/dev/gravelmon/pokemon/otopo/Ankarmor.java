package drai.dev.gravelmon.pokemon.otopo;

public class Ankarmor extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ankarmor() {
        super("Ankarmor",
                Type.ROCK,
                new Stats(30,
                        42,
                        118,
                        42,
                        88,
                        30),
                List.of(Ability.STURDY), Ability.SOUNDPROOF,
                5, 570,
                new Stats(0,0,1,0,0,0), 45,
                0.875,
                70, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Ankarmor were discovered in an old fossil and are thought to have existed thousands of years ago. Their carapace is extremely strong and can resist tremendous pressure."),
                List.of(),
                List.of(                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ankarmor");

    }


}
