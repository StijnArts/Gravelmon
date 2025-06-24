package drai.dev.data.games.pokengine.done;


import drai.dev.data.pokemon.neonintendo.*;
import drai.dev.data.pokemon.neonintendo.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

//done
public class NeoNintendo extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new NeoNintendo();
    private NeoNintendo() {
        super("NeoNintendo");
    } //DONE

    @Override
    public void registerPokemon() {
//        addNewPokemon(new NeoZubat(41)); Member of line not finished
//        addNewPokemon(new NeoGeodude(74)); Member of line not finished
        addNewPokemon(new NeoCacnea("Cacnea", Aspect.NEO));
        addNewPokemon(new Cactussle());
//        addNewPokemon(new NeoTurtwig(387));Member of line not finished
//        addNewPokemon(new NeoGrotle(388));Member of line not finished
//        addNewPokemon(new NeoChimchar(390));Member of line not finished
//        addNewPokemon(new NeoMonferno(391));Member of line not finished
//        addNewPokemon(new NeoPiplup(393));Member of line not finished
//        addNewPokemon(new NeoPrinplup(394));Member of line not finished
//        addNewPokemon(new Velozolt());
    }

}
