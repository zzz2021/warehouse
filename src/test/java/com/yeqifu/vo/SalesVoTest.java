package com.yeqifu.vo;

import com.yeqifu.bus.vo.SalesVo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
public class SalesVoTest {
    @Test
    public void testDateFormat() {
        SalesVo salesVo = new SalesVo();

        // Set a sample date using the specified format
        String sampleDate = "2023-08-03";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date expectedDate;
        try {
            expectedDate = dateFormat.parse(sampleDate);
        } catch (Exception e) {
            throw new RuntimeException("Error parsing sample date");
        }

        salesVo.setStartTime(expectedDate);
        Date actualStartDate = salesVo.getStartTime();

        assertNotNull(actualStartDate, "Start date should not be null");
        assertEquals(expectedDate, actualStartDate, "Start date does not match expected date");
    }
    @Test
    public void testSalesVoInitialization() {
        // 实例化 SalesVo 对象
        SalesVo salesVo = new SalesVo();

        // 验证属性初始化是否正确
        assertNotNull(salesVo);
        assertEquals(1, salesVo.getPage(), "Default page should be 1");
        assertEquals(10, salesVo.getLimit(), "Default limit should be 10");
    }

}
