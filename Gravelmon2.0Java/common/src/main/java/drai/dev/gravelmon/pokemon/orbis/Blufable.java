package drai.dev.gravelmon.pokemon.orbis;

public class Blufable extends drai.dev.gravelmon.pokemon.Pokemon {
    public Blufable() {
        super("Blufable",
                Type.WATER,Type.FAIRY,
                new Stats(95,
                        70,
                        73,
                        95,
                        90,
                        60),
                List.of(Ability.DAMP,Ability.MAGIC_GUARD), Ability.UNAWARE,
                13, 600,
                new Stats(3,0,0,0,0,0), 25,
                0.75,
                217, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Blufable");

    }


}
