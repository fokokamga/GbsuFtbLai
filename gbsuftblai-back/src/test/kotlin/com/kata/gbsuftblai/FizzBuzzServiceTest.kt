package com.kata.gbsuftblai

import com.kata.gbsuftblai.services.GbsuFtbLaiService
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FizzBuzzServiceTest {
    @Autowired
    private var gbsuFtbLaiService: GbsuFtbLaiService? = null;


    @Test
    fun _1ShouldReturnOne() {
        Assertions.assertThat(gbsuFtbLaiService!!.convertNumber(1)).isEqualTo("1");
    }

    @Test
    fun _3ShouldReturnGbsuGbsu(){
        Assertions.assertThat(gbsuFtbLaiService!!.convertNumber(3)).isEqualTo("GbsuGbsu");

    }
    @Test
    fun _5ShouldReturnFtbFtb(){
        Assertions.assertThat(gbsuFtbLaiService!!.convertNumber(5)).isEqualTo("FtbFtb");

    }
    @Test
    fun _7shouldReturnLai(){
        Assertions.assertThat(gbsuFtbLaiService!!.convertNumber(7)).isEqualTo("Lai");

    }


}