package drai.dev.gravelmon.pokemon.mastenia;

public class Terratusk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Terratusk() {
        super("Terratusk",
                Type.ROCK,Type.NORMAL,
                new Stats(75,
                        115,
                        120,
                        30,
                        70,
                        85),
                List.of(Ability.STURDY), Ability.SOLID_ROCK,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.87,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(),
                List.of("Evo Double-EdgeSTAB Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,1)                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Terratusk");

    }


}
