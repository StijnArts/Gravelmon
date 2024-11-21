package drai.dev.data.games;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.opalo.*;

public class Opal extends Game {
    public Opal() {
        super("Opal");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Snampery());
        addNewPokemon(new Descargot());
        addNewPokemon(new Gastesla());
        addNewPokemon(new Flasinge());
        addNewPokemon(new Shaboon());
        addNewPokemon(new Lunaye());
        addNewPokemon(new Swolphin());
        addNewPokemon(new Norspear());
        addNewPokemon(new Narvalor());
        addNewPokemon(new Cefireon());

        addNewPokemon(new Polekin());
        addNewPokemon(new Fungorse());
        addNewPokemon(new Cervantrier());
        addNewPokemon(new Lugnis());
        addNewPokemon(new Luravit());
        addNewPokemon(new Luxpiravit());
        addNewPokemon(new Quisquite());
        addNewPokemon(new Gambarrel());
        addNewPokemon(new Bogaleon());
        addNewPokemon(new Astrem());
        addNewPokemon(new Unktena());
    }
}
