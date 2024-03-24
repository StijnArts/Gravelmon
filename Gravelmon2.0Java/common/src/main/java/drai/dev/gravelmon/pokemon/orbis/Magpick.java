package drai.dev.gravelmon.pokemon.orbis;

public class Magpick extends drai.dev.gravelmon.pokemon.Pokemon {
    public Magpick() {
        super("Magpick",
                Type.DARK,Type.FLYING,
                new Stats(40,
                        60,
                        30,
                        35,
                        30,
                        70),
                List.of(Ability.PICKPOCKET), Ability.PICKPOCKET,
                3, 30,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                52, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
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
           setLangFileName("Magpick");

    }


}
