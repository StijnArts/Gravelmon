package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Komandant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Komandant() {
        super("Komandant",
                Type.BUG, Type.STEEL,
                new Stats(75,
                        124,
                        135,
                        122,
                        76,
                        68),
                List.of(Ability.BATTLE_ARMOR,Ability.BULLETPROOF,Ability.SHARPSHOOTER), Ability.SHARPSHOOTER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Evo Flash CannonSTAB Steel - Tri Attack Normal - Zap Cannon Electric - Honey BombSTAB Bug - Pin MissileSTAB Bug 40 SteamrollerSTAB Bug 45 Lock-On Normal 50 Steel BeamSTAB Steel 60 Hyper Beam Normal 70 Steel RollerSTAB Steel"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PIN_MISSILE,1),
                        new MoveLearnSetEntry(Move.STEAMROLLER,40),
                        new MoveLearnSetEntry(Move.LOCKON,45),
                        new MoveLearnSetEntry(Move.STEEL_BEAM,50),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,60),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER,70),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.REVERSAL,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Komandant");

    }


}
