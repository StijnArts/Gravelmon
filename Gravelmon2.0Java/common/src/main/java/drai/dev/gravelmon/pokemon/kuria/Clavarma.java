package drai.dev.gravelmon.pokemon.kuria;

public class Clavarma extends drai.dev.gravelmon.pokemon.Pokemon {
    public Clavarma() {
        super("Clavarma",
                Type.STEEL,Type.FIRE,
                new Stats(55,
                        57,
                        85,
                        50,
                        85,
                        28),
                List.of(Ability.HEATPROOF,Ability.CURSED_BODY), Ability.CLEAR_BODY,
                12, 827,
                new Stats(0,0,1,0,0,0), 45,
                0.0,
                110, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("They can raise their internal temperature extremely high. They use this to completely incinerate anything they put inside their body."),
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
           setLangFileName("Clavarma");

    }


}
