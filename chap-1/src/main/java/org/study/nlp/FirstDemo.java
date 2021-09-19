package org.study.nlp;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;

import java.util.List;

public class FirstDemo {

    public static void main(String[] args) {
        List<Term> terms = HanLP.segment("你好，欢迎使用HanLP汉语处理包！");
        System.out.println(terms);
    }
}
