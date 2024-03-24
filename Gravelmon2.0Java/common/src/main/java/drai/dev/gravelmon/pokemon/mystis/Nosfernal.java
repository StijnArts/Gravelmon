package drai.dev.gravelmon.pokemon.mystis;

public class Nosfernal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nosfernal() {
        super("Nosfernal",
                Type.DRAGON,Type.DARK,
                new Stats(89,
                        65,
                        70,
                        101,
                        65,
                        120),
                List.of(Ability.POWERLEECH,Ability.NOCTURNAL), Ability.DEVIATE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                186, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Despite it's incredibly ominous demeanour, it acts incredibly polite as long as there are no hostilities in the area. It can summon swarms of Drakuleech to aid it in a tough battle."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nosfernal");

    }


}
