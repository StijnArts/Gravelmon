package drai.dev.gravelmon.pokemon.fliga;

public class Mousprite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mousprite() {
        super("Mousprite",
                Type.FAIRY,
                new Stats(60,
                        92,
                        23,
                        52,
                        32,
                        51),
                List.of(Ability.CUTE_CHARM), Ability.MOXIE,
                4, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mousprite were originally created when a digital avatar gained sentience. They love to learn, and depending on what they discover in both the real world and on the internet, will develop different temperaments."),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mousprite");

    }


}
