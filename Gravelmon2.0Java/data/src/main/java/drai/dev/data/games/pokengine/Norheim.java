package drai.dev.data.games.pokengine;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.mastenia.*;
import drai.dev.data.pokemon.norheim.*;
import drai.dev.data.pokemon.norheim.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
//done
public class Norheim extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Norheim();
    private Norheim() {
        super("Norheim", "https://pokengine.org/search?query=mons+region:03mnu33c");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Gnatle().addLabels(Label.STARTER));
        addNewPokemon(new Growel().addLabels(Label.STARTER));
        addNewPokemon(new Huskerous().addLabels(Label.STARTER));
        addNewPokemon(new Lilyquack().addLabels(Label.STARTER));
        addNewPokemon(new Weeduck().addLabels(Label.STARTER));
        addNewPokemon(new Elegander().addLabels(Label.STARTER));
        addNewPokemon(new Minkit().addLabels(Label.STARTER));
        addNewPokemon(new Freicat().addLabels(Label.STARTER));
        addNewPokemon(new Gattekat().addLabels(Label.STARTER));
        addNewPokemon(new Bunbear().addLabels(Label.STARTER));
        addNewPokemon(new Combjorn().addLabels(Label.STARTER));
        addNewPokemon(new Burnbjorn().addLabels(Label.STARTER));
        addNewPokemon(new Ignewt().addLabels(Label.STARTER));
        addNewPokemon(new Hexelotl().addLabels(Label.STARTER));
        addNewPokemon(new Hylamancer().addLabels(Label.STARTER));
        addNewPokemon(new Calfyr().addLabels(Label.STARTER));
        addNewPokemon(new Pyrelk().addLabels(Label.STARTER));
        addNewPokemon(new Helelk().addLabels(Label.STARTER));
        addNewPokemon(new Pouffy().addLabels(Label.STARTER));
        addNewPokemon(new Puffard().addLabels(Label.STARTER));
        addNewPokemon(new Pelasquall().addLabels(Label.STARTER));
        addNewPokemon(new Buppie().addLabels(Label.STARTER));
        addNewPokemon(new Bubawl().addLabels(Label.STARTER));
        addNewPokemon(new Brinarder().addLabels(Label.STARTER));
        addNewPokemon(new Bayby().addLabels(Label.STARTER));
        addNewPokemon(new Tuscal().addLabels(Label.STARTER));
        addNewPokemon(new Norwale().addLabels(Label.STARTER));
        addNewPokemon(new Larver());
        addNewPokemon(new Strikoon());
        addNewPokemon(new Battlefly());
        addNewPokemon(new Mothight());
        addNewPokemon(new NorheimanRattata("", Aspect.NORHEIMAN));
        addNewPokemon(new Rowdent());
        addNewPokemon(new Lemini());
        addNewPokemon(new Gnimmel());
        addNewPokemon(new Wolverage());
        addNewPokemon(new Beboink());
        addNewPokemon(new Yoikid());
        addNewPokemon(new Hyfae());
        addNewPokemon(new Shrumin());
        addNewPokemon(new Ignikid());
        addNewPokemon(new Furyture());
        addNewPokemon(new Speyeder());
        addNewPokemon(new Thoriller());
        addNewPokemon(new Thormite());
        addNewPokemon(new Birdler());
        addNewPokemon(new Magpyja());
        addNewPokemon(new Beberin());
        addNewPokemon(new Nimbairy());
        addNewPokemon(new Bomblebee());
        addPokedexPokemon("combee, vespiquen");
        addNewPokemon(new Draftbee());
        addNewPokemon(new Snootsnoot());
        addNewPokemon(new Snowl());
        addNewPokemon(new Wispear());
        addNewPokemon(new Roomere());
        addNewPokemon(new Scubaa());
        addNewPokemon(new Hydroram());
        addNewPokemon(new NorheimanFoongus("", Aspect.NORHEIMAN));
        addNewPokemon(new Chantarule());
        addNewPokemon(new Chantabrute());

        addNewPokemon(new Bunnler());
        addNewPokemon(new Spinache());
        addNewPokemon(new Beatroot());
        addNewPokemon(new Moler());
        addNewPokemon(new Moleheimer());
        addNewPokemon(new Potiti());
        addNewPokemon(new Potota(new Stats(476, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        var tadit = new Tadit();
        addNewPokemon(tadit);
        addNewPokemon(new MastenianTadit("", Aspect.MASTENIAN));
        addNewPokemon(new Ribhit());
        addNewPokemon(new Thikachoo(new Stats(435, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addPokedexPokemon("surskit");
        addNewPokemon(new NorheimanMasquerain("Masquerain", Aspect.NORHEIMAN, new Stats(454, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Surgeskit());
        addNewPokemon(new NorheimanVoltorb("", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanElectrode("", Aspect.NORHEIMAN, new Stats(490, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Firipeck());
        addNewPokemon(new Fyrepecker());
        addNewPokemon(new Bwug());
        addNewPokemon(new Bwairy(new Stats(456, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Shrisker());
        addNewPokemon(new Swirrell());
        addNewPokemon(new Meerii());
        addNewPokemon(new Laxish(new Stats(387, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Tourtell());
        addNewPokemon(new Thistelle(new Stats(407, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Aquatick());
        addNewPokemon(new Clagcoon());
        addNewPokemon(new Yggdraflygg());
        addPokedexPokemon("pineco");
        addNewPokemon(new NorheimanForretress("", Aspect.NORHEIMAN, new Stats(465, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Grublin());
        addNewPokemon(new Wyrmlagar());
        addNewPokemon(new Pumfin());

        addNewPokemon(new Toxing());
        addNewPokemon(new Toxiver());
        addNewPokemon(new Antle());
        addNewPokemon(new Magnificant());
        addNewPokemon(new Pyrstack(new Stats(456, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new NorheimanRookidee("", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanCorvisquire("", Aspect.NORHEIMAN));
        addNewPokemon(new Corvhugen());
        addNewPokemon(new NorheimanFalinks("", Aspect.NORHEIMAN));
        addNewPokemon(new Vaiking());
        addNewPokemon(new Fulion());
        addNewPokemon(new Lopiliar());
        addNewPokemon(new Rokstone());
        addNewPokemon(new Temto(new Stats(456, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_DEFENCE))));
        addPokedexPokemon("gossifleur, eldegoss");
        addNewPokemon(new Witherscence());
        addNewPokemon(new Slickle());
        addNewPokemon(new Stricklisk());
//        addNewPokemon(new Mudrake()); Missing Art
//        addNewPokemon(new Niidrake()); Member of Line not Finished
        addNewPokemon(new Eolid());
        addNewPokemon(new Eosoli());
        addNewPokemon(new Eoterra());
        addNewPokemon(new Tibeti());
        addNewPokemon(new Greynine());
        addNewPokemon(new NorheimanUnown("", Aspect.NORHEIMAN));
        addNewPokemon(new Waugur());
        addNewPokemon(new Svalbat());
        addNewPokemon(new Svalor(new Stats(440, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addPokedexPokemon("slugma, magcargo");
        addNewPokemon(new Escaruption(new Stats(578, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Dragamant());
        addNewPokemon(new Snhail());
        addNewPokemon(new Foulfoal());
        addNewPokemon(new Sleepnir());
        addNewPokemon(new Kittry());
        addNewPokemon(new Pawstry(new Stats(510, StatArchetype.MIXED_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Cariboo());
        addNewPokemon(new Spectrelk());
        addNewPokemon(new Flaki());
        addNewPokemon(new Oarora());
        addNewPokemon(new Jaggagon(new Stats(477, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Snovice());
        addNewPokemon(new Aprintice());
        addNewPokemon(new Adepthawl(new Stats(567, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new NorheimanSeel("", Aspect.NORHEIMAN));
        addNewPokemon(new Sealady(new Stats(475, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Streuming());
        addNewPokemon(new Basshark());
        addNewPokemon(new Mannbrann());
        addNewPokemon(new Sardiner());
        addNewPokemon(new Charctic());
        addNewPokemon(new Pengwin());
        addNewPokemon(new Lilheim());
        addNewPokemon(new Heimdrake());
        addNewPokemon(new Lilpras());
        addPokedexPokemon("lapras");
        addPokedexPokemon("horsea");
        addNewPokemon(new NorheimanSeadra("", Aspect.NORHEIMAN));
        addNewPokemon(new Queendra(new Stats(540, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new NorheimanCorphish("Corphish", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanCrawdaunt("Crawdaunt", Aspect.NORHEIMAN, new Stats(468, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));
        addPokedexPokemon("wingull");
        addNewPokemon(new Seascull(new Stats(440, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Charryon());
        addNewPokemon(new NorheimanWailmer("Wailmer", Aspect.NORHEIMAN));
        addNewPokemon(new Wailwhale(new Stats(500, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Yellifish());
        addNewPokemon(new Phantocean(new Stats(498, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of())));
        addNewPokemon(new Birdurr(new Stats(376, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Mylili(new Stats(387, StatArchetype.MIXED_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        var crudecay = new Crudecay();
        addNewPokemon(crudecay);
        addNewPokemon(new MastenianCrudecay("", Aspect.MASTENIAN));
        addNewPokemon(new NorheimanShellder("", Aspect.NORHEIMAN));
        addNewPokemon(new Hingjaw());
        addNewPokemon(new Saberian());
        addNewPokemon(new NorheimanDitto("", Aspect.NORHEIMAN));
        addNewPokemon(new Wreggog());
        addNewPokemon(new Terrahorn());
        addNewPokemon(new Thoraxe(new Stats(500, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Dunesparr());
        addNewPokemon(new Milthunk(new Stats(490, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Deviburn());
        addNewPokemon(new Valbear());
        addNewPokemon(new NorheimanNumel("Numel", Aspect.NORHEIMAN));
        addNewPokemon(new Mountox(new Stats(460, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Rampina(new Stats(456, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new NorheimanDiglett("", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanDugtrio("", Aspect.NORHEIMAN, new Stats(454, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addPokedexPokemon("snover");
        addNewPokemon(new Permaent(new Stats(494, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Uldidi());
        addNewPokemon(new Hulding());
        addNewPokemon(new Huldamer(new Stats(567, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));

        addNewPokemon(new Booseed());
        addNewPokemon(new Glowghast(new Stats(512, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new NorheimanGlimmora("", Aspect.NORHEIMAN, new Stats(525, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Anenome());
        addNewPokemon(new Trollskgur());
        addNewPokemon(new Sampig(new Stats(412, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Bloorn(new Stats(387, StatArchetype.BULKY_SUPPORT,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Lansor(new Stats(500, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Rhydoom(new Stats(485, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new Crimgon());
        addNewPokemon(new Slamander(new Stats(452, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new NorheimanSigilyph("", Aspect.NORHEIMAN));
        addNewPokemon(new Gloatem());
        addNewPokemon(new Aydoliman(new Stats(487, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Elefjant());
        addNewPokemon(new Mamoheim(new Stats(532, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new Tundrius(new Stats(460, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Missacko(new Stats(453, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
//        addNewPokemon(new NorheimanShinx(403)); Member of line Not Finished
//        addNewPokemon(new NorheimanLuxio(404)); Missing Art
//        addNewPokemon(new NorheimanLuxray(405)); Member of line Not Finished
        addPokedexPokemon("misdreavus");
        addNewPokemon(new NorheimanMismagius("", Aspect.NORHEIMAN, new Stats(495, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new NorheimanHoundour("", Aspect.NORHEIMAN));
        addNewPokemon(new Grimgarmr(new Stats(500, StatArchetype.MIXED_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Reavler());
        addNewPokemon(new Safian());
        addNewPokemon(new Skatini());
        addNewPokemon(new Skaterace());
        addNewPokemon(new Spelewink());
        addNewPokemon(new Burnmigi(new Stats(431, StatArchetype.MIXED_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new Fjordrake(new Stats(512, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Wulca());
        addNewPokemon(new Wulcrush());
        addNewPokemon(new Oystr());
        addNewPokemon(new Monsturge(new Stats(487, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new Chiwowwa());
        addNewPokemon(new Woofurr());
        addNewPokemon(new Varghast());
        addPokedexPokemon("dratini");
        addNewPokemon(new NorheimanDragonair("", Aspect.NORHEIMAN));
        addNewPokemon(new Dracoknight());
        addNewPokemon(new Kiderr());
        addNewPokemon(new Goaterr());
        addNewPokemon(new Goathorr());
        addNewPokemon(new Afunn());
        addNewPokemon(new Volcunn(new Stats(534, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Mountunn(new Stats(534, StatArchetype.SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Glacunn(new Stats(534, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Conduvan().addLabels(Label.ULTRA_BEAST));
        addNewPokemon(new Wellmr().addLabels(Label.ULTRA_BEAST));
        addNewPokemon(new Gazhel().addLabels(Label.ULTRA_BEAST));
        addNewPokemon(new Dracruel().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Auumbull().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Spiritnir().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Valcurie().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Steinfjorir().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Fifii().addLabels(Label.MYTHICAL));
        addNewPokemon(new Emii().addLabels(Label.MYTHICAL));
        addNewPokemon(new Grimapa().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Hoglog().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Deiteress().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Hamarrcal().addLabels(Label.LEGENDARY));
        addNewPokemon(new Wyrmundel().addLabels(Label.LEGENDARY));
        addNewPokemon(new Wulfang().addLabels(Label.LEGENDARY));
        addNewPokemon(new Squisker().addLabels(Label.MYTHICAL));

    }

}
