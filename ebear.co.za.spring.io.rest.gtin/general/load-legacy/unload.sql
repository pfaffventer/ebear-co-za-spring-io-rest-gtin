
--PACK
select PACK, COMMODITY, UNIT, EQV_PACK, IN_LENGTH, IN_DEPTH, IN_HEIGHT, OUT_LENGTH, OUT_DEPTH, OUT_HEIGHT, NET_MASS, PACK2 from ipSysPal.PalPack;

--GTIN
select GTIN, COMMODITY, VARIETY, GRADE, PACK, MARK, INV_CODE, SIZE_COUNT from ipSysPal.PalGTIN;

--GTIN MARKET
drop table #t;
select distinct GTIN,TargetMkt into #t from ipSysTru.tblLoadOuts


delete from #t where len(GTIN) = 0;

delete from #t where len(TargetMkt) = 0;

select distinct len(GTIN),len(TargetMkt) from #t;

drop table aaa.t;
select * into aaa.t from #t

 