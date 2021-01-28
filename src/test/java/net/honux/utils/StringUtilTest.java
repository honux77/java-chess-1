package net.honux.utils;

import org.junit.jupiter.api.*;


import static org.assertj.core.api.Assertions.*;
import static net.honux.utils.StringUtils.*;

public class StringUtilTest {
    @Test
    @DisplayName("줄 바꿈 문자열을 시스템 속성으로 가져와야 한다")
    void newline() {
        //assertThat(NEW_LINE).isEqualTo("\r\n");
        assertThat(NEW_LINE).isEqualTo("\n");
        assertThat(appendNewLine("hello")).isEqualTo("hello\n");
    }
}
