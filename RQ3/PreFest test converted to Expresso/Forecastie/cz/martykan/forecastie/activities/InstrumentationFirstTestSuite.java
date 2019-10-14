package cz.martykan.forecastie.activities;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Runs all unit tests.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
		testcase10_000.class,
		testcase10_001.class,
		// testcase10_002.class,
		testcase10_003.class,
		testcase10_004.class,
		testcase10_005.class,
		testcase10_006.class,
		testcase10_007.class,
		testcase10_008.class,
		testcase10_009.class,
		testcase10_010.class,
		testcase10_011.class,
		// testcase10_012.class,
		// testcase10_013.class,
		// testcase10_014.class,
		testcase10_015.class,
		testcase10_016.class,
		testcase10_017.class,
		testcase10_018.class,
		testcase10_019.class,
		testcase10_020.class,
		testcase10_021.class,
		testcase10_022.class,
		testcase10_023.class,
		testcase10_024.class,
		testcase10_025.class,
		// testcase10_026.class,
		testcase10_027.class,
		testcase10_028.class,
		testcase10_029.class,
		// testcase1_000.class,
		testcase1_001.class,
		testcase1_002.class,
		testcase1_003.class,
		testcase1_004.class,
		testcase1_005.class,
		testcase1_006.class,
		testcase1_007.class,
		testcase1_008.class,
		testcase1_009.class,
		testcase1_010.class,
		testcase1_011.class,
		testcase1_012.class,
		testcase1_013.class,
		testcase1_014.class,
		testcase1_015.class,
		testcase1_016.class,
		testcase1_017.class,
		testcase1_018.class,
		testcase1_019.class,
		testcase1_020.class,
		testcase1_021.class,
		testcase1_022.class,
		testcase1_023.class,
		testcase1_024.class,
		testcase1_025.class,
		testcase1_026.class,
		testcase1_027.class,
		testcase1_028.class,
		testcase1_029.class,
		testcase2_000.class,
		testcase2_001.class,
		testcase2_002.class,
		testcase2_003.class,
		testcase2_004.class,
		testcase2_005.class,
		testcase2_006.class,
		testcase2_007.class,
		testcase2_008.class,
		testcase2_009.class,
		testcase2_010.class,
		testcase2_011.class,
		testcase2_012.class,
		testcase2_013.class,
		testcase2_014.class,
		testcase2_015.class,
		testcase2_016.class,
		testcase2_017.class,
		testcase2_018.class,
		testcase2_019.class,
		testcase2_020.class,
		testcase2_021.class,
		testcase2_022.class,
		testcase2_023.class,
		testcase2_024.class,
		testcase2_025.class,
		testcase2_026.class,
		testcase2_027.class,
		testcase2_028.class,
		testcase2_029.class,
		testcase3_000.class,
		testcase3_001.class,
		testcase3_002.class,
		testcase3_003.class,
		testcase3_004.class,
		testcase3_005.class,
		testcase3_006.class,
		testcase3_007.class,
		testcase3_008.class,
		testcase3_009.class,
		testcase3_010.class,
		testcase3_011.class,
		testcase3_012.class,
		testcase3_013.class,
		testcase3_014.class,
		testcase3_015.class,
		// testcase3_016.class,
		testcase3_017.class,
		testcase3_018.class,
		testcase3_019.class,
		testcase3_020.class,
		testcase3_021.class,
		testcase3_022.class,
		testcase3_023.class,
		testcase3_024.class,
		testcase3_025.class,
		testcase3_026.class,
		testcase3_027.class,
		testcase3_028.class,
		testcase3_029.class,
		testcase4_000.class,
		testcase4_001.class,
		testcase4_002.class,
		testcase4_003.class,
		testcase4_004.class,
		testcase4_005.class,
		testcase4_006.class,
		testcase4_007.class,
		testcase4_008.class,
		testcase4_009.class,
		testcase4_010.class,
		testcase4_011.class,
		testcase4_012.class,
		testcase4_013.class,
		// testcase4_014.class,
		testcase4_015.class,
		testcase4_016.class,
		testcase4_017.class,
		testcase4_018.class,
		testcase4_019.class,
		testcase4_020.class,
		testcase4_021.class,
		testcase4_022.class,
		testcase4_023.class,
		testcase4_024.class,
		testcase4_025.class,
		// testcase4_026.class,
		testcase4_027.class,
		testcase4_028.class,
		testcase4_029.class,
		testcase5_000.class,
		testcase5_001.class,
		testcase5_002.class,
		testcase5_003.class,
		testcase5_004.class,
		testcase5_005.class,
		testcase5_006.class,
		// testcase5_007.class,
		testcase5_008.class,
		testcase5_009.class,
		testcase5_010.class,
		testcase5_011.class,
		testcase5_012.class,
		testcase5_013.class,
		testcase5_014.class,
		testcase5_015.class,
		testcase5_016.class,
		testcase5_017.class,
		testcase5_018.class,
		testcase5_019.class,
		testcase5_020.class,
		testcase5_021.class,
		testcase5_022.class,
		testcase5_023.class,
		testcase5_024.class,
		testcase5_025.class,
		testcase5_026.class,
		testcase5_027.class,
		testcase5_028.class,
		testcase5_029.class,
		testcase6_000.class,
		testcase6_001.class,
		testcase6_002.class,
		testcase6_003.class,
		testcase6_004.class,
		testcase6_005.class,
		testcase6_006.class,
		testcase6_007.class,
		testcase6_008.class,
		testcase6_009.class,
		testcase6_010.class,
		testcase6_011.class,
		testcase6_012.class,
		testcase6_013.class,
		testcase6_014.class,
		testcase6_015.class,
		testcase6_016.class,
		testcase6_017.class,
		testcase6_018.class,
		testcase6_019.class,
		testcase6_020.class,
		testcase6_021.class,
		testcase6_022.class,
		testcase6_023.class,
		testcase6_024.class,
		testcase6_025.class,
		testcase6_026.class,
		testcase6_027.class,
		testcase6_028.class,
		testcase6_029.class,
		testcase7_000.class,
		testcase7_001.class,
		testcase7_002.class,
		testcase7_003.class,
		testcase7_004.class,
		testcase7_005.class,
		testcase7_006.class,
		testcase7_007.class,
		testcase7_008.class,
		testcase7_009.class,
		testcase7_010.class,
		testcase7_011.class,
		testcase7_012.class,
		testcase7_013.class,
		testcase7_014.class,
		testcase7_015.class,
		testcase7_016.class,
		testcase7_017.class,
		testcase7_018.class,
		testcase7_019.class,
		testcase7_020.class,
		testcase7_021.class,
		testcase7_022.class,
		testcase7_023.class,
		testcase7_024.class,
		testcase7_025.class,
		testcase7_026.class,
		testcase7_027.class,
		testcase7_028.class,
		testcase7_029.class,
		testcase8_000.class,
		testcase8_001.class,
		testcase8_002.class,
		testcase8_003.class,
		// testcase8_004.class,
		testcase8_005.class,
		testcase8_006.class,
		testcase8_007.class,
		testcase8_008.class,
		testcase8_009.class,
		testcase8_010.class,
		testcase8_011.class,
		testcase8_012.class,
		testcase8_013.class,
		testcase8_014.class,
		testcase8_015.class,
		testcase8_016.class,
		testcase8_017.class,
		testcase8_018.class,
		testcase8_019.class,
		testcase8_020.class,
		testcase8_021.class,
		testcase8_022.class,
		testcase8_023.class,
		testcase8_024.class,
		testcase8_025.class,
		testcase8_026.class,
		testcase8_027.class,
		testcase8_028.class,
		testcase8_029.class,
		testcase9_000.class,
		testcase9_001.class,
		testcase9_002.class,
		testcase9_003.class,
		testcase9_004.class,
		testcase9_005.class,
		testcase9_006.class,
		testcase9_007.class,
		testcase9_008.class,
		// testcase9_009.class,
		testcase9_010.class,
		testcase9_011.class,
		testcase9_012.class,
		testcase9_013.class,
		testcase9_014.class,
		testcase9_015.class,
		testcase9_016.class,
		testcase9_017.class,
		testcase9_018.class,
		testcase9_019.class,
		testcase9_020.class,
		testcase9_021.class,
		testcase9_022.class,
		// testcase9_023.class,
		testcase9_024.class,
		testcase9_025.class,
		testcase9_026.class,
		testcase9_027.class,
		testcase9_028.class,
		testcase9_029.class
})


public class InstrumentationFirstTestSuite {

    /*public static final int N_TIMES = 5;
	private static long testStartTime;
	private static long testFinishTime;
	private static TimePrinter timePrinter; */


	@BeforeClass
    public static void setUp() {
        //timePrinter = TimePrinter.getInstance();
        // TimePrinter.log("n, test_name, ms");
		// testStartTime = System.currentTimeMillis();
		// System.out.println(testStartTime);
    }

    @AfterClass
    public static void tearDown() {
		// testFinishTime = System.currentTimeMillis();
		// TimePrinter.getInstance().log("" + (testFinishTime-testStartTime));
    	// TimePrinter.getInstance().close();
		// System.out.println(testFinishTime);

	}
}
