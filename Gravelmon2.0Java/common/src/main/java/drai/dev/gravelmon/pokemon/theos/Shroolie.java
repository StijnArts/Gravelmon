package drai.dev.gravelmon.pokemon.theos;

public class Shroolie extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shroolie() {
        super("Shroolie",
                Type.POISON,Type.FAIRY,
                new Stats(42,
                        30,
                        45,
                        56,
                        53,
                        39),
                List.of(Ability.SHIELD_DUST), Ability.MOODY,
                3, 15,
                new Stats(0,0,0,1,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The spores that Shroolie carelessly release from their bubbles can cause different effects, depending on how the Shroolie is feeling at the time."),
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
           setLangFileName("Shroolie");

    }


}
