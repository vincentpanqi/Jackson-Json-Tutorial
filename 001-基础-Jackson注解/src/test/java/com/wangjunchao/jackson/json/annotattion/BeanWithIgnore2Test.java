package com.wangjunchao.jackson.json.annotattion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

/**
 * Author: 王俊超
 * Date: 2017-07-29 09:19
 * All Rights Reserved !!!
 */
public class BeanWithIgnore2Test {
    @Test
    public void whenSerializingUsingJsonIgnore_thenCorrect()
            throws JsonProcessingException {

        BeanWithIgnore2 bean = new BeanWithIgnore2(1, "My bean");

        String result = new ObjectMapper()
                .writeValueAsString(bean);

        System.out.println(result);
        assertThat(result, containsString("My bean"));
        assertThat(result, not(containsString("id")));
    }
}