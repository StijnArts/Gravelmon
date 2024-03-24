package drai.dev.gravelmon.pokemon.kuria;

public class Shyneon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shyneon() {
        super("Shyneon",
                Type.???,
                new Stats(135,
                        70,
                        65,
                        115,
                        100,
                        70),
                List.of(Ability.SAVEDUPPOWER,Ability.DYNAMICPOWER), Ability.CRYSTALSURGE,
                11, 410,
                new Stats(3,0,0,2,0,0), 45,
                0.125,
                230, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Due to Eevee's ability to adapt to any situation, it has the opportunity to become one of the only known truly Crystal-type Pokémon by being exposed to highly concentrated crystal radiation."),
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
           setLangFileName("Shyneon");

    }


}
