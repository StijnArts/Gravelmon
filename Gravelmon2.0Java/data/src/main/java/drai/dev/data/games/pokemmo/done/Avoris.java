package drai.dev.data.games.pokemmo.done;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.avoris.*;
import drai.dev.data.pokemon.avoris.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

//Done
public class Avoris extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Avoris();
    private Avoris() {
        super("Avoris");
    }

    @Override
    public void registerPokemon() {
//        addNewPokemon(new Taramby()); Member of Line not Finished
//        addNewPokemon(new Rambliss()); Member of Line not Finished
//        addNewPokemon(new Scorxio()); Member of Line not Finished
//        addNewPokemon(new Toxiscore()); Member of Line not Finished
//        addNewPokemon(new Ekino()); Member of Line not Finished
//        addNewPokemon(new Wizquid()); Member of Line not Finished
        addNewPokemon(new Fyrmite());
        addNewPokemon(new Carabomb());
        addNewPokemon(new Bombeezle());
        addNewPokemon(new Winvern());
        addNewPokemon(new Arctalon());
        addNewPokemon(new Falcryo());
        addNewPokemon(new Springily());
        addNewPokemon(new Faelily());
        addNewPokemon(new Skewern());
        addNewPokemon(new Pierceed());
        addNewPokemon(new Skowl());
        addNewPokemon(new Owlminous());
        addNewPokemon(new Mouskrow());
        addNewPokemon(new Mousummit());
//        addNewPokemon(new Flintzie()); Member of Line not Finished
        addNewPokemon(new Stumple());
        addNewPokemon(new Grample());
        addNewPokemon(new Echomori());
        addNewPokemon(new Sipsap());
        addNewPokemon(new Ransap());
        addNewPokemon(new Berricutie());
        addNewPokemon(new Frutanista());
        addNewPokemon(new Grabbit());
        addNewPokemon(new Frobber());
        addNewPokemon(new Attraknid());
        addNewPokemon(new Malevoness());
        addNewPokemon(new Picocacto());
        addNewPokemon(new Desperogue());
        addNewPokemon(new Desperasca());
        addNewPokemon(new Aridart());
        addNewPokemon(new Territhorn());
        addNewPokemon(new Wrecktonic());
        addNewPokemon(new Elescent());
        addNewPokemon(new Aromaphant());
        addNewPokemon(new Madambrella(new Stats(487, StatArchetype.FAST_SPECIAL_ATTACKER, List.of())));
//        addNewPokemon(new Shooba()); Member of Line not Finished
        addNewPokemon(new AvorianMaractus("", Aspect.AVORIAN));
        addNewPokemon(new Maracabre());
        addNewPokemon(new Cacotile());
        addNewPokemon(new Tankodile());
//        addNewPokemon(new AvorianMareep(179)); Member of Line not finished
//        addNewPokemon(new AvorianFlaaffy(180)); Member of Line not finished
        addNewPokemon(new Pyramud());
        addNewPokemon(new Pyradoom());
//        addNewPokemon(new AvorianCetitan(975)); Member of line not finished
//        addNewPokemon(new Smolink()); Member of Line not Finished
        addPokedexPokemon("mimejr");
        addNewPokemon(new AvorianMrMime("", Aspect.AVORIAN));
        addNewPokemon(new AvorianRoselia("Roselia", Aspect.AVORIAN));
    }

}
