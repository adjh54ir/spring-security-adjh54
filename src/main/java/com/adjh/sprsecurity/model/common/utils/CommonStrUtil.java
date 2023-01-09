package com.adjh.sprsecurity.model.common.utils;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/**
 * 문자열 관련 공통 유틸
 */
public class CommonStrUtil {

    private static int rIndex;

    /**
     * [공통함수] Object 타입의 빈 값 체크 유틸
     *
     * @param obj {Object} 체크 할 Object
     * @return {boolean} true(빈값) / false(빈값이 아님)
     */
    public static boolean isEmpty(Object obj) {
        if (obj == null) {
            return true;
        }
        if ((obj instanceof String) && (((String) obj).trim().length() == 0)) {
            return true;
        }
        if (obj instanceof Map) {
            return ((Map<?, ?>) obj).isEmpty();
        }
        if (obj instanceof List) {
            return ((List<?>) obj).isEmpty();
        }
        if (obj instanceof Object[]) {
            return (((Object[]) obj).length == 0);
        }
        return false;
    }

    /**
     * [공통함수] UUID 생성 함수
     *
     * @param isHyphen {boolean} 하이픈 사용 여부
     * @return {string} UUID 값 반환
     */
    public static String makeUUID(boolean isHyphen) {
        String result = "";
        if (isHyphen) {
            result = UUID.randomUUID().toString();
        } else {
            result = UUID.randomUUID().toString().replace("-", "");
        }
        return result;
    }

    /**
     * [공통함수] 숫자 + 대문자 조합의 랜덤 문자열 반환 함수
     *
     * @param digit {int} 랜덤 문자열 길이
     * @return {String} 랜덤 문자열 반환
     */
    public static String makeRandomStr(int digit) {
        StringBuffer value = new StringBuffer();
        Random rnd = new Random();
        for (int i = 0; i < digit; i++) {
            int rIndex = rnd.nextInt(2);
            switch (rIndex) {
                case 0:
                    // A-Z
                    value.append((char) ((int) (rnd.nextInt(26)) + 65));
                    break;
                case 1:
                    // 0-9
                    value.append((rnd.nextInt(10)));
                    break;
            }
        }
        return value.toString();
    }


}
