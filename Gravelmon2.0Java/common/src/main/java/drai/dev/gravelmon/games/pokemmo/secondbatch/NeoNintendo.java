package drai.dev.gravelmon.games.pokemmo.secondbatch;

import drai.dev.gravelmon.pokemon.neonintendo.*;

public class NeoNintendo extends drai.dev.gravelmon.games.registry.Game {
    public NeoNintendo() {
        super("Neo Nintendo");
    }

    @Override
    public void registerPokemon() {
//        pokemon.add(new NeoZubat()); //Member of line not finished
//        pokemon.add(new NeoGeodude()); //Member of line not finished
        pokemon.add(new Cactussle());
//        pokemon.add(new NeoTurtwig()); //Member of line not finished
//        pokemon.add(new drai.dev.gravelmon.pokemon.neoneonintendo.NeoGrotle()); //Member of line not finished
//        pokemon.add(new NeoChimchar()); //Member of line not finished
//        pokemon.add(new NeoMonferno()); //Member of line not finished
//        pokemon.add(new NeoPiplup()); //Member of line not finished
//        pokemon.add(new NeoPrinplup()); //Member of line not finished
        //pokemon.add(new Velozolt()); //TODO find the rest of the galar fossils
    }

}
