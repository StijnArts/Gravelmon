package drai.dev.gravelmon.pokemon.kuria;

public class Torpeban extends drai.dev.gravelmon.pokemon.Pokemon {
    public Torpeban() {
        super("Torpeban",
                Type.FIRE,
                new Stats(85,
                        85,
                        85,
                        85,
                        85,
                        85),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                12, 127,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                180, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("They roam around hot areas lighting anything it sees on fire. No one is sure if the markings on Torpeban are its face, or if it even has a face at all."),
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
           setLangFileName("Torpeban");

    }


}
