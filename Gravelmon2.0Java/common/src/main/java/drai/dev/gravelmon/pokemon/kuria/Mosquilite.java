package drai.dev.gravelmon.pokemon.kuria;

public class Mosquilite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mosquilite() {
        super("Mosquilite",
                Type.BUG,Type.COSMIC,
                new Stats(65,
                        106,
                        80,
                        60,
                        50,
                        89),
                List.of(Ability.TINTED_LENS,Ability.DAZZLING), Ability.SIGNALBOOST,
                13, 3519,
                new Stats(0,2,0,0,0,1), 45,
                0.5,
                164, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Upon emerging, Mosquillite fly into the atmosphere and orbit the planet continuously. They send and receive signals, and sometimes shoot them deep into the unknown of space."),
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
           setLangFileName("Mosquilite");

    }


}
