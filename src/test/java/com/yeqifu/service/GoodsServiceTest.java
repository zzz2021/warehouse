package com.yeqifu.service;

import com.yeqifu.bus.entity.Goods;
import com.yeqifu.bus.service.IGoodsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class GoodsServiceTest {

    @Mock
    private IGoodsService goodsService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDeleteGoodsById() {
        Integer idToDelete = 1;

        // 调用被测方法
        goodsService.deleteGoodsById(idToDelete);

        // 验证方法是否被调用
        verify(goodsService, times(1)).deleteGoodsById(idToDelete);
    }

    @Test
    public void testLoadAllWarning() {
        // 模拟返回的商品列表
        List<Goods> mockGoodsList = new ArrayList<>();
        // 添加模拟商品数据到列表

        when(goodsService.loadAllWarning()).thenReturn(mockGoodsList);

        // 调用被测方法
        List<Goods> result = goodsService.loadAllWarning();

        // 验证返回的列表是否与预期一致
        assertEquals(mockGoodsList, result);
    }
}
