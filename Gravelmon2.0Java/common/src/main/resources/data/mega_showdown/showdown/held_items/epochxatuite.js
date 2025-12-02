{
    name: "Epochxatuite",
    spritenum: 620,
    megaStone: "xatu-epoch_mega",
    megaEvolves: "xatu",
    itemUser: ["xatu"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10168: 760,
    gen: 6,
    isNonstandard: "Past"
}
