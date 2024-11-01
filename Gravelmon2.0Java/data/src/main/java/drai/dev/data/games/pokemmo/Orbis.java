package drai.dev.data.games.pokemmo;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.orbis.*;

import java.util.*;

public class Orbis extends drai.dev.data.games.registry.Game {
    public Orbis() {
        super("Orbis");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new PokPalv1());
        pokemon.add(new Rascaloon());
        pokemon.add(new Raccowl());
        pokemon.add(new Squabbiz());
        pokemon.add(new Executove());
        pokemon.add(new Presigeont());
        pokemon.add(new Magpick());
        pokemon.add(new Magpeist());
        pokemon.add(new Nappi());
        pokemon.add(new Rubbage());
        pokemon.add(new Buzzero());
        pokemon.add(new Bulbillar());
        pokemon.add(new Glowva());
        pokemon.add(new Sectalamp());
        pokemon.add(new Grubbrush());
        pokemon.add(new Pupallet());
        pokemon.add(new Beasel());
        pokemon.add(new Squeebee());
        pokemon.add(new Baldy());
        pokemon.add(new Rubbaldy());
        pokemon.add(new Stickigum());
        pokemon.add(new Stickisticky());
        pokemon.add(new Solseed());
        pokemon.add(new Suryala(new Stats(410, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Bellchsia());
        pokemon.add(new Fuchsiella());
        pokemon.add(new Fuchsiadame());
        pokemon.add(new Blanfish());
        pokemon.add(new Dracolore());
        pokemon.add(new Kingulum());
        pokemon.add(new Acrown());
        pokemon.add(new Majestree());
        pokemon.add(new Timbug());
        pokemon.add(new Loustache());
        pokemon.add(new Spoutot());
        pokemon.add(new Fountier());
        pokemon.add(new Fonsdame());
        pokemon.add(new Cerforyu());
        pokemon.add(new Pampurr());
        pokemon.add(new Freyurr());
        pokemon.add(new Intimeow());
        pokemon.add(new Necromata());
        pokemon.add(new Caffiend());
        pokemon.add(new Baristroll());
        pokemon.add(new Delistork());
        pokemon.add(new Trashlug());
        pokemon.add(new Trashcargot());
        pokemon.add(new Chumpost());
        pokemon.add(new Componion());
        pokemon.add(new Badbud());
        pokemon.add(new Thorstle());
        pokemon.add(new Thistance());
        pokemon.add(new Nettic());
        pokemon.add(new Stinttle());
        pokemon.add(new Stimanic());
        pokemon.add(new Traffimite());
        pokemon.add(new Traffitron());
        pokemon.add(new Skenteur());
        pokemon.add(new Parfumou());
        pokemon.add(new Searsage());
        pokemon.add(new Frankfurnt());
        pokemon.add(new Vermob());
        pokemon.add(new Veradmin()); //Renamed from Verminion
        pokemon.add(new Vermicapone());
        pokemon.add(new Monsewer());
        pokemon.add(new Miremaid());
        pokemon.add(new Rubblock());
        pokemon.add(new Debruin());
        pokemon.add(new Bourubble());
        pokemon.add(new Uninail());
        pokemon.add(new Desertusk(new Stats(430, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new Burrorm());
        pokemon.add(new Burryrm());
        pokemon.add(new Baybee());
        pokemon.add(new Drillbee());
        pokemon.add(new Diggbee());
        pokemon.add(new Honarchee());
        pokemon.add(new Tarexite(new Stats(410, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Weyabitt());
        pokemon.add(new Weyatonne());
        pokemon.add(new Pomdan()); //Renamed from Pompuff
        pokemon.add(new Pufflepom());
        pokemon.add(new Battrol());
        pokemon.add(new Battrolor());
        pokemon.add(new Kankrab());
        pokemon.add(new Wrekrab());
        pokemon.add(new Sootot());
        pokemon.add(new Sweepmu());
        pokemon.add(new Palmbrella());
        pokemon.add(new Feistsea());
        pokemon.add(new Letharleo());
        pokemon.add(new Chickaring());
        pokemon.add(new Seadeek());
        pokemon.add(new Cappatross());
        pokemon.add(new Blufable());
        pokemon.add(new Conchle());
        pokemon.add(new Turtlantis());
        pokemon.add(new Ittibitti());
        pokemon.add(new Nemish());
        pokemon.add(new Imprioni(new Stats(410, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new Slugcus());
        pokemon.add(new Clownemone(new Stats(410, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Finsail());
        pokemon.add(new Jellybag());
        pokemon.add(new Trasphin());
        pokemon.add(new Whaste());
        pokemon.add(new Memoroot());
        pokemon.add(new Spectralyra());
        pokemon.add(new Budgeaf());
        pokemon.add(new Gryphoyal());
        pokemon.add(new Zodiaking());
        pokemon.add(new Aburago());
        pokemon.add(new Terraor(new Stats(430, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Shadovizor());
        pokemon.add(new Whaloon());
        pokemon.add(new Orcloud());
        pokemon.add(new Deye());
        pokemon.add(new Pyroulette());
        pokemon.add(new Aerling());
        pokemon.add(new Cyclowyrm());
        pokemon.add(new Xephyron());
        pokemon.add(new Coralegion());
    }

}
