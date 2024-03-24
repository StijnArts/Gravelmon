package drai.dev.gravelmon.pokemon.orbis;

public class Umbreon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Umbreon() {
        super("Umbreon",
                Type.DARK,
                new Stats(95,
                        65,
                        110,
                        60,
                        130,
                        65),
                List.of(Ability.SYNCHRONIZE), Ability.INNER_FOCUS,
                10, 270,
                new Stats(0,0,0,0,2,0), 45,
                0.875,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Umbreon evolved from exposure to the moon's energy pulses. It lurks in darkness and waits for its foes to move. The rings on its body glow when it leaps to attack."),
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
           setLangFileName("Umbreon");

    }


}
