package drai.dev.gravelmon.pokemon.nodorro;

public class Magneton extends drai.dev.gravelmon.pokemon.Pokemon {
    public Magneton() {
        super("Magneton",
                Type.ELECTRIC,Type.STEEL,
                new Stats(50,
                        60,
                        95,
                        120,
                        70,
                        70),
                List.of(Ability.MAGNET_PULL,Ability.STURDY), Ability.ANALYTIC,
                10, 600,
                new Stats(0,0,0,2,0,0), 60,
                0.0,
                163, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Magneton");

    }


}
