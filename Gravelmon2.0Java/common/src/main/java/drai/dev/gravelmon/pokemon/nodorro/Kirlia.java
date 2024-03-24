package drai.dev.gravelmon.pokemon.nodorro;

public class Kirlia extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kirlia() {
        super("Kirlia",
                Type.PSYCHIC,Type.FAIRY,
                new Stats(70,
                        50,
                        55,
                        90,
                        80,
                        75),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Kirlia can manipulate the emtions of men and pokemon. Altho it would never tho this in its own favor."),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kirlia");

    }


}
