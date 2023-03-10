//package seminars.third.tdd;
//
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.*;
//
//public class TestDrivenDevelopment {
//
//    /**
//     * Нужно написать (TDD) класс MoodAnalyser, который оценивает фразы по настроению
//     */
//    @Test
//    void testMoodAnalysisHappy() {
//        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
//        String str = "хорошее настроение";
//        assertThat(moodAnalyzer.analyze(str)).isEqualTo("happy");
//    }
//
//    @Test
//    void testMoodAnalysisSad() {
//        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
//        String str = "плохое настроение";
//        assertThat(moodAnalyzer.analyze(str)).isEqualTo("sad");
//    }
//    @Test
//    void testMoodAnalysisSoso() {
//        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
//        String str = "нейтральное  настроение";
//        assertThat(moodAnalyzer.analyze(str)).isEqualTo("soso");
//    }
//
//}