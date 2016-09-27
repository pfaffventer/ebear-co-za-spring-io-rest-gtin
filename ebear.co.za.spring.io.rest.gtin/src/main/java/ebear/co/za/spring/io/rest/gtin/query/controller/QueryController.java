package ebear.co.za.spring.io.rest.gtin.query.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ebear.co.za.spring.io.rest.gtin.query.model.CommodityQuery;
import ebear.co.za.spring.io.rest.gtin.query.model.GradeQuery;
import ebear.co.za.spring.io.rest.gtin.query.model.GtinJoinTargetMarket;
import ebear.co.za.spring.io.rest.gtin.query.model.InventoryQuery;
import ebear.co.za.spring.io.rest.gtin.query.model.MarkQuery;
import ebear.co.za.spring.io.rest.gtin.query.model.PackJoinCommodity;
import ebear.co.za.spring.io.rest.gtin.query.model.TargetMarketQuery;
import ebear.co.za.spring.io.rest.gtin.query.model.VarietyJoinCommodity;
import ebear.co.za.spring.io.rest.gtin.query.repository.QueryRepository;

@RestController
public class QueryController {

	private final QueryRepository queryRepository;

	@Autowired
	QueryController(QueryRepository queryRepository) {
		this.queryRepository = queryRepository;

	}

	@RequestMapping("/commodities/query")
	List<CommodityQuery> commodityQuery() {
		return queryRepository.commodityQuery();
	}

	@RequestMapping("/grades/query")
	List<GradeQuery> gradeQuery() {
		return queryRepository.gradeQuery();
	}

	@RequestMapping("/gtins/query")
	List<GtinJoinTargetMarket> gtinTargetMarketQuery() {
		return queryRepository.gtinTargetMarketQuery();
	}

	@RequestMapping("/inventories/query")
	List<InventoryQuery> inventoryQuery() {
		return queryRepository.inventoryQuery();
	}

	@RequestMapping("/marks/query")
	List<MarkQuery> markQuery() {
		return queryRepository.markQuery();
	}

	@RequestMapping("/packs/query")
	List<PackJoinCommodity> packQuery() {
		return queryRepository.packQuery();
	}

	@RequestMapping("/targetMarkets/query")
	List<TargetMarketQuery> targetMarketQuery() {
		return queryRepository.targetMarketQuery();
	}

	@RequestMapping("/varieties/query")
	List<VarietyJoinCommodity> varietyQuery() {
		return queryRepository.varietyQuery();
	}

}
