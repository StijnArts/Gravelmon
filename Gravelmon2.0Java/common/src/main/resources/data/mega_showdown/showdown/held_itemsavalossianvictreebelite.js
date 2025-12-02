{
    name: "Avalossianvictreebelite",
    spritenum: 620,
    megaStone: "victreebel-avalossian_mega",
    megaEvolves: "victreebel",
    itemUser: ["victreebel"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== avalossian)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10076: 760,
    gen: 6,
    isNonstandard: "Past"
}
