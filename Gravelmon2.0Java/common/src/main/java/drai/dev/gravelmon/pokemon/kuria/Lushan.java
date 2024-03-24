package drai.dev.gravelmon.pokemon.kuria;

public class Lushan extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lushan() {
        super("Lushan",
                Type.ROCK,Type.LIGHT,
                new Stats(86,
                        70,
                        114,
                        105,
                        94,
                        56),
                List.of(Ability.STURDY), Ability.SAP_SIPPER,
                16, 3000,
                new Stats(0,0,1,1,0,0), 90,
                0.5,
                194, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FIELD),
                List.of("Lushan spends all its life eating minerals in hopes of finding rare gems. The more gems it eats, the more power it can hold within. They can use this energy to fire devastating beams of light."),
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
           setLangFileName("Lushan");

    }


}
