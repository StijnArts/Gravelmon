package drai.dev.data.games;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.myth.*;

public class Myth extends Game
{
    public Myth() {
        super("Myth");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Snick());
        addNewPokemon(new Torsnail());
        addNewPokemon(new Wavstisnail());
        addNewPokemon(new Swove());
        addNewPokemon(new Eledove());
        addNewPokemon(new Magnidove());
        addNewPokemon(new Dampurr());
        addNewPokemon(new Soakcuff());
        addNewPokemon(new Delugar());
        addNewPokemon(new Caitlit());
        addNewPokemon(new Caitfyr());
        addNewPokemon(new Blazesidhe());
        addNewPokemon(new Hissiorite());
        addNewPokemon(new Cobarett());
        addNewPokemon(new Pythonova());
        addNewPokemon(new Waelin());
        addNewPokemon(new Skreychee());
        addNewPokemon(new Bindshii());
        addNewPokemon(new Slinkee());
        addNewPokemon(new Elinkee());
        addNewPokemon(new Serpensync());
        addNewPokemon(new Cocoling());
        addNewPokemon(new Coconab());
        addNewPokemon(new Cocofested());
        addNewPokemon(new Chimeaura());
        addNewPokemon(new Raccane());
        addNewPokemon(new Draccane());
        addNewPokemon(new Raccolossus());
        addNewPokemon(new Baulder());
        addNewPokemon(new Dredrock());
        addNewPokemon(new Tekagon());
        addNewPokemon(new Lavee());
        addNewPokemon(new Lavare());
        addNewPokemon(new Lavarator());
        addNewPokemon(new Combateon());
        addNewPokemon(new Crystaleon());
        addNewPokemon(new Toxeon());
        addNewPokemon(new Spectreon());
        addNewPokemon(new Aereon());
        addNewPokemon(new Duneon());
        addNewPokemon(new Titaneon());
        addNewPokemon(new Ascenteon());
        addNewPokemon(new Sonareon());
        addNewPokemon(new Stingeon()); //Used to be called Scorpeon but dupe
        addNewPokemon(new Plaineon());
        addNewPokemon(new Fenrour());
        addNewPokemon(new Lihgeri());
        addNewPokemon(new Freknight());
        addNewPokemon(new Phenelpha());
        addNewPokemon(new Hummony());
    }
}
