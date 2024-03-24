package drai.dev.gravelmon.pokemon.kuria;

public class Candicorn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Candicorn() {
        super("Candicorn",
                Type.FAIRY,Type.NORMAL,
                new Stats(78,
                        105,
                        70,
                        77,
                        85,
                        110),
                List.of(Ability.SWEET_VEIL,Ability.SERENE_GRACE), Ability.LIMBER,
                17, 714,
                new Stats(0,1,0,0,0,1), 25,
                0.125,
                360, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Only heard of in legend, anyone who sees a Candicorn is blessed with sweet dreams and treats the rest of their life."),
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
           setLangFileName("Candicorn");

    }


}
