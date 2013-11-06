package csce747.nikhil.takehome1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTest {

	Time mt1 = new Time();
	Time mt2 = new Time();

	Time mt3 = new Time("testing",1005,75);
	Time mt4 = new Time("info_ret",3715,75);
	Time mt5 = new Time("algo",3850,75);
	Time mt6 = new Time("102Lect",4130,50);

	Time mt7 = new Time("testing",5805,75);
	Time mt8 = new Time("info_ret",8515,75);
	Time mt9 = new Time("algo",8650,75);
	Time mt10 = new Time("102Lect",8930,50);

	
	@Test
	public void testTime() {

		assertEquals(mt1.getStartTime(),mt2.getStartTime());
		assertEquals(mt1.getDuration(),mt2.getDuration());
	}

	@Test
	public void testTimeIntInt() {
//		System.out.println(mt3.getStartTime());
//		System.out.println(mt4.getStartTime());

//		assertFalse(mt3.getStartTime().equals(mt4.getStartTime()));
		assertFalse(Integer.valueOf(mt3.getStartTime()).equals(Integer.valueOf(mt4.getStartTime())));
		assertFalse(Integer.valueOf(mt4.getStartTime()).equals(Integer.valueOf(mt5.getStartTime())));
		assertFalse(Integer.valueOf(mt6.getStartTime()).equals(Integer.valueOf(mt7.getStartTime())));

		assertTrue(Integer.valueOf(mt8.getDuration()).equals(Integer.valueOf(mt9.getDuration())));
		assertFalse(Integer.valueOf(mt9.getDuration()).equals(Integer.valueOf(mt10.getDuration())));
	}

	@Test
	public void testGetDay() {
//		System.out.println(mt10.getStartTime());
//		System.out.println(mt10.getDay());
		
		assertEquals("wed", mt7.getDay());
		assertEquals("thurs", mt8.getDay());
		assertEquals("thurs", mt10.getDay());

	}

	@Test
	public void testGetTimeOfDay() {
//		System.out.println(mt8.getDay());
//		System.out.println(mt8.getTimeOfDay());
		
		mt7.getDay();
		assertEquals(1005, mt7.getTimeOfDay());
		mt8.getDay();
		assertEquals(1315, mt8.getTimeOfDay());
		mt10.getDay();
		assertEquals(1730, mt10.getTimeOfDay());
	}

	@Test
	public void testOverlap() {

		assertTrue(mt4.overlap(mt4));
		assertTrue(mt5.overlap(mt5));
		
		assertFalse(mt6.overlap(mt7));
		assertFalse(mt8.overlap(mt9));
		assertFalse(mt9.overlap(mt10));
	}
}
