package com.yeqifu.service;

import com.yeqifu.bus.entity.Inport;
import com.yeqifu.bus.mapper.GoodsMapper;
import com.yeqifu.bus.service.impl.InportServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;
@SpringBootTest
public class InportServiceTest {

    @Mock
    private InportServiceImpl inportService;
    private GoodsMapper goodsMapper;

    @Test
    public void testSaveInport() {
        Inport inport = new Inport ();
        inport.setId(15);
        inport.setNumber(500);
        inport.setGoodsid(1);
        inport.setPaytype("支付宝");
        inport.setInportprice(6.5);
        inport.setProviderid(1);

        boolean flag = inportService.save(inport);

        assertEquals(false,flag);

    }
    @Test
    public void testUpdate() {

        Inport inport = new Inport ();
        inport.setId(15);
        inport.setNumber(500);
        inport.setGoodsid(1);
        inport.setPaytype("支付宝");
        inport.setInportprice(6.5);
        inport.setProviderid(1);

        boolean flag = inportService.updateById(inport);

        assertEquals(false,flag);
    }

    @Test
    public void testRemoveInport() {

        boolean flag = inportService.removeById(12);

        assertEquals(false,flag);
    }
}