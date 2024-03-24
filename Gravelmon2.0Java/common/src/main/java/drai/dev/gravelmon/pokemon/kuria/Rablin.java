package drai.dev.gravelmon.pokemon.kuria;

public class Rablin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rablin() {
        super("Rablin",
                Type.NORMAL,Type.???,
                new Stats(65,
                        125,
                        70,
                        125,
                        70,
                        70),
                List.of(Ability.HEAVYEYED), Ability.HEAVYEYED,
                7, 55,
                new Stats(0,0,1,0,1,0), 45,
                0.5,
                167, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Rablin spend most of their life asleep as if under some sort of spell. They are still able to function when asleep, but it's almost as if they're being controlled. When Rablin awakes, they're back to their normal self."),
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
           setLangFileName("Rablin");

    }


}
