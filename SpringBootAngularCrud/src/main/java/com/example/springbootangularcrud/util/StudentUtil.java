package com.example.springbootangularcrud.util;

import com.example.springbootangularcrud.model.Student;

public interface StudentUtil {
    public static void calculateDtls(Student s) {

        //calculations
        //jdk 10 feature localvariable type inference(best suitable variable type is taken by compiler
        var fee = s.getStdFee();
        var disc = fee * 10 / 100.0;
        var gst = fee * 12 / 100.0;
        s.setStdFeeDisc(disc);
        s.setStdFeeGst(gst);
    }
}
