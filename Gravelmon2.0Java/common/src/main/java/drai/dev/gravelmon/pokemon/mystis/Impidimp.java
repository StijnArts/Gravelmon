package drai.dev.gravelmon.pokemon.mystis;

public class Impidimp extends drai.dev.gravelmon.pokemon.Pokemon {
    public Impidimp() {
        super("Impidimp",
                Type.FIRE,
                new Stats(45,
                        55,
                        30,
                        65,
                        40,
                        30),
                List.of(Ability.BATTLE_ARMOR), Ability.GOLDRUSH,
                4, 55,
                new Stats(0,0,0,0,0,0), 255,
                0.75,
                53, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Impidimp");

    }


}
