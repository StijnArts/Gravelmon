package drai.dev.gravelmon.games;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.opalo.*;

public class Opal extends Game {
    public Opal() {
        super("Opal");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Snampery());
        pokemon.add(new Descargot());
        pokemon.add(new Gastesla());
        pokemon.add(new Flasinge());
        pokemon.add(new Shaboon());
        pokemon.add(new Lunaye());
        pokemon.add(new Swolphin());
        pokemon.add(new Norspear());
        pokemon.add(new Narvalor());
        pokemon.add(new Cefireon());

        pokemon.add(new Polekin());
        pokemon.add(new Fungorse());
        pokemon.add(new Cervantrier());
        pokemon.add(new Lugnis());
        pokemon.add(new Luravit());
        pokemon.add(new Luxpiravit());
        pokemon.add(new Quisquite());
        pokemon.add(new Gambarrel());
        pokemon.add(new Bogaleon());
        pokemon.add(new Astrem());
        pokemon.add(new Unktena());
    }
}
