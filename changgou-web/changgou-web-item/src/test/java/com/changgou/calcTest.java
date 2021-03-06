package com.changgou;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import org.assertj.core.util.DateUtil;
import org.junit.Test;

/**
 * @Description
 * @Author tangKai
 * @E-mail tangkai@qingzu.com.cn
 * @Date 16:00 2020/4/11
 **/
public class calcTest {

    @Test
    public void t1() {
        int random = new Random().nextInt(4);
        System.out.println(random);
    }


    @Test
    public void big() {
        String s1 = "2020-01-12 12:00:00";
        String s2 = "2020-01-13 12:00:00";

        Date d1 = DateUtil.parse(s1);
        Date d2 = DateUtil.parse(s2);
        int bound = 3;
        if (d1.before(d2)) {
            bound = 2;
        }

        int sum = 1 + bound;
        System.out.println(sum + bound);
    }

    @Test
    public void before() throws ParseException {
        String s1 = "2020-01-12 12:00:00";
        String s2 = "2020-01-12 12:20:00";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = simpleDateFormat.parse(s1);
        Date d2 = simpleDateFormat.parse(s2);

//        Date d1 = DateUtil.parse(s1);
//        Date d2 = DateUtil.parse(s2);

        System.out.println("d1" + d1);
        System.out.println("d2" + d2);

        if (d1.before(d2)) {
            System.out.println(true);
        }
    }

    @Test
    public void testEncoder() throws Exception{
        String msg = "www.itheima.com";
        // 编码
        byte[] encode = Base64.getEncoder().encode(msg.getBytes("UTF-8"));
        String encodeMsg = new String(encode, "UTF-8");
        System.out.println("编码后：" + encodeMsg);
        // 解码
        byte[] decode = Base64.getDecoder().decode(encode);
        String decodeMsg = new String(decode, "UTF-8");
        System.out.println("解码后：" + decodeMsg);
    }

}
