package com.adjh.sprsecurity.model.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeUtil {

    /**
     * [공통함수] DATE 타입을 UTC_OFFSET 적용하여 변경하는 함수
     * @param orgDate {Date}
     * @param tzNm {String}
     * @return {String}
     */
    public static String convertDateToUTF(Date orgDate, String tzNm) {
        String result = "";
        TimeZone timeZone = TimeZone.getTimeZone(tzNm);
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        dateformat.setTimeZone(timeZone);
        result = dateformat.format(orgDate);
        return result;
    }
}
