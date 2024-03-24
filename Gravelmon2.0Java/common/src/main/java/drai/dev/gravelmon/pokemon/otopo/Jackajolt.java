package drai.dev.gravelmon.pokemon.otopo;

public class Jackajolt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jackajolt() {
        super("Jackajolt",
                Type.ELECTRIC,
                new Stats(35,
                        45,
                        40,
                        80,
                        40,
                        140),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                152, 0,
                new Stats(0,0,0,0,0,2), 0,
                0.5,
                133, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It is readily stimulated, prompting it to rush off at high rates. When it is startled, it discharges a burst of electrical energy."),
                List.of(),
                List.of(                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Jackajolt");

    }


}
