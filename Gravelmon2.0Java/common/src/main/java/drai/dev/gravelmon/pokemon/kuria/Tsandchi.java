package drai.dev.gravelmon.pokemon.kuria;

public class Tsandchi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tsandchi() {
        super("Tsandchi",
                Type.FIGHTING,Type.GROUND,
                new Stats(70,
                        85,
                        50,
                        30,
                        60,
                        60),
                List.of(Ability.DESERTBODY,Ability.SCRAPPY), Ability.MOXIE,
                8, 221,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                107, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("They spend day and night wandering caves and fields looking for opponents to fight. Their body is resillient, but they can quickly patch themselves up using mud and sand if it gets torn."),
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
           setLangFileName("Tsandchi");

    }


}
