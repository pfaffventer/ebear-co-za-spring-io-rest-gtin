package ebear.co.za.spring.io.rest.gtin.query.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import ebear.co.za.spring.io.rest.gtin.query.model.CommodityQuery;
import ebear.co.za.spring.io.rest.gtin.query.model.GradeQuery;
import ebear.co.za.spring.io.rest.gtin.query.model.GtinJoinTargetMarket;
import ebear.co.za.spring.io.rest.gtin.query.model.InventoryQuery;
import ebear.co.za.spring.io.rest.gtin.query.model.MarkQuery;
import ebear.co.za.spring.io.rest.gtin.query.model.PackJoinCommodity;
import ebear.co.za.spring.io.rest.gtin.query.model.TargetMarketQuery;
import ebear.co.za.spring.io.rest.gtin.query.model.VarietyJoinCommodity;

@Service
public class QueryRepository implements Repository<String, Long> {

	private String sql;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public QueryRepository() {
		super();
	}

	public List<CommodityQuery> commodityQuery() {
		sql = "select"
				+ "  c.active"
				+ " ,c.commodity_code"
				+ " ,c.commodity_description"
				+ " ,c.log_time"
				+ " ,c.log_user"
				+ " from Commodity c";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<CommodityQuery>(CommodityQuery.class));
	}

	public List<GradeQuery> gradeQuery() {
		sql = "select"
				+ "  g.active"
				+ " ,g.grade_code"
				+ " ,g.grade_description"
				+ " ,g.log_time"
				+ " ,g.log_user"
				+ " from Grade g";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<GradeQuery>(GradeQuery.class));
	}

	public List<GtinJoinTargetMarket> gtinTargetMarketQuery() {
		sql = "select"
				+ "  ifnull(gm.target_market_code,'__') as target_market_code"
				+ " ,g.gtin_code"
				+ " ,g.commodity"
				+ " ,g.variety"
				+ " ,g.grade"
				+ " ,g.pack"
				+ " ,g.mark"
				+ " ,g.inventory"
				+ " ,g.size_count"
				+ " ,g.log_user"
				+ " ,g.log_time"
				+ " from gtin g"
				+ " left join gtin_market gm on g.gtin_id = gm.gtin_id";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<GtinJoinTargetMarket>(GtinJoinTargetMarket.class));
	}

	public List<InventoryQuery> inventoryQuery() {
		sql = "select"
				+ "  i.active"
				+ " ,i.inventory_code"
				+ " ,i.inventory_description"
				+ " ,i.log_time"
				+ " ,i.log_user"
				+ " from Inventory i";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<InventoryQuery>(InventoryQuery.class));
	}

	public List<MarkQuery> markQuery() {
		sql = "select"
				+ "  m.active"
				+ " ,m.mark_code"
				+ " ,m.mark_description"
				+ " ,m.log_time"
				+ " ,m.log_user"
				+ " from Mark m";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<MarkQuery>(MarkQuery.class));
	}

	public List<PackJoinCommodity> packQuery() {
		sql = "select"
				+ "  p.active"
				+ " ,p.pack_code"
				+ " ,p.pack_description"
				+ " ,p.log_time"
				+ " ,p.log_user"
				+ " ,c.commodity_code"
				+ " ,c.commodity_description"
				+ " ,p.unit"
				+ " ,p.equivalent_pack"
				+ " ,p.inner_length"
				+ " ,p.inner_width"
				+ " ,p.inner_height"
				+ " ,p.outer_length"
				+ " ,p.outer_width"
				+ " ,p.outer_height"
				+ " ,p.net_weight"
				+ " from Commodity c"
				+ " join Pack p on c.commodity_code = p.commodity_code";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<PackJoinCommodity>(PackJoinCommodity.class));
	}

	public List<TargetMarketQuery> targetMarketQuery() {
		sql = "select"
				+ "  tm.active"
				+ " ,tm.target_market_code"
				+ " ,tm.target_market_description"
				+ " ,tm.log_time"
				+ " ,tm.log_user"
				+ " from target_market tm";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<TargetMarketQuery>(TargetMarketQuery.class));
	}

	public List<VarietyJoinCommodity> varietyQuery() {
		sql = "select"
				+ "  v.active"
				+ " ,c.commodity_code"
				+ " ,c.commodity_description"
				+ " ,v.variety_code"
				+ " ,v.variety_description"
				+ " ,v.log_time"
				+ " ,v.log_user"
				+ " from Commodity c"
				+ " join Variety v on c.commodity_code = v.commodity_code";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<VarietyJoinCommodity>(VarietyJoinCommodity.class));
	}

}
