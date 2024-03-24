package drai.dev.gravelmon.pokemon.urzavos;

public class Peadazzled extends drai.dev.gravelmon.pokemon.Pokemon {
    public Peadazzled() {
        super("Peadazzled",
                Type.PSYCHIC,Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.UNNERVE,Ability.INTIMIDATE), Ability.RATTLED,
                15, 748,
                new Stats(0,0,0,0,0,0), 45,
                1.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("The more confusing and striking the eye-markings on Peadazzled's body are, the more favorably they are treated among their peers."),
                List.of(),
                List.of(                        ),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Peadazzled");

    }


}
