package 四则运算;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class producerTest {
	producer producer=new producer();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCheck() {
		producer.check(1);
		producer.check(1);
	}

	@Test
	public void testP_add() {
		System.out.println("加法测试结果如下");
		assertEquals(5,producer.p_add(2,3));
		assertEquals(100,producer.p_add(55,45));
		assertEquals(101,producer.p_add(56,45));
	}

	@Test
	public void testP_sub() {
		System.out.println("减法测试结果如下");
		assertEquals(1,producer.p_sub(3,2));
		assertEquals(0,producer.p_sub(3,3));
		assertEquals(-1,producer.p_sub(1,2));
	}

	@Test
	public void testP_mul() {
		System.out.println("乘法测试结果如下");
		assertEquals(6,producer.p_mul(2,3));
		assertEquals(0,producer.p_mul(0,3));
		assertEquals(100,producer.p_mul(10,10));
		assertEquals(110,producer.p_mul(11,10));
	}

	@Test
	public void testP_div() {
		System.out.println("除法测试结果如下");
		assertEquals(2,producer.p_div(6,3));
		assertEquals(1,producer.p_div(5,3));
		assertEquals(0,producer.p_div(0,3));
	}

}
