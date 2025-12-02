{
    name: "Avalossiansceptilite",
    spritenum: 620,
    megaStone: "sceptile-avalossian_mega",
    megaEvolves: "sceptile",
    itemUser: ["sceptile"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== avalossian)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10232: 760,
    gen: 6,
    isNonstandard: "Past"
}
