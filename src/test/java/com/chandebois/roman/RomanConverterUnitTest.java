package com.chandebois.roman;

import junitparams.JUnitParamsRunner;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by nonok on 05/05/2016.
 */
@RunWith(JUnitParamsRunner.class)
public class RomanConverterUnitTest {

    private RomanConverter romanConverter;

    @Before
    public void setUp() throws Exception {
        romanConverter = new RomanConverter();
    }

    @Test
    public void should_return_i_when_arg_1() throws Exception {
        String romanLitteral = romanConverter.convert(1);
        Assertions.assertThat(romanLitteral).isNotNull();
        Assertions.assertThat(romanLitteral).isEqualTo("I");
    }

    @Test
    public void should_return_ii_when_arg_2() throws Exception {
        String romanLitteral = romanConverter.convert(2);
        Assertions.assertThat(romanLitteral).isNotNull();
        Assertions.assertThat(romanLitteral).isEqualTo("II");
    }

    @Test
    public void should_return_iii_when_arg_3() throws Exception {
        String romanLitteral = romanConverter.convert(3);
        Assertions.assertThat(romanLitteral).isNotNull();
        Assertions.assertThat(romanLitteral).isEqualTo("III");
    }

    @Test
    public void should_return_iv_when_arg_4() throws Exception {
        String romanLitteral = romanConverter.convert(4);
        Assertions.assertThat(romanLitteral).isNotNull();
        Assertions.assertThat(romanLitteral).isEqualTo("IV");
    }

    @Test
    public void should_return_iv_when_arg_5() throws Exception {
        String romanLitteral = romanConverter.convert(5);
        Assertions.assertThat(romanLitteral).isNotNull();
        Assertions.assertThat(romanLitteral).isEqualTo("V");
    }

    @Test
    public void should_return_vi_when_arg_6() throws Exception {
        String romanLitteral = romanConverter.convert(6);
        Assertions.assertThat(romanLitteral).isNotNull();
        Assertions.assertThat(romanLitteral).isEqualTo("VI");
    }

    @Test
    public void should_return_vii_when_arg_7() throws Exception {
        String romanLitteral = romanConverter.convert(7);
        Assertions.assertThat(romanLitteral).isNotNull();
        Assertions.assertThat(romanLitteral).isEqualTo("VII");
    }

    @Test
    public void should_return_x_when_arg_10() throws Exception {
        String romanLitteral = romanConverter.convert(10);
        Assertions.assertThat(romanLitteral).isNotNull();
        Assertions.assertThat(romanLitteral).isEqualTo("X");
    }

    @Test
    public void should_return_ix_when_arg_9() throws Exception {
        String romanLitteral = romanConverter.convert(9);
        Assertions.assertThat(romanLitteral).isNotNull();
        Assertions.assertThat(romanLitteral).isEqualTo("IX");
    }

    @Test
    public void should_return_xi_when_arg_11() throws Exception {
        String romanLitteral = romanConverter.convert(11);
        Assertions.assertThat(romanLitteral).isNotNull();
        Assertions.assertThat(romanLitteral).isEqualTo("XI");
    }

    @Test
    public void should_return_xiv_when_arg_14() throws Exception {
        String romanLitteral = romanConverter.convert(14);
        Assertions.assertThat(romanLitteral).isNotNull();
        Assertions.assertThat(romanLitteral).isEqualTo("XIV");
    }

    @Test
    public void should_return_xv_when_arg_15() throws Exception {
        String romanLitteral = romanConverter.convert(15);
        Assertions.assertThat(romanLitteral).isNotNull();
        Assertions.assertThat(romanLitteral).isEqualTo("XV");
    }

    @Test
    public void should_return_xix_when_arg_19() throws Exception {
        String romanLitteral = romanConverter.convert(19);
        Assertions.assertThat(romanLitteral).isNotNull();
        Assertions.assertThat(romanLitteral).isEqualTo("XIX");
    }

    @Test
    public void should_return_xx_when_arg_20() throws Exception {
        String romanLitteral = romanConverter.convert(20);
        Assertions.assertThat(romanLitteral).isNotNull();
        Assertions.assertThat(romanLitteral).isEqualTo("XX");
    }

    @Test
    public void should_return_xxxiv_when_arg_34() throws Exception {
        String romanLitteral = romanConverter.convert(34);
        Assertions.assertThat(romanLitteral).isNotNull();
        Assertions.assertThat(romanLitteral).isEqualTo("XXXIV");
    }

    @Test
    public void should_return_l_when_arg_50() throws Exception {
        String romanLitteral = romanConverter.convert(50);
        Assertions.assertThat(romanLitteral).isNotNull();
        Assertions.assertThat(romanLitteral).isEqualTo("L");
    }
}
