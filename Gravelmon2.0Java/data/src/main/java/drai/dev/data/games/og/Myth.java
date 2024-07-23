package drai.dev.data.games.og;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.mongratis.Dampurr;
import drai.dev.data.pokemon.mongratis.Delugar;
import drai.dev.data.pokemon.mongratis.Titaneon;
import drai.dev.data.pokemon.myth.*;
import drai.dev.data.pokemon.myth.Duneon;
import drai.dev.data.pokemon.panjaea.Toxeon;

public class Myth extends Game
{
    public Myth() {
        super("Myth");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Snick());
        pokemon.add(new Torsnail());
        pokemon.add(new Wavstisnail());
        pokemon.add(new Swove());
        pokemon.add(new Eledove());
        pokemon.add(new Magnidove());
        pokemon.add(new Dampurr());
        pokemon.add(new Soakcuff());
        pokemon.add(new Delugar());
        pokemon.add(new Caitlit());
        pokemon.add(new Caitfyr());
        pokemon.add(new Blazesidhe());
        pokemon.add(new Waelin());
        pokemon.add(new Skreychee());
        pokemon.add(new Bindshii());
        pokemon.add(new Slinkee());
        pokemon.add(new Elinkee());
        pokemon.add(new Serpensync());
        pokemon.add(new Cocoling());
        pokemon.add(new Coconab());
        pokemon.add(new Cocofested());
        pokemon.add(new Chimeaura());
        pokemon.add(new Raccane());
        pokemon.add(new Draccane());
        pokemon.add(new Raccolossus());
        pokemon.add(new Combateon());
        pokemon.add(new Crystaleon());
        pokemon.add(new Toxeon());
        pokemon.add(new Spectreon());
        pokemon.add(new Aereon());
        pokemon.add(new Duneon());
        pokemon.add(new Titaneon());
        pokemon.add(new Ascenteon());
        pokemon.add(new Sonareon());
        pokemon.add(new Stingeon()); //Used to be called Scorpeon but dupe
        pokemon.add(new Plaineon());
        pokemon.add(new Fenrour());
        pokemon.add(new Lihgeri());
        pokemon.add(new Freknight());
        pokemon.add(new Phenelpha());
        pokemon.add(new Hummony());
    }
}
