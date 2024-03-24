package drai.dev.gravelmon.pokemon.theos;

public class Hoppip extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hoppip() {
        super("Hoppip",
                Type.GROUND,Type.GRASS,
                new Stats(50,
                        35,
                        40,
                        35,
                        55,
                        35),
                List.of(Ability.UNNERVE,Ability.HARVEST), Ability.DRY_SKIN,
                3, 5,
                new Stats(1,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Theosian Hoppip dig themselves into the ground to absorb nutriants from the soil. They're able to grow wheat from the seeds that fall off their head."),
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
           setLangFileName("Hoppip");

    }


}
