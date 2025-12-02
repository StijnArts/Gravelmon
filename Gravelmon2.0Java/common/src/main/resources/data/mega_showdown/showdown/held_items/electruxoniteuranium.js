{
    name: "Electruxoniteuranium",
    spritenum: 620,
    megaStone: "electruxo-mega_uranium",
    megaEvolves: "electruxo",
    itemUser: ["electruxo"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10129: 760,
    gen: 6,
    isNonstandard: "Past"
}
