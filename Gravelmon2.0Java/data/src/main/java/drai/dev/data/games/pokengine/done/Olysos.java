package drai.dev.data.games.pokengine.done;


import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.olysos.*;
import drai.dev.data.pokemon.olysos.OlysosianScroul;
import drai.dev.data.pokemon.olysos.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Olysos extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Olysos();

    private Olysos() {
        super("Olysos");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Cubtus().addLabels(Label.STARTER));
        addNewPokemon(new Paddorn().addLabels(Label.STARTER));
        addNewPokemon(new Maanzagaro().addLabels(Label.STARTER));
        addNewPokemon(new Flambah().addLabels(Label.STARTER));
        addNewPokemon(new Ramligh().addLabels(Label.STARTER));
        addNewPokemon(new Vulkynamo().addLabels(Label.STARTER));
        addNewPokemon(new Sharkin().addLabels(Label.STARTER));
        addNewPokemon(new Mawrine().addLabels(Label.STARTER));
        addNewPokemon(new Orcanfrak().addLabels(Label.STARTER));
        addNewPokemon(new Phasmox());
        addNewPokemon(new Teumixen());
        addNewPokemon(new Arfruff());
        addNewPokemon(new Laelupus());
        addNewPokemon(new Woodpeckit());
        addNewPokemon(new Peckster());
        addNewPokemon(new Peckussion());
        addNewPokemon(new Inferpillar());
        addNewPokemon(new Flamupet());
        addNewPokemon(new Flamothra(new Stats(480, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Gnaphid());
        addNewPokemon(new Locusteror(new Stats(450, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED, StatType.ATTACK))));
        addNewPokemon(new Punling());
        addNewPokemon(new Floretaya());
        addNewPokemon(new Grandrupe(new Stats(512, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPEED))));
        addNewPokemon(new Happetite());
        addNewPokemon(new Serposter());
        addNewPokemon(new Venobat());
        addNewPokemon(new Noseferatu(new Stats(430, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Tryprock());
        addNewPokemon(new Trypagnet());
        addNewPokemon(new Trypolisk());
        addNewPokemon(new Grimlin());
        addNewPokemon(new Grumpelstil());
        addNewPokemon(new Oozegrim());
        addNewPokemon(new Kopiuzu());
        addNewPokemon(new Kebuzu());
        addNewPokemon(new Purazu(new Stats(524, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Molore());
        addNewPokemon(new Minerolt(new Stats(445, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Lunuhu());
        addNewPokemon(new Oracowl(new Stats(445, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Plagfowl());
        addNewPokemon(new Misphecy(new Stats(445, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Piedow());
        addNewPokemon(new Ceryneer(new Stats(486, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Kabby());
        addNewPokemon(new Avalak(new Stats(486, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new OlysosianBuneary("", Aspect.OLYSOSIAN));
        addNewPokemon(new OlysosianLopunny("", Aspect.OLYSOSIAN, new Stats(480, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED, StatType.DEFENCE))));
        addNewPokemon(new Bubby());
        addNewPokemon(new Coarsent(new Stats(475, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Yinyan(new Stats(400, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Vivater());
        addNewPokemon(new Hydrona(new Stats(553, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Squishid());
        addNewPokemon(new Squidgeist());
        addNewPokemon(new Qoxipus());
        addNewPokemon(new Plaxista(new Stats(435, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Lapili(new Stats(312, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Tasmon());
        addNewPokemon(new Casanovil());
        addNewPokemon(new Lavaleon());
        addNewPokemon(new Chamelaze(new Stats(486, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Lavyrm());
        addNewPokemon(new Maganon());
        addNewPokemon(new Eruptinon());
        addPokedexPokemon("torkoal");
        addNewPokemon(new Tortorge());
        addNewPokemon(new OlysosianMightyena("", Aspect.OLYSOSIAN));
        addNewPokemon(new OlysosianPoochyena("", Aspect.OLYSOSIAN));
        addNewPokemon(new Alphayena(new Stats(500, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED, StatType.ATTACK))));
        addNewPokemon(new Pepstep());
        addNewPokemon(new Devilance());
        addNewPokemon(new Twoghast());
        addNewPokemon(new Forcaken(new Stats(456, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new OlysosianScroul("", Aspect.OLYSOSIAN));
        addNewPokemon(new Scrolock());
        addNewPokemon(new Skarawel());
        addNewPokemon(new Traplat());
        addNewPokemon(new Trapolem(new Stats(486, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Allnown());
        addNewPokemon(new Mageleon(new Stats(525, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED, StatType.SPEED, StatType.SPEED, StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Chereon(new Stats(525, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP, StatType.HP, StatType.DEFENCE, StatType.ATTACK))));
        addNewPokemon(new Rustank());
        addNewPokemon(new Steamare());
        addNewPokemon(new Artikit().addLabels(Label.FOSSIL));
        addNewPokemon(new Sabretal(new Stats(525, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED, StatType.ATTACK))).addLabels(Label.FOSSIL));
        addNewPokemon(new Solsaur().addLabels(Label.FOSSIL));
        addNewPokemon(new Spinerno(new Stats(525, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE, StatType.ATTACK))).addLabels(Label.FOSSIL));
        addNewPokemon(new OlysosianSkorupi("", Aspect.OLYSOSIAN));
        addNewPokemon(new OlysosianDrapion("", Aspect.OLYSOSIAN,
                new Stats(500, StatArchetype.FAST_SPECIAL_ATTACKER,
                        List.of(StatType.SPEED, StatType.ATTACK))));
        addNewPokemon(new Snugub());
        addNewPokemon(new Plushug(new Stats(500, StatArchetype.MIXED_WALL,
                List.of(StatType.HP, StatType.HP))));
        addNewPokemon(new Draconaut().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Nebulazer().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Velocidron(new Stats(600, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE, StatType.SPECIAL_ATTACK, StatType.SPEED))).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Cupidove(new Stats(478, StatArchetype.FAST_SUPPORT,
                List.of(StatType.SPEED, StatType.ATTACK))));
        addNewPokemon(new Kismean(new Stats(478, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED, StatType.ATTACK))));
        addNewPokemon(new Kryuu());
        addNewPokemon(new Kryoalis());
        addNewPokemon(new Phyuu());
        addNewPokemon(new Phosos());
        addNewPokemon(new Anyuu().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Anufelis().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Kaisaos().addLabels(Label.LEGENDARY));
        addNewPokemon(new Monokron().addLabels(Label.LEGENDARY));
        addNewPokemon(new Klepeck());
        addNewPokemon(new Magusong(new Stats(440, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Yukibi());
        addNewPokemon(new Yukiku(new Stats(440, StatArchetype.SPECIAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new Safrion());
        addNewPokemon(new Saffry(new Stats(480, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE, StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Nagamufin());
        addNewPokemon(new Mediva());
        addNewPokemon(new Ladivy(new Stats(533, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK, StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Terrino(new Stats(470, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Mermana());
        addNewPokemon(new Fabumera(new Stats(460, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK, StatType.HP))));
        addNewPokemon(new Dideep());
        addNewPokemon(new Searkat(new Stats(455, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Mosaile());
        addNewPokemon(new Krokoblok());
        addNewPokemon(new Mosalegod(new Stats(532, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK, StatType.ATTACK))));
        addNewPokemon(new Flufflet());
        addNewPokemon(new Chrysow(new Stats(465, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Worrym());
        addNewPokemon(new Sangorko());
        addNewPokemon(new OlysosianZombark("", Aspect.OLYSOSIAN)); //TODO
        addNewPokemon(new Serenine(new Stats(490, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
    }

}
