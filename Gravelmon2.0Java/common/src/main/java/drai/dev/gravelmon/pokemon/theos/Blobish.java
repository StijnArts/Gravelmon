package drai.dev.gravelmon.pokemon.theos;

public class Blobish extends drai.dev.gravelmon.pokemon.Pokemon {
    public Blobish() {
        super("Blobish",
                Type.WATER,Type.GHOST,
                new Stats(130,
                        75,
                        70,
                        75,
                        110,
                        65),
                List.of(Ability.STICKY_HOLD,Ability.DRY_SKIN), Ability.REGENERATOR,
                0, 0,
                new Stats(2,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Not much is known about Blobish as they're not often seen in the wild. Their appearance often turns people away from catching them."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Blobish");

    }


}
