package drai.dev.data.games.pokengine;


import drai.dev.data.pokemon.aristos.*;
import drai.dev.data.pokemon.aristos.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

//Done https://pokengine.org/collections/1042gh42/Aristos
public class Aristos extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Aristos();
    //todo instagram/artwork
    private Aristos() {
        super("Aristos");
    }

    @Override
    public void registerPokemon() {

        addNewPokemon(new AristosianSentret("", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianFurret("", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianSpinarak("", Aspect.ARISTOSIAN));
        addNewPokemon(new Lanidos());
//        addNewPokemon(new AristosianTaillow(276)); Member of line not finished
        addNewPokemon(new AristosianBellsprout("", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianWeepinbell("", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianVictreebel("", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianMareep("", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianFlaaffy("", Aspect.ARISTOSIAN));
        addNewPokemon(new Ramvolt());
//        addNewPokemon(new Tuckle()); Missing Art
        addPokedexPokemon("farfetchd");
        addNewPokemon(new Achiefd());
        addNewPokemon(new AristosianGrowlithe("", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianArcanine("", Aspect.ARISTOSIAN));
//        addNewPokemon(new Probotheos()); Missing Art
        addPokedexPokemon("magikarp, gyarados");
        addNewPokemon(new Kamurados());
        addNewPokemon(new Goobae());
        addPokedexPokemon("grimer, muk");
        addNewPokemon(new Weeduza());
        addPokedexPokemon("tangela");
        addNewPokemon(new Tangorgon());
//        addNewPokemon(new Soulix()); Missing Art
//        addNewPokemon(new Fledjed()); Missing Art
        addNewPokemon(new AristosianTropius("Tropius", Aspect.ARISTOSIAN));
        addNewPokemon(new Kangazad());
        addNewPokemon(new AristosianKangaskhan("", Aspect.ARISTOSIAN));
//        addNewPokemon(new Paloarmo()); Missing Art Renamed from Pharoar
        addNewPokemon(new EPP_v11());
//        addNewPokemon(new Pharoar()); Missing Art
//        addNewPokemon(new Cactrian()); Missing Art
//        addNewPokemon(new Spiribloom()); Missing Art
//        addNewPokemon(new Zoongus()); Missing Art
        addNewPokemon(new Kvadract());
        addNewPokemon(new Navatoria());
        addNewPokemon(new Sabroast());
    }

}
