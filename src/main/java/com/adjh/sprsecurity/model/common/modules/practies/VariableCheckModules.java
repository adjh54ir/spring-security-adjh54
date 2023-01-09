package com.adjh.sprsecurity.model.common.modules.practies;

import lombok.extern.slf4j.Slf4j;

/**
 * 해당 모듈의 경우 클래스 변수와 인스턴스 변수를 테스트 하기 위한 용도로 사용되는 모듈을 의미합니다.
 */
@Slf4j
public class VariableCheckModules {

    /**
     *
     */
    public static class UseVariable {
        static String staticVariable = "STATIC";
        String instanceVariable = "INSTANCE";
    }

    /**
     * @param args String[]
     */
    public static void main(String[] args) {
        UseVariable useVariable = new UseVariable();
        log.debug("클래스 변수 ::" + UseVariable.staticVariable);
        log.debug("인스턴스 변수 ::" + useVariable.instanceVariable);
        SignletonBasic.getInstance().say();
    }


}
