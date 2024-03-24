package drai.dev.gravelmon.pokemon.kuria;

public class Hawkedge extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hawkedge() {
        super("Hawkedge",
                Type.DARK,Type.FLYING,
                new Stats(68,
                        127,
                        90,
                        50,
                        76,
                        75),
                List.of(Ability.RIVALRY,Ability.HUSTLE), Ability.STEELWORKER,
                14, 355,
                new Stats(0,3,0,0,0,0), 90,
                0.5,
                162, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Hawkedge patrol the skies looking for anything that has entered its territory. If it sees anything at all, it will dive bomb them with slices sharp enough to cut a Steelix in half."),
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
           setLangFileName("Hawkedge");

    }


}
