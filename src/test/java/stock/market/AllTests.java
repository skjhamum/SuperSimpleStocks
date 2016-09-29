package stock.market;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import stock.market.model.BaseStockTest;
import stock.market.model.TestPreferredStock;
import stock.market.model.TradeRecordTest;
import stock.market.service.StockMarketServiceTest;

/**
 * A test Suit for Test classes.
 * 
 * @author Suman Jha
 *
 */
@RunWith(Suite.class)
@SuiteClasses({
	BaseStockTest.class, 
	TestPreferredStock.class,
	TradeRecordTest.class,
	StockMarketServiceTest.class})
public class AllTests {

}
