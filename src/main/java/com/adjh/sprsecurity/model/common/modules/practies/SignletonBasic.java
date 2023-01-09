package com.adjh.sprsecurity.model.common.modules.practies;

import lombok.extern.slf4j.Slf4j;

/**
 * 싱글턴 패턴을 연습하기 위한 모듈
 */
@Slf4j
public class SignletonBasic {

    private static final SignletonBasic instance = new SignletonBasic();

    // 해당 생성자는 외부에서 호출이 불가능하게 private 접근 제한자로 지정해야 한다.
    private SignletonBasic() {
        //
    }

    public static SignletonBasic getInstance() {
        return instance;
    }

    public void say() {
        log.debug("안녕하세요");
    }

}
