package drai.dev.data.games.pokemmo.done;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.orbis.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Orbis extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Orbis();
    private Orbis() {
        super("Orbis");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new PokPalv1());
        addNewPokemon(new Rascaloon());
        addNewPokemon(new Raccowl());
        addNewPokemon(new Squabbiz());
        addNewPokemon(new Executove());
        addNewPokemon(new Presigeont());
        addNewPokemon(new Magpick());
        addNewPokemon(new Magpeist());
        addNewPokemon(new Nappi());
        addNewPokemon(new Rubbage());
        addNewPokemon(new Buzzero());
        addNewPokemon(new Bulbillar());
        addNewPokemon(new Glowva());
        addNewPokemon(new Sectalamp());
        addNewPokemon(new Grubbrush());
        addNewPokemon(new Pupallet());
        addNewPokemon(new Beasel());
        addNewPokemon(new Squeebee());
        addNewPokemon(new Baldy());
        addNewPokemon(new Rubbaldy());
        addNewPokemon(new Stickigum());
        addNewPokemon(new Stickisticky());
        addNewPokemon(new Solseed());
        addNewPokemon(new Suryala(new Stats(410, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Bellchsia());
        addNewPokemon(new Fuchsiella());
        addNewPokemon(new Fuchsiadame());
        addNewPokemon(new Blanfish());
        addNewPokemon(new Dracolore());
        addNewPokemon(new Kingulum());
        addNewPokemon(new Acrown());
        addNewPokemon(new Majestree());
        addNewPokemon(new Timbug());
        addNewPokemon(new Loustache());
        addNewPokemon(new Spoutot());
        addNewPokemon(new Fountier());
        addNewPokemon(new Fonsdame());
        addNewPokemon(new Cerforyu());
        addNewPokemon(new Pampurr());
        addNewPokemon(new Freyurr());
        addNewPokemon(new Intimeow());
        addNewPokemon(new Necromata());
        addNewPokemon(new Caffiend());
        addNewPokemon(new Baristroll());
        addNewPokemon(new Delistork());
        addNewPokemon(new Trashlug());
        addNewPokemon(new Trashcargot());
        addNewPokemon(new Chumpost());
        addNewPokemon(new Componion());
        addNewPokemon(new Badbud());
        addNewPokemon(new Thorstle());
        addNewPokemon(new Thistance());
        addNewPokemon(new Nettic());
        addNewPokemon(new Stinttle());
        addNewPokemon(new Stimanic());
        addNewPokemon(new Traffimite());
        addNewPokemon(new Traffitron());
        addNewPokemon(new Skenteur());
        addNewPokemon(new Parfumou());
        addNewPokemon(new Searsage());
        addNewPokemon(new Frankfurnt());
        addNewPokemon(new Vermob());
        addNewPokemon(new Veradmin()); //Renamed from Verminion
        addNewPokemon(new Vermicapone());
        addNewPokemon(new Monsewer());
        addNewPokemon(new Miremaid());
        addNewPokemon(new Rubblock());
        addNewPokemon(new Debruin());
        addNewPokemon(new Bourubble());
        addNewPokemon(new Uninail());
        addNewPokemon(new Desertusk(new Stats(430, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Burrorm());
        addNewPokemon(new Burryrm());
        addNewPokemon(new Baybee());
        addNewPokemon(new Drillbee());
        addNewPokemon(new Diggbee());
        addNewPokemon(new Honarchee());
        addNewPokemon(new Tarexite(new Stats(500, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Weyabitt());
        addNewPokemon(new Weyatonne());
        addNewPokemon(new Pomdan()); //Renamed from Pompuff
        addNewPokemon(new Pufflepom());
        addNewPokemon(new Battrol());
        addNewPokemon(new Battrolor());
        addNewPokemon(new Kankrab());
        addNewPokemon(new Wrekrab());
        addNewPokemon(new Sootot());
        addNewPokemon(new Sweepmu());
        addNewPokemon(new Palmbrella());
        addNewPokemon(new Feistsea());
        addNewPokemon(new Letharleo());
        addNewPokemon(new Chickaring());
        addNewPokemon(new Seadeek());
        addNewPokemon(new Cappatross());
        addNewPokemon(new Blufable());
        addNewPokemon(new Conchle());
        addNewPokemon(new Turtlantis());
        addNewPokemon(new Ittibitti());
        addNewPokemon(new Nemish());
        addNewPokemon(new Imprioni(new Stats(410, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Slugcus());
        addNewPokemon(new Clownemone(new Stats(410, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Finsail());
        addNewPokemon(new Jellybag());
        addNewPokemon(new Trasphin());
        addNewPokemon(new Whaste());
        addNewPokemon(new Memoroot());
        addNewPokemon(new Spectralyra());
        addNewPokemon(new Budgeaf());
        addNewPokemon(new Gryphoyal());
        addNewPokemon(new Zodiaking());
        addNewPokemon(new Aburago());
        addNewPokemon(new Terraor(new Stats(430, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Shadovizor());
        addNewPokemon(new Whaloon());
        addNewPokemon(new Orcloud());
        addNewPokemon(new Deye());
        addNewPokemon(new Pyroulette());
        addNewPokemon(new Aerling().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Cyclowyrm().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Xephyron().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Coralegion().addLabels(Label.LEGENDARY));
    }

}
