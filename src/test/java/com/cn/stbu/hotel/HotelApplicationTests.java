package com.cn.stbu.hotel;

import com.cn.stbu.hotel.domain.Amount;
import com.cn.stbu.hotel.domain.User;
import com.cn.stbu.hotel.mapper.AmountMapper;
import com.cn.stbu.hotel.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HotelApplicationTests {


    @Autowired
    AmountMapper amountMapper;
    @Autowired
    UserMapper userMapper;
    @Test
    public void contextLoads() {
        List<Amount> amountList = amountMapper.getAmountList();
        System.out.println(amountList.get(0));

        int i = amountMapper.addAmount(new Amount(1, 1110.1, 12.20));
        System.out.println("新增账单数"+i);
    }

    @Test
    public void testUser(){
        //查询
//        User zhaosi = userMapper.getUserByUsername("zhaosi");
//        System.out.println(zhaosi.getRealName());

        //增加
        int i = userMapper.addUser(new User("hxd", "123", "何旭东",
                22, 1, "aaaa", "aaaa", "1306000", "中国四川"));
        if(i==1)System.out.println("成功");
    }



}
