package drai.dev.data.games.pbs;


import drai.dev.data.pokemon.soulstones.*;
import drai.dev.data.pokemon.soulstones.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Soulstones extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Soulstones();
    private Soulstones() {
        super("Soulstones");
    }

    @Override
    public void registerPokemon() {
        addPokedexPokemon( "Bulbasaur-epoch," +
                "Ivysaur-epoch," +
                "Venusaur-epoch," +
                "Charmander-epoch," +
                "Charmeleon-epoch," +
                "Charizard-epoch," +
                "Koffing-epoch," +
                "Weezing-epoch," +
                "Gastly-epoch," +
                "Haunter-epoch," +
                "Gengar-epoch," +
                "Doduo-epoch," +
                "Dodrio-epoch," +
                "Ekans-epoch," +
                "Arbok-epoch," +
                "Staryu-epoch," +
                "Starmie-epoch," +
                "Onix-epoch," +
                "Zubat-epoch," +
                "Golbat-epoch," +
                "Tangela-epoch," +
                "Magikarp-epoch," +
                "Gyarados-epoch," +
                "Ponyta-epoch," +
                "Rapidash-epoch," +
                "Geodude-epoch," +
                "Graveler-epoch," +
                "Golem-epoch," +
                "Drowzee-epoch," +
                "Hypno-epoch," +
                "Seel-epoch," +
                "Dewgong-epoch," +
                "Kabuto-epoch," +
                "Kabutops-epoch," +
                "Aerodactyl-epoch," +
                "Krabby-epoch," +
                "Kingler-epoch," +
                "Voltorb-epoch," +
                "Electrode-epoch," +
                "Weedle-epoch," +
                "Kakuna-epoch," +
                "Beedrill-epoch," +
                "Machop-epoch," +
                "Machoke-epoch," +
                "Machamp-epoch," +
                "Tauros-epoch," +
                "Electabuzz-epoch," +
                "Magmar-epoch," +
                "Exeggcute-epoch," +
                "Exeggutor-epoch," +
                "Grimer-epoch," +
                "Muk-epoch," +
                "Abra-epoch," +
                "Kadabra-epoch," +
                "Alakazam-epoch," +
                "Psyduck-epoch," +
                "Golduck-epoch," +
                "Eevee-epoch," +
                "Vaporeon-epoch," +
                "Jolteon-epoch," +
                "Flareon-epoch," +
                "Meowth-epoch," +
                "Persian-epoch," +
                "Rattata-epoch," +
                "Raticate-epoch," +
                "Slowpoke-epoch," +
                "Slowbro-epoch," +
                "Oddish-epoch," +
                "Gloom-epoch," +
                "Vileplume-epoch," +
                "Horsea-epoch," +
                "Seadra-epoch," +
                "Venonat-epoch," +
                "Venomoth-epoch," +
                "Caterpie-epoch," +
                "Metapod-epoch," +
                "Butterfree-epoch," +
                "Mankey-epoch," +
                "Primeape-epoch," +
                "Paras-epoch," +
                "Parasect-epoch," +
                "Lapras-epoch," +
                "Diglett-epoch," +
                "Dugtrio-epoch," +
                "Pidgey-epoch," +
                "Pidgeotto-epoch," +
                "Pidgeot-epoch," +
                "Chansey-epoch," +
                "Tentacool-epoch," +
                "Tentacruel-epoch," +
                "Growlithe-epoch," +
                "Arcanine-epoch," +
                "Pikachu-epoch," +
                "Raichu-epoch," +
                "Goldeen-epoch," +
                "Seaking-epoch," +
                "Magnemite-epoch," +
                "Magneton-epoch," +
                "Spearow-epoch," +
                "Fearow-epoch," +
                "Jigglypuff-epoch," +
                "Wigglytuff-epoch," +
                "Ditto-epoch," +
                "Cub-epochone," +
                "Marowak-epoch," +
                "Horsea-epochone," +
                "Seadra-epochone," +
                "Omanyte-epoch," +
                "Omastar-epoch," +
                "Grimer-epochone," +
                "Muk-epochone," +
                "Vulpix-epoch," +
                "Ninetales-epoch," +
                "Mrmime-epoch," +
                "Voltorb-epochone," +
                "Electrode-epochone," +
                "Exeggcute-epochone," +
                "Exeggutor-epochone," +
                "Doduo-epochone," +
                "Dodrio-epochone," +
                "Machop-epochone," +
                "Machoke-epochone," +
                "Machamp-epochone," +
                "Jynx-epoch," +
                "Poliwag-epoch," +
                "Poliwhirl-epoch," +
                "Poliwrath-epoch," +
                "Hitmonlee-epoch," +
                "Hitmonchan-epoch," +
                "Scyther-epoch," +
                "Pinsir-epoch," +
                "Geodude-epochone," +
                "Graveler-epochone," +
                "Golem-epochone," +
                "Clefairy-epoch," +
                "Clefable-epoch," +
                "Snorlax-epoch," +
                "Magnemite-epochone," +
                "Magneton-epochone," +
                "Porygon-epoch," +
                "Dratini-epoch," +
                "Dragonair-epoch," +
                "Dragonite-epoch," +
                "Kabuto-epochone," +
                "Kabutops-epochone," +
                "Lapras-epochone," +
                "Chikorita-epoch," +
                "Bayleef-epoch," +
                "Meganium-epoch," +
                "Cyndaquil-epoch," +
                "Quilava-epoch," +
                "Typhlosion-epoch," +
                "Totodile-epoch," +
                "Croconaw-epoch," +
                "Feraligatr-epoch," +
                "Chikorita-epochone," +
                "Bayleef-epochone," +
                "Meganium-epochone," +
                "Cyndaquil-epochone," +
                "Quilava-epochone," +
                "Typhlosion-epochone," +
                "Totodile-epochone," +
                "Croconaw-epochone," +
                "Feraligatr-epochone," +
                "Steelix-epoch," +
                "Slugma-epoch," +
                "Magcargo-epoch," +
                "Natu-epoch," +
                "Xatu-epoch," +
                "Spinarak-epoch," +
                "Ariados-epoch," +
                "Stantler-epoch," +
                "Ledyba-epoch," +
                "Ledian-epoch," +
                "Gligar-epoch," +
                "Sudowoodo-epoch," +
                "Hoothoot-epoch," +
                "Noctowl-epoch," +
                "Elekid-epoch," +
                "Magby-epoch," +
                "Larvitar-epoch," +
                "Pupitar-epoch," +
                "Tyranitar-epoch," +
                "Mareep-epoch," +
                "Flaaffy-epoch," +
                "Ampharos-epoch," +
                "Heracross-epoch," +
                "Teddiursa-epoch," +
                "Ursaring-epoch," +
                "Espeon-epoch," +
                "Umbreon-epoch," +
                "Aipom-epoch," +
                "Slowking-epoch," +
                "Bellossom-epoch," +
                "Sunkern-epoch," +
                "Sunflora-epoch," +
                "Kingdra-epoch," +
                "Chinchou-epoch," +
                "Lanturn-epoch," +
                "Marill-epoch," +
                "Azumarill-epoch," +
                "Dunsparce-epoch," +
                "Corsola-epoch," +
                "Mantine-epoch," +
                "Murkrow-epoch," +
                "Blissey-epoch," +
                "Pichu-epoch," +
                "Igglybuff-epoch," +
                "Swinub-epoch," +
                "Piloswine-epoch," +
                "Phanpy-epoch," +
                "Donphan-epoch," +
                "Smeargle-epoch," +
                "Slugma-epochone," +
                "Magcargo-epochone," +
                "Stantler-epochone," +
                "Smoochum-epoch," +
                "Yanma-epoch," +
                "Yanma-epochone," +
                "Remoraid-epoch," +
                "Octillery-epoch," +
                "Misdreavus-epoch," +
                "Politoed-epoch," +
                "Tyrogue-epoch," +
                "Hitmontop-epoch," +
                "Scizor-epoch," +
                "Murkrow-epochone," +
                "Cleffa-epoch," +
                "Houndour-epoch," +
                "Houndoom-epoch," +
                "Sneasel-epoch," +
                "Miltank-epoch," +
                "Swinub-epochone," +
                "Piloswine-epochone," +
                "Porygon2-epoch," +
                "Wooper-epoch," +
                "Quagsire-epoch," +
                "Delibird-epoch," +
                "Hoppip-epoch," +
                "Skiploom-epoch," +
                "Jumpluff-epoch," +
                "Kingdra-epochone," +
                "Pineco-epoch," +
                "Forretress-epoch," +
                "Hoothoot-epochone," +
                "Noctowl-epochone," +
                "Hoppip-epochone," +
                "Skiploom-epochone," +
                "Jumpluff-epochone," +
                "Skarmory-epoch," +
                "Sentret-epoch," +
                "Furret-epoch," +
                "Crobat-epoch," +
                "Treecko-epoch," +
                "Grovyle-epoch," +
                "Sceptile-epoch," +
                "Mudkip-epoch," +
                "Marshtomp-epoch," +
                "Swampert-epoch," +
                "Mudkip-epochone," +
                "Marshtomp-epochone," +
                "Swampert-epochone," +
                "Wailmer-epoch," +
                "Wailord-epoch," +
                "Nosepass-epoch," +
                "Gulpin-epoch," +
                "Swalot-epoch," +
                "Baltoy-epoch," +
                "Claydol-epoch," +
                "Lunat-epochone," +
                "Solrock-epoch," +
                "Shroomish-epoch," +
                "Breloom-epoch," +
                "Carvanha-epoch," +
                "Sharpedo-epoch," +
                "Snorunt-epoch," +
                "Glalie-epoch," +
                "Sableye-epoch," +
                "Swablu-epoch," +
                "Altaria-epoch," +
                "Duskull-epoch," +
                "Dusclops-epoch," +
                "Aron-epoch," +
                "Lairon-epoch," +
                "Aggron-epoch," +
                "Wurmple-epoch," +
                "Silcoon-epoch," +
                "Beautifly-epoch," +
                "Wurmple-epochone," +
                "Cascoon-epoch," +
                "Dustox-epoch," +
                "Feebas-epoch," +
                "Milotic-epoch," +
                "Seedot-epoch," +
                "Nuzleaf-epoch," +
                "Shiftry-epoch," +
                "Ralts-epoch," +
                "Kirlia-epoch," +
                "Gardevoir-epoch," +
                "Numel-epoch," +
                "Camerupt-epoch," +
                "Azurill-epoch," +
                "Poochyena-epoch," +
                "Mightyena-epoch," +
                "Absol-epoch," +
                "Beldum-epoch," +
                "Metang-epoch," +
                "Metagross-epoch," +
                "Meditite-epoch," +
                "Medicham-epoch," +
                "Nincada-epoch," +
                "Ninjask-epoch," +
                "Shedinja-epoch," +
                "Lileep-epoch," +
                "Cradily-epoch," +
                "Cacnea-epoch," +
                "Cacturne-epoch," +
                "Taillow-epoch," +
                "Swellow-epoch," +
                "Spheal-epoch," +
                "Sealeo-epoch," +
                "Walrein-epoch," +
                "Surskit-epoch," +
                "Masquerain-epoch," +
                "Wingull-epoch," +
                "Pelipper-epoch," +
                "Electrike-epoch," +
                "Manectric-epoch," +
                "Torkoal-epoch," +
                "Roselia-epoch," +
                "Absol-epochone," +
                "Sableye-epochone," +
                "Swablu-epochone," +
                "Altaria-epochone," +
                "Surskit-epochone," +
                "Masquerain-epochone," +
                "Clamperl-epoch," +
                "Huntail-epoch," +
                "Gorebyss-epoch," +
                "Skitty-epochone," +
                "Delcatty-epochone," +
                "Numel-epochone," +
                "Camerupt-epochone," +
                "Zigzagoon-epoch," +
                "Lino-epochone," +
                "Trapinch-epoch," +
                "Vibrava-epoch," +
                "Flygon-epoch," +
                "Shuppet-epoch," +
                "Banette-epoch," +
                "Whismur-epoch," +
                "Loudred-epoch," +
                "Exploud-epoch," +
                "Corphish-epoch," +
                "Crawdaunt-epoch," +
                "Anorith-epoch," +
                "Armaldo-epoch," +
                "Bagon-epoch," +
                "Shelgon-epoch," +
                "Salamence-epoch," +
                "Nosepass-epochone," +
                "Slakoth-epoch," +
                "Vigoroth-epoch," +
                "Slaking-epoch," +
                "Chimecho-epoch," +
                "Roselia-epochone," +
                "Lotad-epoch," +
                "Lombre-epoch," +
                "Ludicolo-epoch," +
                "Feebas-epochone," +
                "Milotic-epochone," +
                "Skitty-epoch," +
                "Delcatty-epoch," +
                "Turtwig-epoch," +
                "Grotle-epoch," +
                "Torterra-epoch," +
                "Chimchar-epoch," +
                "Monferno-epoch," +
                "Infernape-epoch," +
                "Piplup-epoch," +
                "Prinplup-epoch," +
                "Empoleon-epoch," +
                "Probopass-epoch," +
                "Tangrowth-epoch," +
                "Finneon-epoch," +
                "Lumineon-epoch," +
                "Gliscor-epoch," +
                "Drifloon-epoch," +
                "Drifblim-epoch," +
                "Bonsly-epoch," +
                "Electivire-epoch," +
                "Magmortar-epoch," +
                "Hippopotas-epoch," +
                "Hippowdon-epoch," +
                "Bronzor-epoch," +
                "Bronzong-epoch," +
                "Dusknoir-epoch," +
                "Leafeon-epoch," +
                "Glaceon-epoch," +
                "Shellos-epoch," +
                "Gastrodon-epoch," +
                "Shellos-epochone," +
                "Gastrodon-epochone," +
                "Shellos-epochtwo," +
                "Gastrodon-epochtwo," +
                "ShellosThree-epoch," +
                "GastrodonThree-epoch," +
                "ShellosFour-epoch," +
                "GastrodonFour-epoch," +
                "ShellosFive-epoch," +
                "GastrodonFive-epoch," +
                "ShellosSix-epoch," +
                "GastrodonSix-epoch," +
                "ShellosSeven-epoch," +
                "GastrodonSeven-epoch," +
                "ShellosEight-epoch," +
                "GastrodonEight-epoch," +
                "ShellosNine-epoch," +
                "GastrodonNine-epoch," +
                "ShellosTen-epoch," +
                "GastrodonTen-epoch," +
                "ShellosEleven-epoch," +
                "GastrodonEleven-epoch," +
                "Ambipom-epoch," +
                "Starly-epoch," +
                "Staravia-epoch," +
                "Staraptor-epoch," +
                "Kricketot-epoch," +
                "Kricketune-epoch," +
                "Stunky-epoch," +
                "Skuntank-epoch," +
                "Croagunk-epoch," +
                "Toxicroak-epoch," +
                "Yanmega-epoch," +
                "Skorupi-epoch," +
                "Drapion-epoch," +
                "Spiritomb-epoch," +
                "Cherubi-epoch," +
                "Cherrim-epoch," +
                "Mantyke-epoch," +
                "Happiny-epoch," +
                "Magnez-epochone," +
                "Shinx-epoch," +
                "Luxio-epoch," +
                "Luxray-epoch," +
                "Mamoswine-epoch," +
                "Buneary-epoch," +
                "Lopunny-epoch," +
                "Buizel-epoch," +
                "Floatzel-epoch," +
                "Budew-epoch," +
                "Roserade-epoch," +
                "Gible-epoch," +
                "Gabite-epoch," +
                "Garchomp-epoch," +
                "Mimejr-epoch," +
                "Shieldon-epoch," +
                "Bastiodon-epoch," +
                "Snover-epoch," +
                "Abomasnow-epoch," +
                "Gible-epochone," +
                "Gabite-epochone," +
                "Garchomp-epochone," +
                "Yanmega-epochone," +
                "Mismagius-epoch," +
                "Riolu-epoch," +
                "Lucario-epoch," +
                "Cranidos-epoch," +
                "Rampardos-epoch," +
                "Honchkrow-epoch," +
                "Honchkrow-epochone," +
                "Bidoof-epoch," +
                "Bibarel-epoch," +
                "Carnivine-epoch," +
                "Munchlax-epoch," +
                "Probopass-epochone," +
                "Mamoswine-epochone," +
                "Chingling-epoch," +
                "Magnezone-epochone," +
                "Budew-epochone," +
                "Roserade-epochone," +
                "Porygonz-epoch," +
                "Froslass-epoch," +
                "Gallade-epoch," +
                "Weavile-epoch," +
                "Snivy-epoch," +
                "Servine-epoch," +
                "Serperior-epoch," +
                "Tepig-epoch," +
                "Pignite-epoch," +
                "Emboar-epoch," +
                "Solosis-epoch," +
                "Duosion-epoch," +
                "Reuniclus-epoch," +
                "Rufflet-epoch," +
                "Braviary-epoch," +
                "Tympole-epoch," +
                "Palpitoad-epoch," +
                "Seismitoad-epoch," +
                "Zorua-epoch," +
                "Zoroark-epoch," +
                "Ducklett-epoch," +
                "Swanna-epoch," +
                "Golett-epoch," +
                "Golurk-epoch," +
                "Larvesta-epoch," +
                "Volcarona-epoch," +
                "Roggenrola-epoch," +
                "Boldore-epoch," +
                "Gigalith-epoch," +
                "Lillipup-epoch," +
                "Herdier-epoch," +
                "Stoutland-epoch," +
                "Minccino-epoch," +
                "Cinccino-epoch," +
                "Druddigon-epoch," +
                "Woobat-epoch," +
                "Swoobat-epoch," +
                "Timburr-epoch," +
                "Gurdurr-epoch," +
                "Conkeldurr-epoch," +
                "Litwick-epoch," +
                "Lampent-epoch," +
                "Chandelure-epoch," +
                "Vanillite-epoch," +
                "Vanillish-epoch," +
                "Vanilluxe-epoch," +
                "Joltik-epoch," +
                "Galvantula-epoch," +
                "Cubchoo-epoch," +
                "Beartic-epoch," +
                "Venipede-epoch," +
                "Whirlipede-epoch," +
                "Scolipede-epoch," +
                "Deerling-epoch," +
                "Sawsbuck-epoch," +
                "Tynamo-epoch," +
                "Eelektrik-epoch," +
                "Eelektross-epoch," +
                "Basculin-epoch," +
                "Pidove-epoch," +
                "Tranquill-epoch," +
                "Unfezant-epoch," +
                "Dwebble-epoch," +
                "Crustle-epoch," +
                "Durant-epoch," +
                "Meloetta-epoch," +
                "Deino-epoch," +
                "Zweilous-epoch," +
                "Hydreigon-epoch," +
                "Yamask-epoch," +
                "Cofagrigus-epoch," +
                "Throh-epoch," +
                "Sawk-epoch," +
                "Sandile-epoch," +
                "Krokorok-epoch," +
                "Krookodile-epoch," +
                "Patrat-epoch," +
                "Watchog-epoch," +
                "Gothita-epoch," +
                "Gothorita-epoch," +
                "Gothitelle-epoch," +
                "Vullaby-epoch," +
                "Mandibuzz-epoch," +
                "Ferroseed-epoch," +
                "Ferrothorn-epoch," +
                "Gothita-epochone," +
                "Gothorita-epochone," +
                "Gothitelle-epochone," +
                "Purrloin-epoch," +
                "Liepard-epoch," +
                "Trubbish-epoch," +
                "Garbodor-epoch," +
                "Klink-epoch," +
                "Klang-epoch," +
                "Klinklang-epoch," +
                "Darumaka-epoch," +
                "Darmanitan-epoch," +
                "Roggenrola-epochone," +
                "Boldore-epochone," +
                "Gigalith-epochone," +
                "Vanillite-epochone," +
                "Vanillish-epochone," +
                "Vanilluxe-epochone," +
                "Archen-epoch," +
                "Archeops-epoch," +
                "Tirtouga-epoch," +
                "Carracosta-epoch," +
                "Munna-epoch," +
                "Musharna-epoch," +
                "Drilbur-epoch," +
                "Excadrill-epoch," +
                "Drilbur-epochone," +
                "Excadrill-epochone," +
                "Solosis-epochone," +
                "Duosion-epochone," +
                "Reuniclus-epochone," +
                "Sewaddle-epoch," +
                "Swadloon-epoch," +
                "Leavanny-epoch," +
                "Timburr-epochone," +
                "Gurdurr-epochone," +
                "Conkeldurr-epochone," +
                "Larvesta-epochone," +
                "Volcarona-epochone," +
                "Frillish-epoch," +
                "Jellicent-epoch," +
                "Blitzle-epoch," +
                "Zebstrika-epoch," +
                "Emolga-epoch," +
                "Elgyem-epoch," +
                "Beheeyem-epoch," +
                "Scraggy-epoch," +
                "Scrafty-epoch," +
                "Fennekin-epoch," +
                "Braixen-epoch," +
                "Delphox-epoch," +
                "Chespin-epoch," +
                "Quilladin-epoch," +
                "Chesnaught-epoch," +
                "Froakie-epoch," +
                "Frogadier-epoch," +
                "Greninja-epoch," +
                "Fletchling-epoch," +
                "Fletchinder-epoch," +
                "Talonflame-epoch," +
                "Bergmite-epoch," +
                "Avalugg-epoch," +
                "Amaura-epoch," +
                "Aurorus-epoch," +
                "Skrelp-epoch," +
                "Dragalge-epoch," +
                "Litleo-epoch," +
                "Pyroar-epoch," +
                "Skiddo-epoch," +
                "Gogoat-epoch," +
                "Swirlix-epoch," +
                "Slurpuff-epoch," +
                "Sylveon-epoch," +
                "Noibat-epoch," +
                "Noivern-epoch," +
                "Spritzee-epoch," +
                "Aromatisse-epoch," +
                "Furfrou-epoch," +
                "Honedge-epoch," +
                "Honedge-epochone," +
                "Honedge-epochtwo," +
                "HonedgeThree-epoch," +
                "Doublade-epoch," +
                "Doublade-epochone," +
                "Doublade-epochtwo," +
                "DoubladeThree-epoch," +
                "Aegislash-epoch," +
                "Aegislash-epochone," +
                "Aegislash-epochtwo," +
                "AegislashThree-epoch," +
                "Espurr-epoch," +
                "Meowstic-epoch," +
                "Klefki-epoch," +
                "Tyrunt-epoch," +
                "Tyrantrum-epoch," +
                "Spritzee-epochone," +
                "Aromatisse-epochone," +
                "Carbink-epoch," +
                "Goomy-epoch," +
                "Sliggoo-epoch," +
                "Goodra-epoch," +
                "Binacle-epoch," +
                "Barbaracle-epoch," +
                "Phantump-epoch," +
                "Trevenant-epoch," +
                "Helioptile-epoch," +
                "Heliolisk-epoch," +
                "Dedenne-epoch," +
                "Flabebe-epoch," +
                "Floette-epoch," +
                "Florges-epoch," +
                "Hoopa-epoch," +
                "Rowlet-epoch," +
                "Dartrix-epoch," +
                "Decidueye-epoch," +
                "Litten-epoch," +
                "Torracat-epoch," +
                "Incineroar-epoch," +
                "Popplio-epoch," +
                "Brionne-epoch," +
                "Primarina-epoch," +
                "Morelull-epoch," +
                "Shiinotic-epoch," +
                "Sandygast-epoch," +
                "Palossand-epoch," +
                "Mareanie-epoch," +
                "Toxapex-epoch," +
                "Dewpider-epoch," +
                "Araquanid-epoch," +
                "Cutiefly-epoch," +
                "Ribombee-epoch," +
                "Pikipek-epoch," +
                "Trumbeak-epoch," +
                "Toucannon-epoch," +
                "Stufful-epoch," +
                "Bewear-epoch," +
                "Bounsweet-epoch," +
                "Steenee-epoch," +
                "Tsareena-epoch," +
                "Bounsweet-epochone," +
                "Steenee-epochone," +
                "Tsareena-epochone," +
                "Dewpider-epochone," +
                "Araquanid-epochone," +
                "Mimikyu-epoch," +
                "Jangmoo-epoch," +
                "Hakamoo-epoch," +
                "Kommoo-epoch," +
                "Dhelmise-epoch," +
                "Mudbray-epoch," +
                "Mudsdale-epoch," +
                "Salandit-epoch," +
                "Salazzle-epoch," +
                "Wimpod-epoch," +
                "Golisopod-epoch," +
                "Comfey-epoch," +
                "Sobble-epoch," +
                "Drizzile-epoch," +
                "Inteleon-epoch," +
                "Rookidee-epoch," +
                "Corvisquire-epoch," +
                "Corviknight-epoch," +
                "Yamper-epoch," +
                "Boltund-epoch," +
                "Impidimp-epoch," +
                "Morgrem-epoch," +
                "Grimmsnarl-epoch," +
                "Impidimp-epochone," +
                "Morgrem-epochone," +
                "Grimmsnarl-epochone," +
                "Gossifleur-epoch," +
                "Eldegoss-epoch," +
                "Silicobra-epoch," +
                "Sandaconda-epoch," +
                "Sinistea-epoch," +
                "Polteageist-epoch," +
                "Skwovet-epoch," +
                "Greedent-epoch," +
                "Toxel-epoch," +
                "Toxtricity-epoch," +
                "Applin-epoch," +
                "Flapple-epoch," +
                "Appletun-epoch," +
                "Wooloo-epoch," +
                "Dubwool-epoch," +
                "Wooloo-epochone," +
                "Dubwool-epochone," +
                "Arrokuda-epoch," +
                "Barraskewda-epoch," +
                "Falinks-epoch," +
                "Indeedee-epoch," +
                "Pincurchin-epoch," +
                "Rolycoly-epoch," +
                "Carkol-epoch," +
                "Coalossal-epoch," +
                "Dreepy-epoch," +
                "Drakloak-epoch," +
                "Dragapult-epoch," +
                "Stonjourner-epoch," +
                "Snom-epoch," +
                "Frosmoth-epoch," +
                "Cramorant-epoch," +
                "Sizzlipede-epoch," +
                "Centiskorch-epoch," +
                "Milcery-epoch," +
                "Alcremie-epoch," +
                "Clobbopus-epoch," +
                "Grapploct-epoch," +
                "Cufant-epoch," +
                "Copperajah-epoch," +
                "Hatenna-epoch," +
                "Hattrem-epoch," +
                "Hatterene-epoch," +
                "Eternatus-epoch," +
                "Mrrime-epoch," +
                "Cursola-epoch," +
                "Obstagoon-epoch," +
                "Ursaluna-epoch," +
                "Wyrdeer-epoch," +
                "Wyrdeer-epochone," +
                "Sneasler-epoch," +
                "Basculegion-epoch," +
                "Fuecoco-epoch," +
                "Crocalor-epoch," +
                "Skeledirge-epoch," +
                "Wattrel-epoch," +
                "Kilowattrel-epoch," +
                "Finizen-epoch," +
                "Palafin-epoch," +
                "Pawmi-epoch," +
                "Pawmo-epoch," +
                "Pawmot-epoch," +
                "Tinkatink-epoch," +
                "Tinkatuff-epoch," +
                "Tinkaton-epoch," +
                "Gimmighoul-epoch," +
                "Gholdengo-epoch," +
                "Dudunsparce-epoch," +
                "Annihilape-epoch," +
                "Dipplin-epoch");
        addNewPokemon(new Galaxeon());
        addNewPokemon(new Prismeon());
        addNewPokemon(new Octaveon());

        addNewPokemon(new EpochShelmet("", Aspect.EPOCH));
        addNewPokemon(new EpochAccelgor("", Aspect.EPOCH));
        addNewPokemon(new EpochKarrablast("", Aspect.EPOCH));
        addNewPokemon(new EpochEscavalier("", Aspect.EPOCH));
        addNewPokemon(new EpochFoongus("", Aspect.EPOCH));
        addNewPokemon(new EpochAmoonguss("", Aspect.EPOCH));
        addNewPokemon(new EpochSmoliv("", Aspect.EPOCH));
        addNewPokemon(new EpochDolliv("", Aspect.EPOCH));
        addNewPokemon(new EpochArboliva("", Aspect.EPOCH));
        addNewPokemon(new EpochGrowlitheOne("", Aspect.EPOCH));
        addNewPokemon(new EpochArcanineOne("", Aspect.EPOCH));
        addNewPokemon(new EpochDuraludon("", Aspect.EPOCH));
        addNewPokemon(new EpochArchaludon("", Aspect.EPOCH));
        addNewPokemon(new EpochFrigibax("", Aspect.EPOCH));
        addNewPokemon(new EpochArctibax("", Aspect.EPOCH));
        addNewPokemon(new EpochBaxcalibur("", Aspect.EPOCH));
        addNewPokemon(new EpochCharcadet("", Aspect.EPOCH));
        addNewPokemon(new EpochArmarouge("", Aspect.EPOCH));
        addNewPokemon(new EpochCeruledge("", Aspect.EPOCH));
        addNewPokemon(new EpochAudino("", Aspect.EPOCH));
        addNewPokemon(new EpochBergmiteOne("", Aspect.EPOCH));
        addNewPokemon(new EpochAvaluggOne("", Aspect.EPOCH));
        addNewPokemon(new EpochAxew("", Aspect.EPOCH));
        addNewPokemon(new EpochFraxure("", Aspect.EPOCH));
        addNewPokemon(new EpochHaxorus("", Aspect.EPOCH));
        addNewPokemon(new EpochBarboach("", Aspect.EPOCH));
        addNewPokemon(new EpochWhiscash("", Aspect.EPOCH));
        addNewPokemon(new EpochTadbulb("", Aspect.EPOCH));
        addNewPokemon(new EpochBellibolt("", Aspect.EPOCH));
        addNewPokemon(new EpochBellsprout("", Aspect.EPOCH));
        addNewPokemon(new EpochWeepinbell("", Aspect.EPOCH));
        addNewPokemon(new EpochVictreebel("", Aspect.EPOCH));
        addNewPokemon(new EpochPawniard("", Aspect.EPOCH));
        addNewPokemon(new EpochBisharp("", Aspect.EPOCH));
        addNewPokemon(new EpochKingambit("", Aspect.EPOCH));
        addNewPokemon(new EpochSquirtle("", Aspect.EPOCH));
        addNewPokemon(new EpochWartortle("", Aspect.EPOCH));
        addNewPokemon(new EpochBlastoise("", Aspect.EPOCH));
        addNewPokemon(new EpochTorchic("", Aspect.EPOCH));
        addNewPokemon(new EpochCombusken("", Aspect.EPOCH));
        addNewPokemon(new EpochBlaziken("", Aspect.EPOCH));
        addNewPokemon(new EpochBlipbug("", Aspect.EPOCH));
        addNewPokemon(new EpochDottler("", Aspect.EPOCH));
        addNewPokemon(new EpochOrbeetle("", Aspect.EPOCH));
        addNewPokemon(new EpochBlitzleOne("", Aspect.EPOCH));
        addNewPokemon(new EpochZebstrikaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochBombirdier("", Aspect.EPOCH));
        addNewPokemon(new EpochBouffalant("", Aspect.EPOCH));
        addNewPokemon(new EpochBramblin("", Aspect.EPOCH));
        addNewPokemon(new EpochBrambleghast("", Aspect.EPOCH));
        addNewPokemon(new EpochBronzorOne("", Aspect.EPOCH));
        addNewPokemon(new EpochBronzongOne("", Aspect.EPOCH));
        addNewPokemon(new EpochBruxish("", Aspect.EPOCH));
        addNewPokemon(new EpochBunnelby("", Aspect.EPOCH));
        addNewPokemon(new EpochDiggersby("", Aspect.EPOCH));
        addNewPokemon(new EpochBurmy("", Aspect.EPOCH));
        addNewPokemon(new EpochWormadam("", Aspect.EPOCH));
        addNewPokemon(new EpochMothim("", Aspect.EPOCH));
        addNewPokemon(new EpochCacneaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochCacturneOne("", Aspect.EPOCH));
        addNewPokemon(new EpochCapsakid("", Aspect.EPOCH));
        addNewPokemon(new EpochScovillain("", Aspect.EPOCH));
        addNewPokemon(new EpochCetoddle("", Aspect.EPOCH));
        addNewPokemon(new EpochCetitan("", Aspect.EPOCH));
        addNewPokemon(new EpochCetoddleOne("", Aspect.EPOCH));
        addNewPokemon(new EpochCetitanOne("", Aspect.EPOCH));
        addNewPokemon(new EpochCharmanderOne("", Aspect.EPOCH));
        addNewPokemon(new EpochCharmeleonOne("", Aspect.EPOCH));
        addNewPokemon(new EpochCharizardOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGrubbin("", Aspect.EPOCH));
        addNewPokemon(new EpochCharjabug("", Aspect.EPOCH));
        addNewPokemon(new EpochVikavolt("", Aspect.EPOCH));
        addNewPokemon(new EpochChewtle("", Aspect.EPOCH));
        addNewPokemon(new EpochDrednaw("", Aspect.EPOCH));
        addNewPokemon(new EpochScorbunny("", Aspect.EPOCH));
        addNewPokemon(new EpochRaboot("", Aspect.EPOCH));
        addNewPokemon(new EpochCinderace("", Aspect.EPOCH));
        addNewPokemon(new EpochClodsire("", Aspect.EPOCH));
        addNewPokemon(new EpochShellder("", Aspect.EPOCH));
        addNewPokemon(new EpochCloyster("", Aspect.EPOCH));
        addNewPokemon(new EpochCombee("", Aspect.EPOCH));
        addNewPokemon(new EpochVespiquen("", Aspect.EPOCH));
        addNewPokemon(new EpochRookideeOne("", Aspect.EPOCH));
        addNewPokemon(new EpochCorvisquireOne("", Aspect.EPOCH));
        addNewPokemon(new EpochCorviknightOne("", Aspect.EPOCH));
        addNewPokemon(new EpochCottonee("", Aspect.EPOCH));
        addNewPokemon(new EpochWhimsicott("", Aspect.EPOCH));
        addNewPokemon(new EpochCottoneeOne("", Aspect.EPOCH));
        addNewPokemon(new EpochWhimsicottOne("", Aspect.EPOCH));
        addNewPokemon(new EpochCryogonal("", Aspect.EPOCH));
        addNewPokemon(new EpochCyclizar("", Aspect.EPOCH));
        addNewPokemon(new EpochRowletOne("", Aspect.EPOCH));
        addNewPokemon(new EpochDartrixOne("", Aspect.EPOCH));
        addNewPokemon(new EpochDecidueyeOne("", Aspect.EPOCH));
        addNewPokemon(new EpochOshawott("", Aspect.EPOCH));
        addNewPokemon(new EpochDewott("", Aspect.EPOCH));
        addNewPokemon(new EpochSamurott("", Aspect.EPOCH));
        addNewPokemon(new EpochDondozo("", Aspect.EPOCH));
        addNewPokemon(new EpochPhanpyOne("", Aspect.EPOCH));
        addNewPokemon(new EpochDonphanOne("", Aspect.EPOCH));
        addNewPokemon(new EpochDrampa("", Aspect.EPOCH));
        addNewPokemon(new EpochDuskullOne("", Aspect.EPOCH));
        addNewPokemon(new EpochDusclopsOne("", Aspect.EPOCH));
        addNewPokemon(new EpochDusknoirOne("", Aspect.EPOCH));
        addNewPokemon(new EpochEiscue("", Aspect.EPOCH));
        addNewPokemon(new EpochFarfetchd("", Aspect.EPOCH));
        addNewPokemon(new EpochSirfetchd("", Aspect.EPOCH));
        addNewPokemon(new EpochFlamigo("", Aspect.EPOCH));
        addNewPokemon(new EpochSprigatito("", Aspect.EPOCH));
        addNewPokemon(new EpochFloragato("", Aspect.EPOCH));
        addNewPokemon(new EpochMeowscarada("", Aspect.EPOCH));
        addNewPokemon(new EpochFomantis("", Aspect.EPOCH));
        addNewPokemon(new EpochLurantis("", Aspect.EPOCH));
        addNewPokemon(new EpochRaltsOne("", Aspect.EPOCH));
        addNewPokemon(new EpochKirliaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGardevoirOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGalladeOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGlameow("", Aspect.EPOCH));
        addNewPokemon(new EpochPurugly("", Aspect.EPOCH));
        addNewPokemon(new EpochGlimmet("", Aspect.EPOCH));
        addNewPokemon(new EpochGlimmora("", Aspect.EPOCH));
        addNewPokemon(new EpochSkiddoOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGogoatOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGolettOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGolurkOne("", Aspect.EPOCH));
        addNewPokemon(new EpochPumpkaboo("", Aspect.EPOCH));
        addNewPokemon(new EpochGourgeist("", Aspect.EPOCH));
        addNewPokemon(new EpochSnubbull("", Aspect.EPOCH));
        addNewPokemon(new EpochGranbull("", Aspect.EPOCH));
        addNewPokemon(new EpochGreavard("", Aspect.EPOCH));
        addNewPokemon(new EpochHoundstone("", Aspect.EPOCH));
        addNewPokemon(new EpochGrookey("", Aspect.EPOCH));
        addNewPokemon(new EpochThwackey("", Aspect.EPOCH));
        addNewPokemon(new EpochRillaboom("", Aspect.EPOCH));
        addNewPokemon(new EpochTurtwigOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGrotleOne("", Aspect.EPOCH));
        addNewPokemon(new EpochTorterraOne("", Aspect.EPOCH));
        addNewPokemon(new EpochTreeckoOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGrovyleOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSceptileOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSpoink("", Aspect.EPOCH));
        addNewPokemon(new EpochGrumpig("", Aspect.EPOCH));
        addNewPokemon(new EpochMakuhita("", Aspect.EPOCH));
        addNewPokemon(new EpochHariyama("", Aspect.EPOCH));
        addNewPokemon(new EpochHawlucha("", Aspect.EPOCH));
        addNewPokemon(new EpochHeatmor("", Aspect.EPOCH));
        addNewPokemon(new EpochHydrapple("", Aspect.EPOCH));
        addNewPokemon(new EpochIgglybuffOne("", Aspect.EPOCH));
        addNewPokemon(new EpochJigglypuffOne("", Aspect.EPOCH));
        addNewPokemon(new EpochWigglytuffOne("", Aspect.EPOCH));
        addNewPokemon(new EpochInkay("", Aspect.EPOCH));
        addNewPokemon(new EpochMalamar("", Aspect.EPOCH));
        addNewPokemon(new EpochKlawf("", Aspect.EPOCH));
        addNewPokemon(new EpochKomala("", Aspect.EPOCH));
        addNewPokemon(new EpochKomalaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochLickitung("", Aspect.EPOCH));
        addNewPokemon(new EpochLickilicky("", Aspect.EPOCH));
        addNewPokemon(new EpochPetilil("", Aspect.EPOCH));
        addNewPokemon(new EpochLilligant("", Aspect.EPOCH));
        addNewPokemon(new EpochLitleoOne("", Aspect.EPOCH));
        addNewPokemon(new EpochPyroarOne("", Aspect.EPOCH));
        addNewPokemon(new EpochNymble("", Aspect.EPOCH));
        addNewPokemon(new EpochLokix("", Aspect.EPOCH));
        addNewPokemon(new EpochRockruff("", Aspect.EPOCH));
        addNewPokemon(new EpochLycanroc("", Aspect.EPOCH));
        addNewPokemon(new EpochMaschiff("", Aspect.EPOCH));
        addNewPokemon(new EpochMabosstiff("", Aspect.EPOCH));
        addNewPokemon(new EpochMaractus("", Aspect.EPOCH));
        addNewPokemon(new EpochTandemaus("", Aspect.EPOCH));
        addNewPokemon(new EpochMaushold("", Aspect.EPOCH));
        addNewPokemon(new EpochTandemausOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMausholdOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMienfoo("", Aspect.EPOCH));
        addNewPokemon(new EpochMienshao("", Aspect.EPOCH));
        addNewPokemon(new EpochMimejrOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMrmimeOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMrrimeOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMimikyuOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMinior("", Aspect.EPOCH));
        addNewPokemon(new EpochMiniorOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMinun("", Aspect.EPOCH));
        addNewPokemon(new EpochPlusle("", Aspect.EPOCH));
        addNewPokemon(new EpochMudbrayOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMudsdaleOne("", Aspect.EPOCH));
        addNewPokemon(new EpochNacli("", Aspect.EPOCH));
        addNewPokemon(new EpochNaclstack("", Aspect.EPOCH));
        addNewPokemon(new EpochGarganacl("", Aspect.EPOCH));
        addNewPokemon(new EpochNacliOne("", Aspect.EPOCH));
        addNewPokemon(new EpochNaclstackOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGarganaclOne("", Aspect.EPOCH));
        addNewPokemon(new EpochNickit("", Aspect.EPOCH));
        addNewPokemon(new EpochThievul("", Aspect.EPOCH));
        addNewPokemon(new EpochOnixOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSteelixOne("", Aspect.EPOCH));
        addNewPokemon(new EpochOranguru("", Aspect.EPOCH));
        addNewPokemon(new EpochOricorio("", Aspect.EPOCH));
        addNewPokemon(new EpochOrthworm("", Aspect.EPOCH));
        addNewPokemon(new EpochQwilfish("", Aspect.EPOCH));
        addNewPokemon(new EpochOverqwil("", Aspect.EPOCH));
        addNewPokemon(new EpochPachirisu("", Aspect.EPOCH));
        addNewPokemon(new EpochPancham("", Aspect.EPOCH));
        addNewPokemon(new EpochPangoro("", Aspect.EPOCH));
        addNewPokemon(new EpochPanpour("", Aspect.EPOCH));
        addNewPokemon(new EpochSimipour("", Aspect.EPOCH));
        addNewPokemon(new EpochPansage("", Aspect.EPOCH));
        addNewPokemon(new EpochSimisage("", Aspect.EPOCH));
        addNewPokemon(new EpochPansear("", Aspect.EPOCH));
        addNewPokemon(new EpochSimisear("", Aspect.EPOCH));
        addNewPokemon(new EpochParasOne("", Aspect.EPOCH));
        addNewPokemon(new EpochParasectOne("", Aspect.EPOCH));
        addNewPokemon(new EpochPassimian("", Aspect.EPOCH));
        addNewPokemon(new EpochPerrserker("", Aspect.EPOCH));
        addNewPokemon(new EpochPhantumpOne("", Aspect.EPOCH));
        addNewPokemon(new EpochTrevenantOne("", Aspect.EPOCH));
        addNewPokemon(new EpochPichuOne("", Aspect.EPOCH));
        addNewPokemon(new EpochPikachuOne("", Aspect.EPOCH));
        addNewPokemon(new EpochRaichuOne("", Aspect.EPOCH));
        addNewPokemon(new EpochPoltchageist("", Aspect.EPOCH));
        addNewPokemon(new EpochSinistcha("", Aspect.EPOCH));
        addNewPokemon(new EpochPoltchageistOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSinistchaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochPonytaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochRapidashOne("", Aspect.EPOCH));
        addNewPokemon(new EpochQuaxly("", Aspect.EPOCH));
        addNewPokemon(new EpochQuaxwell("", Aspect.EPOCH));
        addNewPokemon(new EpochQuaquaval("", Aspect.EPOCH));
        addNewPokemon(new EpochRelicanth("", Aspect.EPOCH));
        addNewPokemon(new EpochRhyhorn("", Aspect.EPOCH));
        addNewPokemon(new EpochRhydon("", Aspect.EPOCH));
        addNewPokemon(new EpochRhyperior("", Aspect.EPOCH));
        addNewPokemon(new EpochRotom("", Aspect.EPOCH));
        addNewPokemon(new EpochRunerigus("", Aspect.EPOCH));
        addNewPokemon(new EpochSandshrew("", Aspect.EPOCH));
        addNewPokemon(new EpochSandslash("", Aspect.EPOCH));
        addNewPokemon(new EpochScytherOne("", Aspect.EPOCH));
        addNewPokemon(new EpochScizorOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSphealOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSealeoOne("", Aspect.EPOCH));
        addNewPokemon(new EpochWalreinOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSeviper("", Aspect.EPOCH));
        addNewPokemon(new EpochShuckle("", Aspect.EPOCH));
        addNewPokemon(new EpochSigilyph("", Aspect.EPOCH));
        addNewPokemon(new EpochSneaselOne("", Aspect.EPOCH));
        addNewPokemon(new EpochWeavileOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSneaslerOne("", Aspect.EPOCH));
        addNewPokemon(new EpochTarountula("", Aspect.EPOCH));
        addNewPokemon(new EpochSpidops("", Aspect.EPOCH));
        addNewPokemon(new EpochSpinda("", Aspect.EPOCH));
        addNewPokemon(new EpochSpiritombOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSquawkabilly("", Aspect.EPOCH));
        addNewPokemon(new EpochStunfisk("", Aspect.EPOCH));
        addNewPokemon(new EpochTangelaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochTangrowthOne("", Aspect.EPOCH));
        addNewPokemon(new EpochTatsugiri("", Aspect.EPOCH));
        addNewPokemon(new EpochTeddiursaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochUrsaringOne("", Aspect.EPOCH));
        addNewPokemon(new EpochUrsalunaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochToedscool("", Aspect.EPOCH));
        addNewPokemon(new EpochToedscruel("", Aspect.EPOCH));
        addNewPokemon(new EpochTogedemaru("", Aspect.EPOCH));
        addNewPokemon(new EpochTogepi("", Aspect.EPOCH));
        addNewPokemon(new EpochTogetic("", Aspect.EPOCH));
        addNewPokemon(new EpochTogekiss("", Aspect.EPOCH));
        addNewPokemon(new EpochTropius("", Aspect.EPOCH));
        addNewPokemon(new EpochTurtonator("", Aspect.EPOCH));
        addNewPokemon(new EpochTyruntOne("", Aspect.EPOCH));
        addNewPokemon(new EpochTyrantrumOne("", Aspect.EPOCH));
        addNewPokemon(new EpochUnown("", Aspect.EPOCH));
        addNewPokemon(new EpochIllumise("", Aspect.EPOCH));
        addNewPokemon(new EpochVolbeat("", Aspect.EPOCH));
        addNewPokemon(new EpochWishiwashi("", Aspect.EPOCH));
        addNewPokemon(new EpochWynaut("", Aspect.EPOCH));
        addNewPokemon(new EpochWobbuffet("", Aspect.EPOCH));
        addNewPokemon(new EpochWiglett("", Aspect.EPOCH));
        addNewPokemon(new EpochWugtrio("", Aspect.EPOCH));
        addNewPokemon(new EpochZoruaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochZoroarkOne("", Aspect.EPOCH));
    }
}
