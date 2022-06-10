package com.son.yj.chapter8.item49;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * 오류는 가능한 한 빨리 (발생한 곳에서) 잡아야 한다. !!!
 * 메서드나 생성자를 작성할 때면 그 매개변수들에 어떤 제약이 있을지 생각해야 한다. 그 제약들을 무서화하고 메서드 코드 시작 부분에서 명시적으로 검사해야 한다.
 * 이런 습관을 반드시 기르도록 하자. 그 노력은 유효성 검사가 실제 오류를 처음 걸러낼 때 충분히 보상받을 것이다. !!
 * 
 * @name Test
 * @author eseict
 * @version 1.0.0
 * @since 2022-06-08 오전 8:31
*/
public class Test {

    public static void main(String[] args) {

        nullTest(null);

        LocalDateTime.now();
        ZonedDateTime.now();


    }

    public static void nullTest(String test){
        Objects.requireNonNull(test, "check ?");


    }

    /**
     *
     * 
     * @name : mod
     * @author : eseict
     * @since : 2022-06-08 오전 8:31
     * @param m java.math.BigInteger
     * @return  java.math.BigInteger
     * @throws
     */
    public BigInteger mod(BigInteger m) {

        if (m.signum() <= 0 ) {
            throw new ArithmeticException("계수는 양수여야 합니다. "+ m);
        }

        return new BigInteger(String.valueOf(m.intValue()%2));
    }

}
