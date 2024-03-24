package drai.dev.gravelmon.pokemon.kuria;

public class Kitsu extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kitsu() {
        super("Kitsu",
                Type.FIRE,Type.COSMIC,
                new Stats(79,
                        84,
                        66,
                        55,
                        66,
                        65),
                List.of(Ability.BLAZE), Ability.SUPERNOVA,
                9, 173,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                149, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Kitsu start out active but as they get stronger begin to sleep more than they are awake. This is due to the amount of heat they exhaust daily. Waking one up from their slumber will result in an unfavorable heatwave!"),
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
           setLangFileName("Kitsu");

    }


}
