package drai.dev.gravelmon.pokemon.kuria;

public class Crystail extends drai.dev.gravelmon.pokemon.Pokemon {
    public Crystail() {
        super("Crystail",
                Type.???,
                new Stats(58,
                        58,
                        58,
                        58,
                        58,
                        58),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                5, 50,
                new Stats(0,1,0,1,0,0), 0,
                0.0,
                118, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("A strange creature only talked about in ancient legends of the Kuria region. They roam the halls of crystal power, and swarm any invaders they can find in hopes of keeping their secrets safe."),
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
           setLangFileName("Crystail");

    }


}
