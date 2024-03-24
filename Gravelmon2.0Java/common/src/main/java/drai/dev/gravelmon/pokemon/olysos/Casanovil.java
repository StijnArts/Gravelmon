package drai.dev.gravelmon.pokemon.olysos;

public class Casanovil extends drai.dev.gravelmon.pokemon.Pokemon {
    public Casanovil() {
        super("Casanovil",
                Type.GHOST,Type.DARK,
                new Stats(70,
                        90,
                        60,
                        80,
                        60,
                        110),
                List.of(Ability.CURSED_BODY,Ability.CUTE_CHARM), Ability.INFILTRATOR,
                16, 544,
                new Stats(0,1,0,0,0,2), 90,
                0.875,
                154, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("In moonlit caves, Casanovil's slender silhouette becomes even more elusive. It is said that the echoes of its haunting laughter linger, serving as a warning to those who dare trust too easily in the dark. Casanovil's alluring gaze can captivate even the most resolute trainers. Once ensnared, victims often find themselves drawn into a web of deception, their trust shattered by the Deceitful Devil Pokémon's cunning maneuvers."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Casanovil");

    }


}
