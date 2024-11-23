package drai.dev.data.games.pokemmo.secondbatch;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.crozoic.*;

import java.util.*;
public class Crozoic extends drai.dev.data.games.registry.Game {
    public Crozoic() {
        super("Crozoic");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Arovee());
//        pokemon.add(new Dinari());   Member of line Not Finished
        addNewPokemon(new Picant());
        addNewPokemon(new Surveilant());
        addNewPokemon(new Hellantern(new Stats(434, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK, StatType.ATTACK, StatType.SPEED))));
        addNewPokemon(new Glizyrup(new Stats(342, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        addNewPokemon(new Pekohmu(new Stats(412, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Razaury());
        addNewPokemon(new Therislash(new Stats(514, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Brainibash());
        addNewPokemon(new Brainiache(new Stats(506, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Seanodont(new Stats(387, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Chillaxo());
        addNewPokemon(new Kulapack());
        addNewPokemon(new Shroolumn(new Stats(477, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        addNewPokemon(new Fishereel(new Stats(467, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPEED))));
        addNewPokemon(new Stricycle());
        addNewPokemon(new Mimentron());
        addNewPokemon(new Ovimourn());
        addNewPokemon(new Funeraptor(new Stats(513, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Varaquake(new Stats(467, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Rexinder());
        addNewPokemon(new Tarboraze(new Stats(532, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Miniclod());
        addNewPokemon(new Stratopod(new Stats(532, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Sharpunk());
        addNewPokemon(new Spurocious(new Stats(513, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Tropichomp());
        addNewPokemon(new Dendrago(new Stats(476, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))));
        addNewPokemon(new Pikoral());
        addNewPokemon(new Crestoral(new Stats(500, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Hungrebe(new Stats(354, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Punshell());
        addNewPokemon(new Whammonite(new Stats(512, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Soulhofen());
        addNewPokemon(new Shaelseum());
        addNewPokemon(new Stunge());
        addNewPokemon(new Bristilt(new Stats(489, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Clawryde());
//        pokemon.add(new Tullabaloo()); Member of line Not Finished
        addNewPokemon(new Elegyre(new Stats(412, StatArchetype.FAST_SUPPORT, List.of(StatType.HP))));
        addNewPokemon(new Palagaia(new Stats(496, StatArchetype.PHYSICAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Pachibrik());
        addNewPokemon(new Pachicorn(new Stats(532, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Squicecone(new Stats(456, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Cryoptera(new Stats(456, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Stegairy());
        addNewPokemon(new Booade());
        addNewPokemon(new Fauxnidon(new Stats(485, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Reptor(new Stats(411, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
    }

}
