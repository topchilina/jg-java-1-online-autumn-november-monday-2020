package students.nikita_bobrovs.lesson_10.level_2.task_4;

class DayOfTheWeekDetectorSwitchVersionTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorSwitchVersionTest subject = new DayOfTheWeekDetectorSwitchVersionTest();
        subject.detectDayNameTest1();
        subject.detectDayNameTest2();
        subject.detectDayNameTest3();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    private boolean tester(String expected, String real) {
        return expected.equals(real);
    }

    void detectDayNameTest1() {
        System.out.println("Detect day test (number in range) : " + testResult(tester
                ("Friday", new DayOfTheWeekDetectorSwitchVersion().detectDayName(5))));
    }

    void detectDayNameTest2() {
        System.out.println("Detect day test (positive number out of range) : " + testResult(tester
                ("Please input a valid number between 1 and 7",
                        new DayOfTheWeekDetectorSwitchVersion().detectDayName(8))));
    }

    void detectDayNameTest3() {
        System.out.println("Detect day test (negative number out of range) : " + testResult(tester
                ("Please input a valid number between 1 and 7",
                        new DayOfTheWeekDetectorSwitchVersion().detectDayName(-8))));
    }
}
