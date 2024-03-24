package drai.dev.gravelmon.pokemon.kuria;

public class Kikro extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kikro() {
        super("Kikro",
                Type.WATER,
                new Stats(54,
                        49,
                        52,
                        66,
                        50,
                        43),
                List.of(Ability.TORRENT), Ability.REVERB,
                5, 48,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                66, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_1),
                List.of("Kikro are small noisy Pokémon who inhabit swamps. They use the vocal sac on their throat to let out huge bursts of sound when threatened."),
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
           setLangFileName("Kikro");

    }


}
