package drai.dev.gravelmon.pokemon.kuria;

public class Felinshii extends drai.dev.gravelmon.pokemon.Pokemon {
    public Felinshii() {
        super("Felinshii",
                Type.GHOST,Type.FIGHTING,
                new Stats(82,
                        110,
                        62,
                        60,
                        74,
                        130),
                List.of(Ability.TOUGH_CLAWS,Ability.LIFEBLOOD), Ability.SHADOW_TAG,
                11, 208,
                new Stats(0,0,0,0,0,2), 45,
                0.0,
                182, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.HUMAN_LIKE),
                List.of("If they do not move for a long period of time, their body will start getting stiff, so they stretch and train all the time to prevent this. They can drain the life force of their prey by sinking their claws into them."),
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
           setLangFileName("Felinshii");

    }


}
