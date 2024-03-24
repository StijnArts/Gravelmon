package drai.dev.gravelmon.pokemon.cyare;

public class Pupive extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pupive() {
        super("Pupive",
                Type.BUG,
                new Stats(45,
                        40,
                        25,
                        30,
                        30,
                        40),
                List.of(Ability.SHED_SKIN), Ability.SHED_SKIN,
                6, 68,
                new Stats(2,0,0,0,0,0), 120,
                0.5,
                75, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Pupive often find themselves rattled around by Pokemon who think there's a tasty treat within it's husk. However, if Pupive are disturbed when they're close to evolving, then-"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,15),
                        new MoveLearnSetEntry(Move.FLAIL,20)                        ),
                List.of(Label.CYARE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pupive");

    }


}
