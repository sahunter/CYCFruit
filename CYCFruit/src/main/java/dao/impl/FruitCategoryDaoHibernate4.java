package dao.impl;

import java.util.List;

import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;

import common.dao.impl.BaseDaoHibernate4;
import dao.FruitCategoryDao;
import domain.FruitCategory;

public class FruitCategoryDaoHibernate4 extends BaseDaoHibernate4<FruitCategory> 
implements FruitCategoryDao{
	private static final Logger log = LoggerFactory
		      .getLogger(FruitCategoryDaoHibernate4.class);
		  
		  protected void initDao() {
		    // do nothing
		  }

		  public List<FruitCategory> findAll() {
		    log.debug("finding all FruitCategory instances");
		    try {
		      //查询资源记录，按资源父id和序号的升序排列
		      String queryString = "select a from FruitCategory  a order by superCategory,resourceOrder asc";
		      return find(queryString);
		    } catch (RuntimeException re) {
		      log.error("find all failed", re);
		      throw re;
		    }
		  }

		
}
